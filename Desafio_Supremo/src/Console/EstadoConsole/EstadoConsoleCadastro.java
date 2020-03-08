/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.EstadoConsole;
import Comuns.Acesso.Usuario;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ighor
 */
public class EstadoConsoleCadastro extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
       boolean sair = false;
       Usuario user = new Usuario();
       Scanner scan = new Scanner(System.in);
       System.out.println("**** CADASTRO DE USUÁRIOS ****");
       System.out.println("Digite o usuário desejado");
       user.setLogin(scan.nextLine());
       System.out.println("Digite a senha desejada");
       user.setSenha(scan.nextLine());
       System.out.println("Digite o tipo de usuário (1-GERENTE | 2-VENDEDOR)");
       user.setTipoLogin(scan.nextInt());
       FileWriter arq;
        try {
            arq = new FileWriter("Funcionario.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(user.getLogin() + "|" + user.getSenha() + "|" + user.getTipoLogin() + "|");
            gravarArq.flush();
            gravarArq.close();
            arq.close();
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return sair;
    }
    
}
