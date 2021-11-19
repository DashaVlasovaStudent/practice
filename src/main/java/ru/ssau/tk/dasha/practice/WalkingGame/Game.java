package ru.ssau.tk.dasha.practice.WalkingGame;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
    public static int WIDTH = 400;
    public static int HEIGHT = 300;
    public static String NAME = "Walking";
    public boolean running = false;
    private static final long serialVersionUID = 1L;


    public void start() {
        running = true;
        new Thread(this).start();
    }

    public void update(long delta) {

    }

    public void render() {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(2);
            requestFocus();
            return;
        }

        Graphics graphics = bufferStrategy.getDrawGraphics();
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(0, 0, getWidth(), getHeight());
        graphics.dispose();
        bufferStrategy.show();
    }

    public void init() {

    }

    public void run() {
        long lastTime = System.currentTimeMillis();
        long delta;

        init();

        while (running) {
            delta = System.currentTimeMillis() - lastTime;
            lastTime = System.currentTimeMillis();
            update(delta);
            render();
        }
    }



    public static void main(String[] args) {
        Game game = new Game();
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));

        JFrame frame = new JFrame(Game.NAME);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(game, BorderLayout.CENTER);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        game.start();
    }

}
