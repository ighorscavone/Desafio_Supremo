/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Repositorio.Basis;
import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Basis.Entidade;

/**
 *
 * @author gabriell
 */
public abstract class Repositorio {
    public abstract Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade);
    public abstract Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade);
}
