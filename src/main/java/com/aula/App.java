package com.aula;

import java.time.LocalDate;
import java.time.Month;

public class App
{
    public static void main(String[] args)
    {
        var pessoaA =
            new PessoaFisica("12345678910", "Wellington", LocalDate.of(1998, Month.DECEMBER, 13))
                .withEndereco()
                .withNomeDaRua("Sem Saída")
                .withNumero(69)
                .withBairro("Dos Doidos")
                .withCidade("Inexiste")
                .withEstado("Sem Lei")
                .withCep("12345678")
                ;
        System.out.println(pessoaA);
        System.out.println(pessoaA.getEndereco());
    }
}
