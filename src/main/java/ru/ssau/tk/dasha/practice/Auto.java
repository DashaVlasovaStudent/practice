package ru.ssau.tk.dasha.practice;

public class Auto {

    public String number;
    public String model;
    public String fullName;
    public static int count = 0;

    public Auto() {
        count++;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getFullName() {
        return fullName;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public static void main(String[] args) {
        Auto lada = new Auto();
        lada.setNumber("678");
        lada.setModel("priora");
        lada.setFullName("Victorov Victor Vicrorovoch");

        System.out.println(lada.getNumber() + lada.getModel() + lada.getFullName() + count);
    }

    public static class Exceptions4_2 {
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
}
