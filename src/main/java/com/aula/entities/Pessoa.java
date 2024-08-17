package com.aula.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.aula.utils.DocumentFormatter;

public abstract class Pessoa
{
    public Pessoa(String nome, LocalDate nascimento, Endereco endereco)
    {
        this.nome = nome;
        this.nascimento = nascimento;
        this.endereco = endereco;
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

    static protected record Endereco(String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
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
    }

    protected String nome;
    protected LocalDate nascimento;
    protected Endereco endereco;
}
