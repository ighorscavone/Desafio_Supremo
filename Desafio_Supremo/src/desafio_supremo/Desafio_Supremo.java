/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio_supremo;
import Console.EstadoConsole.EnumEstadoConsole;
import Console.EstadoConsole.EstadoConsoleBemVindo;
import Console.EstadoConsole.EstadoConsoleLogin;
import Console.EstadoConsole.EstadoConsoleMenuPrincipal;
import Console.EstadoConsole.MaquinaEstadoConsole;

/**
 *
 * @author 082170011
 * @author 081180041
 */
public class Desafio_Supremo {
    public static MaquinaEstadoConsole estadoConsole;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
        boolean sair = false;
        
        while(!sair){
            sair = estadoConsole.Executa();
        }
        
    }
    
}
