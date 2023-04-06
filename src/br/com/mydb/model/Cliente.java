package br.com.mydb.model;

public class Cliente {

    private String idCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String numCliente;
    private String cepCliente;
    private String cidadeCliente;
    private String ufCliente;

    public Cliente() {
    }

    public Cliente(String idCliente, String nomeCliente, String enderecoCliente, String bairroCliente, String numCliente, String cepCliente, String cidadeCliente, String ufCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.enderecoCliente = enderecoCliente;
        this.bairroCliente = bairroCliente;
        this.numCliente = numCliente;
        this.cepCliente = cepCliente;
        this.cidadeCliente = cidadeCliente;
        this.ufCliente = ufCliente;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(String cepCliente) {
        this.cepCliente = cepCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getUfCliente() {
        return ufCliente;
    }

    public void setUfCliente(String ufCliente) {
        this.ufCliente = ufCliente;
    }
}

