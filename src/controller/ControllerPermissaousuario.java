package controller;

import model.ModelPermissaousuario;
import DAO.DAOPermissaousuario;
import java.util.ArrayList;

/**
 *
 * @author Edivan Desenvolvimento de Sistemas
 */
public class ControllerPermissaousuario {

    private DAOPermissaousuario daoPermissaousuario = new DAOPermissaousuario();

    /**
     * grava Permissaousuario
     *
     * @param pModelPermissaousuario return int
     */
    public int salvarPermissaousuarioController(ModelPermissaousuario pModelPermissaousuario) {
        return this.daoPermissaousuario.salvarPermissaousuarioDAO(pModelPermissaousuario);
    }

    /**
     * recupera Permissaousuario
     *
     * @param pCodigo return ModelPermissaousuario
     */
    public ModelPermissaousuario getPermissaousuarioController(int pCodigo) {
        return this.daoPermissaousuario.getPermissaousuarioDAO(pCodigo);
    }

    /**
     * recupera uma lista dePermissaousuario
     *
     * @param pCodigo return ArrayList
     */
    public ArrayList<ModelPermissaousuario> getListaPermissaousuarioController() {
        return this.daoPermissaousuario.getListaPermissaousuarioDAO();
    }

    /**
     * atualiza Permissaousuario
     *
     * @param pModelPermissaousuario return boolean
     */
    public boolean atualizarPermissaousuarioController(ModelPermissaousuario pModelPermissaousuario) {
        return this.daoPermissaousuario.atualizarPermissaousuarioDAO(pModelPermissaousuario);
    }

    /**
     * exclui Permissaousuario
     *
     * @param pCodigo return boolean
     */
    public boolean excluirPermissaousuarioController(int pCodigo) {
        return this.daoPermissaousuario.excluirPermissaousuarioDAO(pCodigo);
    }

    /**
     * RETORNAR LISTA DE PREMISSAOES DO USUARIO
     *
     * @param pCodigo
     * @return
     */
    public ArrayList<ModelPermissaousuario> getListaPermissaousuarioController(int pCodigo) {
        return this.daoPermissaousuario.getListaPermissaousuarioDAO(pCodigo);
    }
}
