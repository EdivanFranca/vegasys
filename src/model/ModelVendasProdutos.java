package model;

/**
 *
 * @author BLSoft Desenvolvimento de Sistemas
 */
public class ModelVendasProdutos {

    private int codigo;
    private int codigo_produto;
    private int codigo_venda;
    private float quantidade;

    /**
     * Construtor
     */
    public ModelVendasProdutos() {
    }

    /**
     * seta o valor de codigo
     *
     * @param pCodigo
     */
    public void setCodigo(int pCodigo) {
        this.codigo = pCodigo;
    }

    /**
     * return codigo
     */
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * seta o valor de codigo_produto
     *
     * @param pCodigo_produto
     */
    public void setCodigo_produto(int pCodigo_produto) {
        this.codigo_produto = pCodigo_produto;
    }

    /**
     * return codigo_produto
     */
    public int getCodigo_produto() {
        return this.codigo_produto;
    }

    /**
     * seta o valor de codigo_venda
     *
     * @param pCodigo_venda
     */
    public void setCodigo_venda(int pCodigo_venda) {
        this.codigo_venda = pCodigo_venda;
    }

    /**
     * return codigo_venda
     */
    public int getCodigo_venda() {
        return this.codigo_venda;
    }

    /**
     * seta o valor de quantidade
     *
     * @param pQuantidade
     */
    public void setQuantidade(float pQuantidade) {
        this.quantidade = pQuantidade;
    }

    /**
     * return quantidade
     */
    public float getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "ModelVendasProdutos {" + "::codigo = " + this.codigo + "::codigo_produto = " + this.codigo_produto + "::codigo_venda = " + this.codigo_venda + "::quantidade = " + this.quantidade + "}";
    }
}
