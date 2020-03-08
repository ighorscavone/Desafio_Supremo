/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Basis;

import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Enums.TipoRepositorio;
import Comuns.Acesso.Usuario; // AQUI TINHA UM .VOS ANTES DO ".CONTEUDO", SE DER ALGUMA COISA PODE SER ISSO
import DAO.Acesso.UsuarioMySQLDAO;
import DAO.Acesso.UsuarioTextoDAO;

/**
 *
 * @author gabriell
 */
public class FabricaDAOs {
    
    public static DAO Fabrica(EntidadesDisponiveis enumEntidade, TipoRepositorio repositorio) {
        switch (repositorio)
        {
            case TEXTO:
                return montaDAOTexto(enumEntidade);
            case MYSQL:
                return montaDAOMySQL(enumEntidade);
            default:
                return null;
        }
       
    }

    private static DAO montaDAOTexto(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioTextoDAO();
                break;            
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
    private static DAO montaDAOMySQL(EntidadesDisponiveis enumEntidade) {
        DAO retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new UsuarioMySQLDAO();
                break;            
            default:
                retorno = null;
                break;
        }
        return retorno;    
    }
    
}
