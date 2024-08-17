package com.aula;

import com.aula.utils.DocumentFormatter;

final class Endereco
{
    public Endereco(String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNomeDaRua() { return nomeDaRua; }
    public void setNomeDaRua(String nomeDaRua) { this.nomeDaRua = nomeDaRua; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    public String getBairro() { return bairro; }
    public void setBairro(String bairro) { this.bairro = bairro; }

    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }

    @Override public String toString()
    {
        return "Endereco {" +
            "nomeDaRua: " + this.nomeDaRua + ", " +
            "numero: " + this.numero + ", " +
            "bairro: " + this.bairro + ", " +
            "cidade: " + this.cidade + ", " +
            "estado: " + this.estado + ", " +
            "cep: " + DocumentFormatter.formatCep(this.cep) +
        "}";
    }

    @Override public boolean equals(Object object)
    {
        if ((object == null) || !(object instanceof Endereco)) return false;
        if (this == object) return true;

        var that = (Endereco)object;

        return
            this.nomeDaRua.equals(that.nomeDaRua) &&
            this.numero.equals(that.numero) &&
            this.bairro.equals(that.bairro) &&
            this.cidade.equals(that.cidade) &&
            this.estado.equals(that.estado) &&
            this.cep.equals(that.cep);
    }

    private String nomeDaRua;
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
}
