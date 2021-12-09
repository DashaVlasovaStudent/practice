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
                break;
            case PEPERONI:
                pizza = new Peperoni(quantityPersons);
                break;
            case PIZZAPIE:
                pizza = new PizzaPie(quantityPersons);
                break;
        }
        return pizza;
    }

    int[] quantity = {6, 8};

    public static void main(String[] args) {
        PizzaType type;
        int quantityPersons;
        Pizza pizza = new Pizza();
        String type1;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("The menu:\n MARGARITA\n PEPERONI\n PIZZAPIE\n\n You want to order (please enter in BIG LETTERS)\n \n ");
            type1 = scanner.next();

            System.out.println("The quantity of people who are going to eat pizza (6 or 8)");
            quantityPersons = scanner.nextInt();
            if ((quantityPersons != 6) & (quantityPersons != 8)){
                throw new IllegalArgumentException();
            }
                type = PizzaType.valueOf(type1);

            pizza.createPizza(pizza, type, quantityPersons);
        } catch (IllegalArgumentException e) {
            System.err.println("The pizza, you chose, isn't there in our menu OR the quantity of people entered incorrectly  ");
        }

        //System.out.println("The pizza is " + type1);

    }
}
