package com.aula;

import java.time.LocalDate;

public abstract class Pessoa extends PessoaBase
{
    public static class EnderecoKey { private EnderecoKey() {} }

    public Pessoa(String nome, LocalDate nascimento)
    {
        super(nome, nascimento);
    }

    public Pessoa withEndereco()
    {
        this.endereco = new Endereco(new EnderecoKey());
        return this;
    }

    public Pessoa withNomeDaRua(String nomeDaRua)
    {
        this.endereco.setNomeDaRua(nomeDaRua);
        return this;
    }

    public Pessoa withNumero(Integer numero)
    {
        this.endereco.setNumero(numero);
        return this;
    }

    public Pessoa withBairro(String bairro)
    {
        this.endereco.setBairro(bairro);
        return this;
    }

    public Pessoa withCidade(String bairro)
    {
        this.endereco.setCidade(bairro);
        return this;
    }

    public Pessoa withEstado(String estado)
    {
        this.endereco.setEstado(estado);
        return this;
    }

    public Pessoa withCep(String cep)
    {
        this.endereco.setCep(cep);
        return this;
    }
}
