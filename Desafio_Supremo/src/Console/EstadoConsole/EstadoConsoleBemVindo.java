/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.EstadoConsole;

import Console.CRUD.CRUD;
import java.util.Scanner;
import desafio_supremo.Desafio_Supremo;


/**
 *
 * @author gabriell
 */
public class EstadoConsoleBemVindo extends MaquinaEstadoConsole{

    @Override
    public boolean Executa() {
        boolean sair = false;
        System.out.println("Bem-vindo!");
        System.out.println("Indique a opção desejada!");
        System.out.println("0 - Sair");
        System.out.println("1 - Login");
        System.out.println("2 - Cadastrar Usuário");
        Scanner scan = new Scanner(System.in);
        int opcao = scan.nextInt();
        switch (opcao)
        {
            case 0:
                sair = true;
                break;
            case 1:
                Desafio_Supremo.estadoConsole = EnumEstadoConsole.LOGIN.getEstadoMaquina();
                break;
            case 2:
                Desafio_Supremo.estadoConsole = EnumEstadoConsole.CADASTRO.getEstadoMaquina();
                break;
              
        }
        return sair;
    }
}
