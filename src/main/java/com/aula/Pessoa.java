package com.aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.aula.utils.DocumentFormatter;

public abstract class Pessoa
{
    public Pessoa(String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
        this.nome = nome;
        this.nascimento = nascimento;
        this.nomeDaRua = nomeDaRua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

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
        return "Pessoa {" +
            "nome: " + this.nome + ", " +
            "nascimento: " + this.nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " +
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
        if ((object == null) || !(object instanceof Pessoa)) return false;
        if (this == object) return true;

        var that = (Pessoa)object;

        return
            this.nome.equals(that.nome) &&
            this.nascimento.equals(that.nascimento) &&
            this.nomeDaRua.equals(that.nomeDaRua) &&
            this.numero.equals(that.numero) &&
            this.bairro.equals(that.bairro) &&
            this.cidade.equals(that.cidade) &&
            this.estado.equals(that.estado) &&
            this.cep.equals(that.cep);
    }

    protected String nome;
    protected LocalDate nascimento;
    protected String nomeDaRua;
    protected Integer numero;
    protected String bairro;
    protected String cidade;
    protected String estado;
    protected String cep;
}
