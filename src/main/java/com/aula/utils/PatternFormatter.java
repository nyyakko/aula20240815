package com.aula.utils;

public final class PatternFormatter
{
    public PatternFormatter(String pattern, char wildcard)
    {
        this.pattern = pattern;
        this.wildcard = wildcard;
    }

    public static PatternFormatter ofPattern(String pattern) { return new PatternFormatter(pattern, '#'); }
    public static PatternFormatter ofPattern(String pattern, char wildcard) { return new PatternFormatter(pattern, wildcard); }

    public String format(String value)
    {
        String result = "";

        int i = 0;
        int j = 0;

        for (; i < pattern.length() && (0 <= i - j && i - j < value.length()); i += 1)
        {
            if (pattern.charAt(i) == wildcard)
            {
                result += value.charAt(i - j);
            }
            else
            {
                result += pattern.charAt(i);
                j += 1;
            }
        }

        return result;
    }

    private String pattern;
    private char wildcard;
}
