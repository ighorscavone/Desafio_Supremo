/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Acesso;

import Business.Basis.FabricaRepositorio;
import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Acesso.Usuario;
import Console.EstadoConsole.EstadoConsoleCadastro;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabriell
 */
public class Acesso {
    
    
       
    public boolean validaSenha(String senhaDigitada){
        try {
            BufferedReader validador = new BufferedReader(new FileReader("Funcionario.txt"));
            boolean flag = true;
            String line;
            while((line=validador.readLine())!= null && flag == true)
            {
                String coisas[] = line.split("\\|");
                if(senhaDigitada.equals(coisas[1])){
                    flag = false;
                    return true;            
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean validaUsuario(String user) {
        try {
            BufferedReader validador = new BufferedReader(new FileReader("Funcionario.txt"));
            boolean flag = true;
            String line;
            while((line=validador.readLine())!= null && flag == true)
            {
                String coisas[] = line.split("\\|");
                if(user.equals(coisas[0])){
                    flag = false;
                    return true;            
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public int GetTipoUser(String tipo){
        try {
            BufferedReader validador = new BufferedReader(new FileReader("Funcionario.txt"));
            boolean flag = true;
            String line;
            while((line=validador.readLine())!= null && flag == true)
            {
                String coisas[] = line.split("\\|");
                if(tipo.equals(coisas[2])){
                    if(Integer.getInteger(tipo) == 1){
                        return 1;
                    }
                    else{
                        return 2;
                    }           
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EstadoConsoleCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
}
