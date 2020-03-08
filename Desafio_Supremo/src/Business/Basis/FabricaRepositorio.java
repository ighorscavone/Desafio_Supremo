/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Basis;

import Business.Config.Config;
import Comuns.Enums.TipoRepositorio;
import DAO.Repositorio.MySQL.RepositorioMySQL;
import DAO.Repositorio.Arquivo.RepositorioArquivos;
import DAO.Repositorio.Basis.Repositorio;


/**
 *
 * @author gabriell
 */
public class  FabricaRepositorio {

    public static Repositorio Fabrica() {
        if (Config.getInstance().getTipoRepositorio() == TipoRepositorio.MYSQL)
            return new RepositorioMySQL();
        else
            return new RepositorioArquivos();
    }
}
