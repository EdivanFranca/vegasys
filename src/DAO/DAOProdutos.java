package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;
import java.util.ArrayList;

/**
 *
 * @author BLSoft www.Blsoft.com.br Venda de software e código fonte
 */
public class DAOProdutos extends ConexaoMySql {

    /**
     * grava Produtos
     *
     * @param pModelProdutos return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO produtos ("
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque,"
                    + "grupo,"
                    + "pis,"
                    + "icms,"
                    + "ipi,"
                    + "custo,"
                    + "target,"
                    + "p_atacado,"
                    + "p_varejo"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "'" + pModelProdutos.getNome() + "',"
                    + "'" + pModelProdutos.getValor() + "',"
                    + "'" + pModelProdutos.getCodigoBarras() + "',"
                    + "'" + pModelProdutos.getEstoque() + "',"
                    + "'" + pModelProdutos.getGrupo() + "',"
                    + "'" + pModelProdutos.getPIS() + "',"
                    + "'" + pModelProdutos.getICMS() + "',"
                    + "'" + pModelProdutos.getIPI() + "',"
                    + "'" + pModelProdutos.getCusto() + "',"
                    + "'" + pModelProdutos.getTarget() + "',"
                    + "'" + pModelProdutos.getPrecoAtacado() + "',"
                    + "'" + pModelProdutos.getPrecoVarejo() + "'"
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
     * recupera Produtos
     *
     * @param pCodigo return ModelProdutos
     */
    public ModelProdutos getProdutosDAO(int pCodigo) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque,"
                    + "grupo,"
                    + "pis,"
                    + "icms,"
                    + "ipi,"
                    + "custo,"
                    + "target,"
                    + "p_atacado,"
                    + "p_varejo"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getFloat(6));
                modelProdutos.setGrupo(this.getResultSet().getString(7));
                modelProdutos.setPIS(this.getResultSet().getDouble(8));
                modelProdutos.setICMS(this.getResultSet().getDouble(9));
                modelProdutos.setIPI(this.getResultSet().getDouble(10));
                modelProdutos.setCusto(this.getResultSet().getDouble(11));
                modelProdutos.setTarget(this.getResultSet().getDouble(12));
                modelProdutos.setPrecoAtacado(this.getResultSet().getDouble(13));
                modelProdutos.setPrecoVarejo(this.getResultSet().getDouble(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * recupera Produtos
     *
     * @param pNome return ModelProdutos
     */
    public ModelProdutos getProdutosDAO(String pNome) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque,"
                    + "grupo,"
                    + "pis,"
                    + "icms,"
                    + "ipi,"
                    + "custo,"
                    + "target,"
                    + "p_atacado,"
                    + "p_varejo"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " nome = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getFloat(6));
                modelProdutos.setGrupo(this.getResultSet().getString(7));
                modelProdutos.setPIS(this.getResultSet().getDouble(8));
                modelProdutos.setICMS(this.getResultSet().getDouble(9));
                modelProdutos.setIPI(this.getResultSet().getDouble(10));
                modelProdutos.setCusto(this.getResultSet().getDouble(11));
                modelProdutos.setTarget(this.getResultSet().getDouble(12));
                modelProdutos.setPrecoAtacado(this.getResultSet().getDouble(13));
                modelProdutos.setPrecoVarejo(this.getResultSet().getDouble(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * recupera uma lista de Produtos return ArrayList
     */
    public ArrayList<ModelProdutos> getListaProdutosDAO() {
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque,"
                    + "grupo,"
                    + "pis,"
                    + "icms,"
                    + "ipi,"
                    + "custo,"
                    + "target,"
                    + "p_atacado,"
                    + "p_varejo"
                    + " FROM"
                    + " produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getFloat(6));
                modelProdutos.setGrupo(this.getResultSet().getString(7));
                modelProdutos.setPIS(this.getResultSet().getDouble(8));
                modelProdutos.setICMS(this.getResultSet().getDouble(9));
                modelProdutos.setIPI(this.getResultSet().getDouble(10));
                modelProdutos.setCusto(this.getResultSet().getDouble(11));
                modelProdutos.setTarget(this.getResultSet().getDouble(12));
                modelProdutos.setPrecoAtacado(this.getResultSet().getDouble(13));
                modelProdutos.setPrecoVarejo(this.getResultSet().getDouble(14));
                listamodelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE produtos SET "
                    + "codigo = '" + pModelProdutos.getCodigo() + "',"
                    + "fornecedores_codigo = '" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "nome = '" + pModelProdutos.getNome() + "',"
                    + "valor = '" + pModelProdutos.getValor() + "',"
                    + "codigo_barras = '" + pModelProdutos.getCodigoBarras() + "',"
                    + "estoque = '" + pModelProdutos.getEstoque() + "',"
                    + "grupo = '" + pModelProdutos.getGrupo() + "',"
                    + "pis = '" + pModelProdutos.getPIS() + "',"
                    + "icms = '" + pModelProdutos.getICMS() + "',"
                    + "ipi = '" + pModelProdutos.getIPI() + "',"
                    + "custo = '" + pModelProdutos.getCusto() + "',"
                    + "target = '" + pModelProdutos.getTarget() + "',"
                    + "p_atacado = '" + pModelProdutos.getPrecoAtacado() + "',"
                    + "p_varejo = '" + pModelProdutos.getPrecoVarejo() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelProdutos.getCodigo() + "'"
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
     * exclui Produtos
     *
     * @param pCodigo return boolean
     */
    public boolean excluirProdutosDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM produtos "
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

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            int sizeLista = pModelProdutos.getListaModelProdutoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produtos SET "
                        + "estoque = '" + pModelProdutos.getListaModelProdutoses().get(i).getEstoque() + "'"
                        + " WHERE "
                        + "codigo = '" + pModelProdutos.getListaModelProdutoses().get(i).getCodigo() + "'"
                        + ";"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeUmDAO(int pCodigo, float pQuantidade) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE produtos SET "
                    + "estoque = '" + pQuantidade + "'"
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
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

    public ModelProdutos getProdutosCodigoBarrasDAO(String pCodigoBarras) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "valor,"
                    + "codigo_barras,"
                    + "estoque,"
                    + "grupo,"
                    + "pis,"
                    + "icms,"
                    + "ipi,"
                    + "custo,"
                    + "target,"
                    + "p_atacado,"
                    + "p_varejo"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " codigo_barras = '" + pCodigoBarras + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setValor(this.getResultSet().getDouble(4));
                modelProdutos.setCodigoBarras(this.getResultSet().getString(5));
                modelProdutos.setEstoque(this.getResultSet().getFloat(6));
                modelProdutos.setGrupo(this.getResultSet().getString(7));
                modelProdutos.setPIS(this.getResultSet().getDouble(8));
                modelProdutos.setICMS(this.getResultSet().getDouble(9));
                modelProdutos.setIPI(this.getResultSet().getDouble(10));
                modelProdutos.setCusto(this.getResultSet().getDouble(11));
                modelProdutos.setTarget(this.getResultSet().getDouble(12));
                modelProdutos.setPrecoAtacado(this.getResultSet().getDouble(13));
                modelProdutos.setPrecoVarejo(this.getResultSet().getDouble(14));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
}
