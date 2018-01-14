package DAO;

import conexoes.ConexaoMySql;
import model.ModelCliente;
import java.util.ArrayList;

/**
 *
 * @author Edivan www.vegasconsultoria.com.br Venda de software e código fonte
 */
public class DAOCliente extends ConexaoMySql {

    /**
     * grava Cliente
     *
     * @param pModelCliente return int
     */
    public int salvarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO clientes ("
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "email,"
                    + "cpf"
                    + ") VALUES ("
                    + "'" + pModelCliente.getNome() + "',"
                    + "'" + pModelCliente.getEndereco() + "',"
                    + "'" + pModelCliente.getBairro() + "',"
                    + "'" + pModelCliente.getCodCidade() + "',"
                    + "'" + pModelCliente.getCodEstado() + "',"
                    + "'" + pModelCliente.getCep() + "',"
                    + "'" + pModelCliente.getTelefone() + "',"
                    + "'" + pModelCliente.getEmail() + "',"
                    + "'" + pModelCliente.getCPF() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera Cliente
     *
     * @param pCodigo return ModelCliente
     */
    public ModelCliente getClienteDAO(int pCodigo) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "email,"
                    + "cpf"
                    + " FROM"
                    + " clientes"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCodCidade(this.getResultSet().getInt(5));
                modelCliente.setCodEstado(this.getResultSet().getInt(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
                modelCliente.setEmail(this.getResultSet().getString(9));
                modelCliente.setCPF(this.getResultSet().getString(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera Cliente
     *
     * @param pNome return ModelCliente
     */
    public ModelCliente getClienteDAO(String pNome) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "email,"
                    + "cpf"
                    + " FROM"
                    + " clientes"
                    + " WHERE"
                    + " nome = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCodCidade(this.getResultSet().getInt(5));
                modelCliente.setCodEstado(this.getResultSet().getInt(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
                modelCliente.setEmail(this.getResultSet().getString(9));
                modelCliente.setCPF(this.getResultSet().getString(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
     * recupera uma lista de Cliente return ArrayList
     */
    public ArrayList<ModelCliente> getListaClienteDAO() {
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "nome,"
                    + "endereco,"
                    + "bairro,"
                    + "cod_cidade,"
                    + "cod_estado,"
                    + "cep,"
                    + "telefone,"
                    + "email,"
                    + "cpf"
                    + " FROM"
                    + " clientes"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCliente = new ModelCliente();
                modelCliente.setCodigo(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                modelCliente.setEndereco(this.getResultSet().getString(3));
                modelCliente.setBairro(this.getResultSet().getString(4));
                modelCliente.setCodCidade(this.getResultSet().getInt(5));
                modelCliente.setCodEstado(this.getResultSet().getInt(6));
                modelCliente.setCep(this.getResultSet().getString(7));
                modelCliente.setTelefone(this.getResultSet().getString(8));
                modelCliente.setEmail(this.getResultSet().getString(9));
                modelCliente.setCPF(this.getResultSet().getString(10));
                listamodelCliente.add(modelCliente);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
     * atualiza Cliente
     *
     * @param pModelCliente return boolean
     */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE clientes SET "
                    + "codigo = '" + pModelCliente.getCodigo() + "',"
                    + "nome = '" + pModelCliente.getNome() + "',"
                    + "endereco = '" + pModelCliente.getEndereco() + "',"
                    + "bairro = '" + pModelCliente.getBairro() + "',"
                    + "cod_cidade = '" + pModelCliente.getCodCidade() + "',"
                    + "cod_estado = '" + pModelCliente.getCodEstado() + "',"
                    + "cep = '" + pModelCliente.getCep() + "',"
                    + "telefone = '" + pModelCliente.getTelefone() + "',"
                    + "email = '" + pModelCliente.getEmail() + "',"
                    + "cpf = '" + pModelCliente.getCPF() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelCliente.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Cliente
     *
     * @param pCodigo return boolean
     */
    public boolean excluirClienteDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM clientes "
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
