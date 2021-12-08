package ru.ssau.tk.dasha.practice.PizzaBar;

import java.util.Scanner;

public class Pizza {
    enum PizzaType {
        MARGARITA,
        PEPERONI,
        PIZZAPIE
    }


    public Pizza createPizza(Pizza pizza, PizzaType type, int quantityPersons) {//количество людей, которые будут кушать пиццу 6 или 8
        switch (type) {
            case MARGARITA:
                pizza = new Margarita(quantityPersons);
            case PEPERONI:
                pizza = new Peperoni(quantityPersons);
            case PIZZAPIE:
                pizza = new PizzaPie(quantityPersons);
        }
        return pizza;
    }

    public static void main(String[] args) {
        PizzaType type;
        int quantityPersons;
        Pizza pizza = new Pizza();
        String type1;

        Scanner scanner = new Scanner(System.in);
        type1 = scanner.next();
        quantityPersons = scanner.nextInt();
        type = PizzaType.valueOf(type1);
        pizza.createPizza(pizza,type, quantityPersons);

        System.out.println("The pizza is " + type1);

    }
}
