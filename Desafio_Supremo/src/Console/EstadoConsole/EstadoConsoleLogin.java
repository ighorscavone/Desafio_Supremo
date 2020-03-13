/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Console.EstadoConsole;

import Business.Acesso.Acesso;
import Comuns.Acesso.Usuario; // AQUI TINHA UM .VOS ANTES DO ".CONTEUDO", SE DER ALGUMA COISA PODE SER ISSO
import desafio_supremo.Desafio_Supremo;
import java.util.Scanner;

/**
 *
 * @author gabriell
 */
public class EstadoConsoleLogin extends MaquinaEstadoConsole {

    @Override
    public boolean Executa() {
        boolean sair = false;
        Usuario user = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("**** LOGIN ****");
        System.out.println("Digite seu usuário");
        user.setLogin(scan.nextLine());
        System.out.println("Digite sua senha");
        user.setSenha(scan.nextLine());
        // TODO - Validação de senha
        Acesso acesso = new Acesso();
        boolean usuarioValido = acesso.validaUsuario(user.getLogin());
        boolean senhaValida = acesso.validaSenha(user.getSenha());
        if (senhaValida && usuarioValido)
            Desafio_Supremo.estadoConsole = EnumEstadoConsole.MENU_PRINCIPAL.getEstadoMaquina();
        else {
            System.out.println("Dados inválidos!");
        }            
        return sair;
    }
}
