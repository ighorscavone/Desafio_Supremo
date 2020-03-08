/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.Basis;

import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Acesso.Usuario; // AQUI TINHA UM .VOS ANTES DO ".CONTEUDO", SE DER ALGUMA COISA PODE SER ISSO
import Comuns.Conteudo.Pedido; // AQUI TINHA UM .VOS ANTES DO ".CONTEUDO", SE DER ALGUMA COISA PODE SER ISSO

/**
 *
 * @author gabriell
 */
public class FabricaEntidades {
    
    public static Entidade Fabrica(EntidadesDisponiveis enumEntidade) {
        Entidade retorno;
        switch (enumEntidade)
        {
            case USUARIO:
                retorno = new Usuario();
                break;
            case PEDIDO:
                retorno = new Pedido();
                break;
            default:
                retorno = new Entidade();
                break;
        }
        return retorno;
    }
}
