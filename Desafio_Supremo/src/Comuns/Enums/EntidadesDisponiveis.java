/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comuns.Enums;

/**
 *
 * @author 082170011
 */
public enum EntidadesDisponiveis {
    
    USUARIO("usuario"),
    PRODUTO("produto"),
    PEDIDO("pedido"),
    FUNCIONARIO("funcionario"),
    CLIENTE("cliente");
    
    private String descricao;
    
    EntidadesDisponiveis(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    
}
