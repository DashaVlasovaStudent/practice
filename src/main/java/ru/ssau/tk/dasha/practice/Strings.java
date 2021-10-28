package ru.ssau.tk.dasha.practice;

public class Strings {

    public void stringChar(String string){
        for (int i=0; i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        String string = "Hello world";
        Strings str = new Strings();
        str.stringChar(string);
    }
}
