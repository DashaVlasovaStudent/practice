package ru.ssau.tk.dasha.practice;

public class Exceptions4_3 {
    public static char getCertainSymbol(String[] str, int m, int n){
        if (n > str.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > str[m].length()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return str[m].charAt(n);
    }
}
