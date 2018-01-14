package model;

/**
 * @author edivan www.vegasconsultoria.com.br Venda de software e código fonte
 */
public class ModelFornecedor {

    private int codigo;
    private String nome;
    private String endereco;
    private String bairro;
    private String cnpj;
    private String ie;
    private String email;
    private int codCidade;
    private int codEstado;
    private String cep;
    private String telefone;

    /**
     * Construtor
     */
    public ModelFornecedor() {
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
     *
     * @return
     */
    public int getCodigo() {
        return this.codigo;
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
     *
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * seta o valor de endereco
     *
     * @param pEndereco
     */
    public void setEndereco(String pEndereco) {
        this.endereco = pEndereco;
    }

    /**
     * return endereco
     *
     * @return
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * seta o valor de bairro
     *
     * @param pBairro
     */
    public void setBairro(String pBairro) {
        this.bairro = pBairro;
    }

    /**
     * return bairro
     *
     * @return
     */
    public String getBairro() {
        return this.bairro;
    }

    /**
     * seta o valor de cnpj
     *
     * @param pCNPJ
     */
    public void setCNPJ(String pCNPJ) {
        this.cnpj = pCNPJ;
    }

    /**
     * return cnpj
     *
     * @return
     */
    public String getCNPJ() {
        return this.cnpj;
    }

    /**
     * seta o valor de ie
     *
     * @param pIE
     */
    public void setIE(String pIE) {
        this.ie = pIE;
    }

    /**
     * return ie
     *
     * @return
     */
    public String getIE() {
        return this.ie;
    }

    /**
     * seta o valor de cnpj
     *
     * @param pEmail
     */
    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    /**
     * return email
     *
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * seta o valor de codCidade
     *
     * @param pCidade
     */
    public void setCodCidade(int pCidade) {
        this.codCidade = pCidade;
    }

    /**
     * return codCidade
     *
     * @return
     */
    public int getCodCidade() {
        return this.codCidade;
    }

    /**
     * seta o valor de codEstado
     *
     * @param pUf
     */
    public void setCodEstado(int pUf) {
        this.codEstado = pUf;
    }

    /**
     * return codEstado
     *
     * @return
     */
    public int getCodEstado() {
        return this.codEstado;
    }

    /**
     * seta o valor de cep
     *
     * @param pCep
     */
    public void setCep(String pCep) {
        this.cep = pCep;
    }

    /**
     * return cep
     *
     * @return
     */
    public String getCep() {
        return this.cep;
    }

    /**
     * seta o valor de telefone
     *
     * @param pTelefone
     */
    public void setTelefone(String pTelefone) {
        this.telefone = pTelefone;
    }

    /**
     * return telefone
     *
     * @return
     */
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "ModelFornecedor {" + "::codigo = " + this.codigo + "::nome = " + this.nome + "::endereco = " + this.endereco + "::bairro = " + this.bairro + "::cnpj = " + this.cnpj + "::ie = " + this.ie + "::email = " + this.email + "::cidade = " + this.codCidade + "::uf = " + this.codEstado + "::cep = " + this.cep + "::telefone = " + this.telefone + "}";
    }
}
