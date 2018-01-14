package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelCidade;
import model.ModelCliente;
import model.ModelClienteCidadeEstado;
import model.ModelEstado;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class DAOClienteCidadeEstado extends ConexaoMySql {

    /**
     * recupera uma lista de CidadeEstado return ArrayList
     */
    public ArrayList<ModelClienteCidadeEstado> getListaClienteCidadeEstadoDAO() {
        ArrayList<ModelClienteCidadeEstado> listaModelClienteCidadeEstados = new ArrayList();
        ModelClienteCidadeEstado modelClienteCidadeEstado = new ModelClienteCidadeEstado();
        ModelCliente modelCliente = new ModelCliente();
        ModelCidade modelCidade = new ModelCidade();
        ModelEstado modelEstado = new ModelEstado();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "cidade.codigo,"
                    + "cidade.nome,"
                    + "cidade.fk_cod_estado,"
                    + "estado.codigo,"
                    + "estado.uf,"
                    + "estado.nome,"
                    + "clientes.codigo, "
                    + "clientes.nome, "
                    + "clientes.endereco, "
                    + "clientes.bairro, "
                    + "clientes.cod_cidade, "
                    + "clientes.cod_estado, "
                    + "clientes.cep, "
                    + "clientes.telefone "
                    + " FROM"
                    + " cidade inner join estado on estado.codigo = cidade.fk_cod_estado "
                    + " inner join clientes on cidade.codigo = clientes.cod_cidade"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCidade = new ModelCidade();
                modelEstado = new ModelEstado();
                modelCliente = new ModelCliente();
                modelClienteCidadeEstado = new ModelClienteCidadeEstado();
                modelCidade.setCodigo(this.getResultSet().getInt(1));
                modelCidade.setNome(this.getResultSet().getString(2));
                modelCidade.setFk_cod_estado(this.getResultSet().getInt(3));
                modelEstado.setCodigo(this.getResultSet().getInt(4));
                modelEstado.setUf(this.getResultSet().getString(5));
                modelEstado.setNome(this.getResultSet().getString(6));
                modelCliente.setCodigo(this.getResultSet().getInt(7));
                modelCliente.setNome(this.getResultSet().getString(8));
                modelCliente.setEndereco(this.getResultSet().getString(9));
                modelCliente.setBairro(this.getResultSet().getString(10));
                modelCliente.setCodCidade(this.getResultSet().getInt(11));
                modelCliente.setCodEstado(this.getResultSet().getInt(12));
                modelCliente.setCep(this.getResultSet().getString(13));
                modelCliente.setTelefone(this.getResultSet().getString(14));

                modelClienteCidadeEstado.setModelCidade(modelCidade);
                modelClienteCidadeEstado.setModelEstado(modelEstado);
                modelClienteCidadeEstado.setModelCliente(modelCliente);

                listaModelClienteCidadeEstados.add(modelClienteCidadeEstado);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaModelClienteCidadeEstados;
    }

}
