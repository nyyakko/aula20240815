package com.aula.entities;

import java.time.LocalDate;

import com.aula.utils.DocumentFormatter;

public class PessoaFisica extends Pessoa
{
    public PessoaFisica(String cpf, String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
        super(nome, nascimento, new Endereco(nomeDaRua, numero, bairro, cidade, estado, cep));
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override public String toString()
    {
        return "PessoaFisica {" +
            "super: " + super.toString() + ", " +
            "cpf: " + DocumentFormatter.formatCpf(this.cpf) +
        "}";
    }

    @Override public boolean equals(Object object)
    {
        if (object == null || !(object instanceof PessoaFisica) || !super.equals(object)) return false;
        if (this == object) return true;

        var that = (PessoaFisica)object;

        return
            this.cpf.equals(that.cpf);
    }

    private String cpf;
}
