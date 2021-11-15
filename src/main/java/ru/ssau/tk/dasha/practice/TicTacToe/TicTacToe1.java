package ru.ssau.tk.dasha.practice.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe1 extends JComponent {
    public static final int FIELD_EMPTY = 0;
    public static final int FIELD_X = 10;
    public static final int FIELD_0 = 200;
    int field[][];
    boolean isXturn;
    int checkI;
    int checkJ;
    boolean isEmpty = false;

    public TicTacToe1() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();
    }

    public void initGame() {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                field[i][j] = FIELD_EMPTY;
            }
        }
        isXturn = true;
    }

    void drawX(int i, int j, Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        int oneW = getWidth() / 3;
        int oneH = getHeight() / 3;
        int x = i * oneW;
        int y = j * oneH;
        graphics.drawLine(x, y, x + oneW, y + oneH);
        graphics.drawLine(x, y + oneH, x + oneW, y);
    }

    void drawO(int i, int j, Graphics graphics) {
        graphics.setColor(Color.MAGENTA);
        int oneW = getWidth() / 3;
        int oneH = getHeight() / 3;
        int x = i * oneW;
        int y = j * oneH;
        graphics.drawOval(x + 5 * oneW / 100, y, oneW * 9 / 10, oneH);
    }

    void drawXO(Graphics graphics) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == FIELD_X) {
                    drawX(i, j, graphics);
                } else if (field[i][j] == FIELD_0) {
                    drawO(i, j, graphics);
                }
            }
        }
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);
        if (mouseEvent.getButton() == MouseEvent.BUTTON1) {
            int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((double) x / getWidth() * 3);
            int j = (int) ((double) y / getHeight() * 3);
            if (field[i][j] == FIELD_EMPTY) {
                field[i][j] = isXturn ? FIELD_X : FIELD_0;
                isXturn = !isXturn;
                repaint();
                int result = checkState();
                if (result != 0){
                    if (result == FIELD_0*3){
                        JOptionPane.showMessageDialog(this,"'0' won", "Victory!", JOptionPane.INFORMATION_MESSAGE);
                    } else if (result == FIELD_X*3){
                        JOptionPane.showMessageDialog(this,"'x' won", "Victory!", JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(this,"draw (nobody won)", "Victory!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    initGame();
                    repaint();
                }
            }

        }
    }

    int checkState() {
        int diagonal = 0;
        int diagonal2 = 0;
        for (int i = 0; i < 3; i++) {
            diagonal += field[i][i];
            diagonal2 += field[i][2 - i];
        }
        if (diagonal == FIELD_0 * 3 || diagonal == FIELD_X * 3) {
            return diagonal;
        }
        if (diagonal2 == FIELD_0 * 3 || diagonal2 == FIELD_X * 3) {
            return diagonal2;
        }


        for (int i = 0; i < 3; i++) {
            checkI = 0;
            checkJ = 0;
            for (int j=0; j<3; j++){
                if(field[i][j] == 0){
                    isEmpty = true;
                }
                checkI += field[i][j];
                checkJ += field[i][j];
            }
            if (checkI == FIELD_0*3 || checkI == FIELD_X*3){
                return checkI;
            }
            if (checkJ == FIELD_0*3 || checkJ == FIELD_X*3){
                return checkJ;
            }
        }
        if (isEmpty){
            return 0;
        } else return -1;
    }


    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        /*graphics.setColor(Color.PINK);
        graphics.drawOval(10, 10, 100, 100);*/
        drawGameField(graphics);
        drawXO(graphics);
    }

    void drawGameField(Graphics graphics) {
        int w = getWidth();
        int h = getHeight();
        int oneW = w / 3;
        int oneH = h / 3;
        graphics.setColor(Color.black);
        for (int i = 1; i < 3; i++) {
            graphics.drawLine(0, oneH * i, w, oneH * i);
            graphics.drawLine(oneW * i, 0, oneW * i, h);
        }

    }

}
