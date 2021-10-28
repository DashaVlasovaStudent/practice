package ru.ssau.tk.dasha.practice;

public class Strings {

    public void stringChar(String string) {
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public void method() {
        String firstStr = "Hello";
        String secondStr = new String(firstStr);
        System.out.println(firstStr == secondStr);
        System.out.println(firstStr.equals(secondStr));
    }

    public boolean palindrome(String string) {
        boolean flag = false;
        if (string.length() % 2 == 0) {
            for (int i = 0; i < string.length() / 2; i++) {
                if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                    flag = true;
                } else flag = false;
            }
        } else {
            for (int i = 0; i < (int) (string.length() / 2) + 1; i++) {
                if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
                    flag = true;
                } else flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
    }
}
