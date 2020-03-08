/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.CRUD;

import Business.Config.Config;
import Comuns.Enums.TipoRepositorio;
import Console.EstadoConsole.EnumEstadoConsole;
import Console.EstadoConsole.MaquinaEstadoConsole;


/**
 *
 * @author gabriell
 */
public class CRUD {

    public static MaquinaEstadoConsole estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Config.getInstance().setDatabase(TipoRepositorio.MYSQL);
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        Boolean saida = false;
        while (!saida){
            saida = estadoConsole.Executa();
        }
    }
}
