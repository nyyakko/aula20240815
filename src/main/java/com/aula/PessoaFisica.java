package com.aula;

import java.time.LocalDate;

import com.aula.utils.DocumentFormatter;

public class PessoaFisica extends Pessoa
{
    public PessoaFisica(String cpf, String nome, LocalDate nascimento)
    {
        super(nome, nascimento);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override public String toString()
    {
        return "PessoaFisica {" +
            "Pessoa (super): " + super.toString() + ", " +
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
