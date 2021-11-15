package ru.ssau.tk.dasha.practice.TicTacToe;

import javax.swing.*;
import java.awt.*;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("starting the game...");
        JFrame window = new JFrame("TicTacToe");// главное окно
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// кнопка Х для закрытия игры
        window.setSize(400, 400);
        window.setLayout(new BorderLayout());// менеджер компоновки
        window.setLocationRelativeTo(null);// окно по центру экрана
        window.setVisible(true);// чтобы увидеть окно
        TicTacToe1 ticTacToe = new TicTacToe1();
        window.add(ticTacToe);
        System.out.println("ending...");

    }
}
