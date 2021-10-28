package ru.ssau.tk.dasha.practice;

public class Strings {

    public void stringChar(String string){
        for (int i=0; i<string.length();i++){
            System.out.println(string.charAt(i));
        }
    }

    public void method(){
        String firstStr = "Hello";
        String secondStr = new String(firstStr);
        System.out.println(firstStr == secondStr);
        System.out.println(firstStr.equals(secondStr));
    }

    public static void main(String[] args) {
        Strings str = new Strings();
        str.method();
    }
}
