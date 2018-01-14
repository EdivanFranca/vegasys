package model;

/**
 * @author edivan www.vegasconsultoria.com.br Venda de software e código fonte
 */
public class ModelCliente {

    private int codigo;
    private String cpf;
    private String email;
    private String nome;
    private String endereco;
    private String bairro;
    private int codCidade;
    private int codEstado;
    private String cep;
    private String telefone;

    /**
     * Construtor
     */
    public ModelCliente() {
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
     * seta o valor de codigo
     *
     * @param pCPF
     */
    public void setCPF(String pCPF) {
        this.cpf = pCPF;
    }

    /**
     * return codigo
     */
    public String getCPF() {
        return this.cpf;
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
     * @param pEmail
     */
    public void setEmail(String pEmail) {
        this.email = pEmail;
    }

    /**
     * return nome
     */
    public String getEmail() {
        return this.email;
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
     */
    public String getBairro() {
        return this.bairro;
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
     */
    public String getTelefone() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "ModelCliente {" + "::codigo = " + this.codigo + "::nome = " + this.nome + "::endereco = " + this.endereco + "::bairro = " + this.bairro + "::cidade = " + this.codCidade + "::uf = " + this.codEstado + "::cep = " + this.cep + "::telefone = " + this.telefone + "}";
    }
}
