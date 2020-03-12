/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.EstadoConsole;
import Comuns.Acesso.Usuario;
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
       boolean sairaux = false;
       Usuario user = new Usuario();
       Scanner scan = new Scanner(System.in);
       do{
        System.out.println("**** CADASTRO DE USUÁRIOS ****");
        System.out.println("Digite o usuário desejado");
        user.setLogin(scan.nextLine());
        System.out.println("Digite a senha desejada");
        user.setSenha(scan.nextLine());
        
        
        boolean flagtipo = false;
        do{
            System.out.println("Digite o tipo de usuário (1-GERENTE | 2-VENDEDOR)");
            int repos1 = scan.nextInt();
            if(repos1 == 1 || repos1 == 2)
            {
                user.setTipoLogin(repos1);
                flagtipo = true;
            }
            else
            {
                System.out.println("TIPO INVÁLIDO");
            }
        }
        while(flagtipo == false);
        
        
        File arquivo = new File("Funcionario.txt"); 
        if(arquivo.exists())
        {

        try {
            BufferedReader validador = new BufferedReader(new FileReader("Funcionario.txt"));
            boolean flag = true;
            while(flag == true)
            {
                String texto = validador.readLine();
                String coisas[] = texto.split("|");
                if(user.getLogin() == coisas[0]){
                    System.out.println("Usuário já existente");
                    flag = false;
                    sair = true;
                    return sair;
                }
                    
                else if(texto.equals(null)){
                    sairaux = true;
                    flag = false;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        else{
            sairaux = true;
        }
        
        
       }
       while(sairaux == false);
       
       
       String newLine = System.getProperty("line.separator");
        try {
            BufferedWriter funx = new BufferedWriter(new FileWriter("Funcionario.txt",true));
            funx.write(user.getLogin() + "|" + user.getSenha() + "|" + user.getTipoLogin() + "|" + newLine);
            sair = true;
            funx.close();
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return sair;
    }
    
}
