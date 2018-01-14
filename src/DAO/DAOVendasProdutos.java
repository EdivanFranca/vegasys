package DAO;

import model.ModelVendasProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class DAOVendasProdutos extends ConexaoMySql {

    /**
     * grava VendasProdutos
     *
     * @param pModelVendasProdutos return int
     */
    public int salvarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO vendas_produto ("
                    + "codigo,"
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade"
                    + ") VALUES ("
                    + "'" + pModelVendasProdutos.getCodigo() + "',"
                    + "'" + pModelVendasProdutos.getCodigo_produto() + "',"
                    + "'" + pModelVendasProdutos.getCodigo_venda() + "',"
                    + "'" + pModelVendasProdutos.getQuantidade() + "'"
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
     * recupera VendasProdutos
     *
     * @param pCodigo return ModelVendasProdutos
     */
    public ModelVendasProdutos getVendasProdutosDAO(int pCodigo) {
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade"
                    + " FROM"
                    + " vendas_produto"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos.setCodigo(this.getResultSet().getInt(1));
                modelVendasProdutos.setCodigo_produto(this.getResultSet().getInt(2));
                modelVendasProdutos.setCodigo_venda(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidade(this.getResultSet().getFloat(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
     * recupera uma lista de VendasProdutos return ArrayList
     */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO() {
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade"
                    + " FROM"
                    + " vendas_produto"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setCodigo(this.getResultSet().getInt(1));
                modelVendasProdutos.setCodigo_produto(this.getResultSet().getInt(2));
                modelVendasProdutos.setCodigo_venda(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidade(this.getResultSet().getFloat(4));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
     * atualiza VendasProdutos
     *
     * @param pModelVendasProdutos return boolean
     */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE vendas_produto SET "
                    + "codigo = '" + pModelVendasProdutos.getCodigo() + "',"
                    + "codigo_produto = '" + pModelVendasProdutos.getCodigo_produto() + "',"
                    + "codigo_venda = '" + pModelVendasProdutos.getCodigo_venda() + "',"
                    + "quantidade = '" + pModelVendasProdutos.getQuantidade() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelVendasProdutos.getCodigo() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui VendasProdutos
     *
     * @param pCodigo return boolean
     */
    public boolean excluirVendasProdutosDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM vendas_produto "
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

    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(int pCodigoVenda) {
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_produto,"
                    + "codigo_venda,"
                    + "quantidade"
                    + " FROM"
                    + " vendas_produto WHERE codigo_venda = '" + pCodigoVenda + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setCodigo(this.getResultSet().getInt(1));
                modelVendasProdutos.setCodigo_produto(this.getResultSet().getInt(2));
                modelVendasProdutos.setCodigo_venda(this.getResultSet().getInt(3));
                modelVendasProdutos.setQuantidade(this.getResultSet().getFloat(4));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }
}
