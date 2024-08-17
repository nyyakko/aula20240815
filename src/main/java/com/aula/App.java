package com.aula;

import java.time.LocalDate;
import java.time.Month;

public class App
{
    public static void main(String[] args)
    {
        var pessoa = new PessoaFisica("12345678910", "Arlando Games", LocalDate.of(1998, Month.DECEMBER, 13), null);
        System.out.println(pessoa);
    }
}
