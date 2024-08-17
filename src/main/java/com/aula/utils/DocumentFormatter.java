package com.aula.utils;

public final class DocumentFormatter
{
    public static String formatCep(String cep) { return PatternFormatter.ofPattern("#####-###").format(cep); }
    public static String formatCpf(String cpf) { return PatternFormatter.ofPattern("###.###.###-##").format(cpf); }
    public static String formatCnpj(String cnpj) { return PatternFormatter.ofPattern("##.###.###/####-##").format(cnpj); }
}
