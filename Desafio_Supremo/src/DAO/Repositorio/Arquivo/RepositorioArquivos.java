/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Repositorio.Arquivo;

import Comuns.Enums.EntidadesDisponiveis;
import Comuns.Enums.TipoRepositorio;
import Comuns.Basis.Entidade;
import DAO.Basis.DAO;
import DAO.Basis.FabricaDAOs;
import DAO.Repositorio.Basis.Repositorio;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author gabriell
 */
public class RepositorioArquivos extends Repositorio{

    @Override
    public Entidade seleciona(int id, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = dao.seleciona(id);
        return entidade;
    }

    @Override
    public Entidade localiza(String codigo, EntidadesDisponiveis tipoEntidade) {
        DAO dao = FabricaDAOs.Fabrica(tipoEntidade, TipoRepositorio.TEXTO);
        Entidade entidade = null;
        try {
            entidade = dao.localiza(codigo);
        } catch (SQLException ex) {
            Logger.getLogger(RepositorioArquivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entidade;
    }

  
    
}
