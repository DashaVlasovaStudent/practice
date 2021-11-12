package ru.ssau.tk.dasha.practice.Person;

public class Exceptions4_2 {
    public static String[] getSymbol(String[] str, int n) {
        String[] newStr = new String[str.length];

        if (n > str.length || n<0) {
            throw new StringIndexOutOfBoundsException();
        }
        for (String string : str) {
            if (string == null) {
                throw new NullPointerException();
            }
        }
        for (int i = 0; i < str.length; i++) {
            newStr[i] = str[i].substring(n, n + 1);
        }
        return newStr;
    }
}
