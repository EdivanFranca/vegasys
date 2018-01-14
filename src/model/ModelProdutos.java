package model;

import java.util.ArrayList;

/**
 * @author edivan www.vegasconsultoria.com.br Venda de software e código fonte
 */
public class ModelProdutos {

    private int codigo;
    private int fornecedoresCodigo;
    private String nome;
    private Double valor;
    private String grupo;
    private Double pis;
    private Double icms;
    private Double ipi;
    private Double custo;
    private Double target;
    private Double precoatacado;
    private Double precovarejo;
    private float estoque;
    private String codigoBarras;
    private ArrayList<ModelProdutos> listaModelProdutoses;

    /**
     * Construtor
     */
    public ModelProdutos() {
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
     * seta o valor de fornecedoresCodigo
     *
     * @param pFornecedores_codigo
     */
    public void setFornecedoresCodigo(int pFornecedores_codigo) {
        this.fornecedoresCodigo = pFornecedores_codigo;
    }

    /**
     * return fornecedoresCodigo
     */
    public int getFornecedoresCodigo() {
        return this.fornecedoresCodigo;
    }

    /**
     * seta o valor de nome
     *
     * @param pNome
     */
    public void setNome(String pNome) {
        this.nome = pNome;
    }

    /**
     * return nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * seta o valor de nome
     *
     * @param pGrupo
     */
    public void setGrupo(String pGrupo) {
        this.grupo = pGrupo;
    }

    /**
     * return nome
     */
    public String getGrupo() {
        return this.grupo;
    }

    /**
     * seta o valor de valor
     *
     * @param pValor
     */
    public void setValor(Double pValor) {
        this.valor = pValor;
    }

    /**
     * return valor
     */
    public Double getValor() {
        return this.valor;
    }

    /**
     * seta o valor de valor
     *
     * @param pPIS
     */
    public void setPIS(Double pPIS) {
        this.pis = pPIS;
    }

    /**
     * return valor
     */
    public Double getPIS() {
        return this.pis;
    }

    /**
     * seta o valor de valor
     *
     * @param pICMS
     */
    public void setICMS(Double pICMS) {
        this.icms = pICMS;
    }

    /**
     * return valor
     */
    public Double getICMS() {
        return this.icms;
    }

    /**
     * seta o valor de valor
     *
     * @param pIPI
     */
    public void setIPI(Double pIPI) {
        this.ipi = pIPI;
    }

    /**
     * return valor
     */
    public Double getIPI() {
        return this.ipi;
    }

    /**
     * seta o valor de valor
     *
     * @param pCusto
     */
    public void setCusto(Double pCusto) {
        this.custo = pCusto;
    }

    /**
     * return valor
     */
    public Double getCusto() {
        return this.custo;
    }

    /**
     * seta o valor de valor
     *
     * @param pTarget
     */
    public void setTarget(Double pTarget) {
        this.target = pTarget;
    }

    /**
     * return valor
     */
    public Double getTarget() {
        return this.target;
    }

    /**
     * seta o valor de valor
     *
     * @param pPrecoAtacado
     */
    public void setPrecoAtacado(Double pPrecoAtacado) {
        this.precoatacado = pPrecoAtacado;
    }

    /**
     * return valor
     */
    public Double getPrecoAtacado() {
        return this.precoatacado;
    }

    /**
     * seta o valor de valor
     *
     * @param pPrecoVarejo
     */
    public void setPrecoVarejo(Double pPrecoVarejo) {
        this.precovarejo = pPrecoVarejo;
    }

    /**
     * return valor
     */
    public Double getPrecoVarejo() {
        return this.precovarejo;
    }

    /**
     * seta o valor de estoque
     *
     * @param pEstoque
     */
    public void setEstoque(float pEstoque) {
        this.estoque = pEstoque;
    }

    /**
     * return estoque
     */
    public float getEstoque() {
        return this.estoque;
    }

    @Override
    public String toString() {
        return "ModelProdutos {" + "::codigo = " + this.codigo
                + "::fornecedores_codigo = " + this.fornecedoresCodigo
                + "::nome = " + this.nome
                + "::valor = " + this.valor
                + "::grupo = " + this.grupo
                + "::pis = " + this.pis
                + "::icms = " + this.icms
                + "::ipi = " + this.ipi
                + "::custo = " + this.custo
                + "::target = " + this.target
                + "::precoatacado = " + this.precoatacado
                + "::precovarejo = " + this.precovarejo
                + "::estoque = " + this.estoque + "}";
    }

    /**
     * @return the listaModelProdutoses
     */
    public ArrayList<ModelProdutos> getListaModelProdutoses() {
        return listaModelProdutoses;
    }

    /**
     * @param listaModelProdutoses the listaModelProdutoses to set
     */
    public void setListaModelProdutoses(ArrayList<ModelProdutos> listaModelProdutoses) {
        this.listaModelProdutoses = listaModelProdutoses;
    }

    /**
     * @return the codigoBarras
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * @param codigoBarras the codigoBarras to set
     */
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

}
