package ru.ssau.tk.dasha.practice.PizzaBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Pizza {
    enum PizzaType {
        MARGARITA,
        PEPERONI,
        PIZZAPIE
    }


    public Pizza createPizza(Pizza pizza, PizzaType type, int quantityPersons) {
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


    public static void main(String[] args) {
        PizzaType type;
        int quantityPersons;
        Pizza pizza = new Pizza();
        String type1;

//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("The menu:\n MARGARITA\n PEPERONI\n PIZZAPIE\n\n You want to order (please enter in BIG LETTERS)\n \n ");
//            type1 = scanner.next();
//
//            System.out.println("The quantity of people who are going to eat pizza (6 or 8)");
//            quantityPersons = scanner.nextInt();
//            if ((quantityPersons != 6) & (quantityPersons != 8)) {
//                throw new IllegalArgumentException();
//            }
//            type = PizzaType.valueOf(type1);
//
//            pizza.createPizza(pizza, type, quantityPersons);
//        } catch (IllegalArgumentException e) {
//            System.err.println("The pizza, you chose, isn't there in our menu OR the quantity of people entered incorrectly  ");
//        }

        //System.out.println("The pizza is " + type1);
        JFrame jFrame = new JFrame("PizzaBar");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.getContentPane().setLayout(new FlowLayout());
        jFrame.setBounds(200, 200, 400, 400);

        JLabel label = new JLabel("Pizza you want to order:");
        JTextField textField = new JTextField("");
        textField.setPreferredSize(new Dimension(200, 20));
        JButton button = new JButton("Make an order!");

        jFrame.getContentPane().add(label);
        jFrame.getContentPane().add(textField);
        jFrame.getContentPane().add(button);

        jFrame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(jFrame, "Pizza is made, please take it and give us money\n Bon Apetit!");
            }
        });
        JLabel label1 = new JLabel("\n Menu:\n MARGARITA\n PEPERONI \n PIZZAPIE");
        jFrame.getContentPane().add(label1);
    }
}
