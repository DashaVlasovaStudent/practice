package ru.ssau.tk.dasha.practice;

public class Cell {

    private int x;
    private int y;
    private int state;// состояние ячейки( 0 - пустая, >0 - змея, -1 - еда, <0 - что-то др)


    // начальные значения координат и состояния
    public Cell(int x, int y, int state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return CELL_SIZE;
    }

    public int getWidth() {
        return CELL_SIZE;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }


    //Метод обновления клетки
    public void update(boolean have_to_decrease) {
        if (have_to_decrease && this.state > 0) {
            this.state--;
        }
    }

    // установление состояния ячейки
    public Sprite getSprite() {
        if (this.state > 0) {
            return Sprite.BODY;
        } else if (this.state == 0) {
            return null;
        } else {

            switch (state) {// если в клетке не тело змеи и не ничего, то там еда
                default :
                    return Sprite.CHERRIES;


            }
        }
    }


}
