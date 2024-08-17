package com.aula;

import java.time.LocalDate;
import java.time.Month;

public class App
{
    public static void main(String[] args)
    {
        {
            var pessoaFisicaA = new PessoaFisica(
                "12345678910", "Arlando Games", LocalDate.of(1998, Month.DECEMBER, 13), "Rua Maluca", 69420, "Dos Loucos", "Misteriosa", "PR", "12345678"
            );
            System.out.println(pessoaFisicaA);
            var pessoaFisicaB = pessoaFisicaA;
            System.out.printf("pessoaB == pessoaA ? %b%n", pessoaFisicaB.equals(pessoaFisicaA));
            var pessoaFisicaC = new PessoaFisica(
                "12345678910", "Arlando Games", LocalDate.of(1998, Month.DECEMBER, 13), "Rua Maluca", 69420, "Dos Loucos", "Misteriosa", "ES", "12345678"
            );
            System.out.printf("pessoaC == pessoaA ? %b%n%n", pessoaFisicaC.equals(pessoaFisicaA));
        }
        {
            var pessoaJuridicaA = new PessoaJuridica(
                "54388839000178", "Doido", "Doidos e Loucos", LocalDate.of(1998, Month.APRIL, 24), "Ali ó", 42069, "Estranho", "Maluca", "PR", "87654321"
            );
            System.out.println(pessoaJuridicaA);
            var pessoaJuridicaB = pessoaJuridicaA;
            System.out.printf("pessoaJuridicaB == pessoaJuridicaA ? %b%n", pessoaJuridicaB.equals(pessoaJuridicaA));
            var pessoaJuridicaC = new PessoaJuridica(
                "54388839000178", "Doido", "Doidos e Loucos", LocalDate.of(1998, Month.APRIL, 24), "Ali ó", 42069, "Estranho", "Maluca", "ES", "87654321"
            );
            System.out.printf("pessoaJuridicaC == pessoaJuridicaA ? %b%n", pessoaJuridicaC.equals(pessoaJuridicaA));
        }
    }
}
