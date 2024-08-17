package com.aula.entities;

import java.time.LocalDate;

import com.aula.utils.DocumentFormatter;

public class PessoaJuridica extends Pessoa
{
    public PessoaJuridica(String cnpj, String nomeFantasia, String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String estado, String cep)
    {
        super(nome, nascimento, nomeDaRua, numero, bairro, cidade, estado, cep);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() { return nomeFantasia; }
    public void setNomeFantasia(String nomeFantasia) { this.nomeFantasia = nomeFantasia; }

    public String getCnpj() { return cnpj; }
    public void setCnpj(String cpnj) { this.cnpj = cpnj; }

    @Override public String toString()
    {
        return "PessoaJuridica {" +
            "Pessoa (super): " + super.toString() + ", " +
            "nomeFantasia: " + this.nomeFantasia + ", " +
            "cpnj: " + DocumentFormatter.formatCnpj(this.cnpj) +
        "}";
    }

    @Override public boolean equals(Object object)
    {
        if (object == null || !(object instanceof PessoaJuridica) || !super.equals(object)) return false;
        if (this == object) return true;

        var that = (PessoaJuridica)object;

        return
            this.nomeFantasia.equals(that.nomeFantasia) &&
            this.cnpj.equals(that.cnpj);
    }

    private String nomeFantasia;
    private String cnpj;
}
