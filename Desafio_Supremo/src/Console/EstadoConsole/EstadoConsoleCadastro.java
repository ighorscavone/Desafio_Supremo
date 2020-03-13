/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.EstadoConsole;
import Comuns.Acesso.Usuario;
import desafio_supremo.Desafio_Supremo;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
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
            int repos1 = scan.nextInt();
            if(repos1 == 1 || repos1 == 2)
            {
                user.setTipoLogin(repos1);
            }
            else
            {
                System.out.println("TIPO INVÁLIDO");              
                return sair;
            }
        
        
        File arquivo = new File("Funcionario.txt"); 
        if(arquivo.exists())
        {

        try {
            BufferedReader validador = new BufferedReader(new FileReader("Funcionario.txt"));
            boolean flag = true;
            String line;
            while((line=validador.readLine())!= null && flag == true)
            {
                String coisas[] = line.split("\\|");
                if(user.getLogin().equals(coisas[0])){
                    System.out.println("Usuário já existente");
                    flag = false;
                    return sair;            
                }

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
       
       
       String newLine = System.getProperty("line.separator");
        try {
            BufferedWriter funx = new BufferedWriter(new FileWriter("Funcionario.txt",true));
            funx.write(user.getLogin() + "|" + user.getSenha() + "|" + user.getTipoLogin() + newLine);
            funx.close();
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       Desafio_Supremo.estadoConsole = EnumEstadoConsole.BEM_VINDO.getEstadoMaquina();
       return sair;
    }
    
}
