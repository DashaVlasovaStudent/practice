package ru.ssau.tk.dasha.practice.PizzaBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
                if (textField.getText() != "MARGARITA" | textField.getText() != "PEPERONI" | textField.getText() != "PIZZAPIE") {
                    JOptionPane.showMessageDialog(jFrame, "The pizza you've entered isn't there in our menu");
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Pizza is made, please take it and give us money\n Bon Apetit!");
                }

                if (textField.getText().isEmpty()) {
                    JOptionPane.showInputDialog("Enter the name of pizza, please");
                    if (textField.getText() != "MARGARITA" | textField.getText() != "PEPERONI" | textField.getText() != "PIZZAPIE") {
                        JOptionPane.showMessageDialog(jFrame, "The pizza you've entered isn't there in our menu");
                    }
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Pizza is made, please take it and give us money\n Bon Apetit!");
                }


            }
        });

        JLabel label1 = new JLabel("\n Menu:\n MARGARITA\n PEPERONI \n PIZZAPIE");
        jFrame.getContentPane().add(label1);
    }
}
