package com.aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa
{
    public class EnderecoKey { private EnderecoKey() {} }

    public Pessoa(String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = new Endereco(new EnderecoKey(), nomeDaRua, numero, bairro, cidade, estado, cep);
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

    public Endereco getEndereco() { return endereco; }
    public void setEndereco(Endereco endereco) { this.endereco = endereco; }

    @Override public String toString()
    {
        return "Pessoa {" +
            "nome: " + this.nome + ", " +
            "nascimento: " + this.nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " +
            "endereco: " + this.endereco +
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
            this.endereco.equals(that.endereco);
    }

    protected String nome;
    protected LocalDate nascimento;
    protected Endereco endereco;
}
