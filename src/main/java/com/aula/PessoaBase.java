package com.aula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class PessoaBase
{
    public PessoaBase(String nome, LocalDate nascimento)
    {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public LocalDate getNascimento() { return nascimento; }
    public void setNascimento(LocalDate nascimento) { this.nascimento = nascimento; }

    public Endereco getEndereco() { return endereco; }

    @Override public String toString()
    {
        return "PessoaBase {" +
            "nome: " + this.nome + ", " +
            "nascimento: " + this.nascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " +
            "endereco: " + this.endereco +
        "}";
    }

    @Override public boolean equals(Object object)
    {
        if ((object == null) || !(object instanceof PessoaBase)) return false;
        if (this == object) return true;

        var that = (PessoaBase)object;

        return
            this.nome.equals(that.nome) &&
            this.nascimento.equals(that.nascimento) &&
            this.endereco.equals(that.endereco);
    }

    protected String nome;
    protected LocalDate nascimento;
    protected Endereco endereco;
}
