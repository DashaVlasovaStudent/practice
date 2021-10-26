package ru.ssau.tk.dasha.practice;

public class Cats extends Animal{
    protected String ownerName;

    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String[] args) {
        Animal cat = new Cats();
        cat.sound();
    }
}
