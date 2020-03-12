/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Acesso;

import Business.Basis.FabricaRepositorio;
import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Acesso.Usuario;
import DAO.Repositorio.Basis.Repositorio;
import java.io.FileReader;

/**
 *
 * @author gabriell
 */
public class Acesso {
    
    private boolean validaSenha(String senhaRepositorio, String senhaDigitada){
        return (senhaRepositorio.equals(senhaDigitada)); 
    }
    
    public boolean validaUsuario(Usuario user) {
        boolean retorno = false;
        Repositorio repositorio = FabricaRepositorio.Fabrica();        
        Usuario usuario = (Usuario)repositorio.localiza(user.getLogin(), EntidadesDisponiveis.USUARIO);
        if (usuario != null)
        {
            retorno = validaSenha(usuario.getSenha(), user.getSenha());
        }
        return retorno;
    }
}
