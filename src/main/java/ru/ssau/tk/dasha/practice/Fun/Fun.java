package ru.ssau.tk.dasha.practice.Fun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Fun extends JComponent implements KeyListener, ActionListener {
    Image img = new ImageIcon("src/meme.png").getImage();

    public void paint(Graphics graphics) {
        Graphics2D gr = (Graphics2D) graphics;
        gr.drawImage(img, 0, 0, null);
    }


    public static void main(String[] args) {
        Fun f = new Fun();
        JFrame frame = new JFrame("Funny images");
        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.addKeyListener(f);
        frame.add(new Fun());
        frame.add(f);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
