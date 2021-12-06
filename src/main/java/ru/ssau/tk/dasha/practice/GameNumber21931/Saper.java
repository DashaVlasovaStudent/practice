package ru.ssau.tk.dasha.practice.GameNumber21931;

public class Saper {
    int width;
    int height;
    int quantityOfMines;
    int[][] mines;
    boolean[][] flags;
    boolean[][] revealed;

    boolean isOk(int x, int y) {
        return x < 0 || y < 0 || x >= width || y >= height;
    }

    public int howManyNear(int x, int y) {
        if (isOk(x, y)) {
            return 0;
        }
        int k = 0;
        for (int iX = -1; iX <= 1; iX++) {
            for (int iY = -1; iY <= 1; iY++) {
                if (isOk(iX + x, iY + y) ){
                    continue;
                }
                k += mines[iX + x][iY + y];
            }
        }
        return k;
    }

}
