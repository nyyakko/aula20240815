package com.aula;

import java.time.LocalDate;
import java.time.Month;

public class App
{
    public static void main(String[] args)
    {
        var pessoaA = new PessoaFisica("12345678910", "Arlando Games", LocalDate.of(1998, Month.DECEMBER, 13), new Endereco(
            "Sem saída", 69, "dos doidos", "inexistente", "Sem lei", "12345678"
        ));
        var pessoaB = new PessoaFisica("12345678910", "Arlando Games", LocalDate.of(1998, Month.DECEMBER, 13), new Endereco(
            "Sem saída", 69, "dos doidos", "inexistente", "Sem lei", "12345671"
        ));
        System.out.printf("pessoaA == pessoaB ? %b%n", pessoaA.equals(pessoaB));
        System.out.println(pessoaA);
    }
}
