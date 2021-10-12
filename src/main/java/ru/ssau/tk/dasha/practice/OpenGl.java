package ru.ssau.tk.dasha.practice;

import static org.lwjgl.opengl.GL11.*;

public class OpenGl {
    public class Constants {

        public static final int CELL_SIZE = 32;//Размер игровой ячейки

        public static final int CELLS_COUNT_X = 25;//размер поля игры в ячейках 25*25
        public static final int CELLS_COUNT_Y = 25;

        public static final int INITIAL_SPAWN_CHANCE = 1;//вероятность появления еды в игре

        public static final int FPS = 7;//змейка проходит 1 клетку за 1 фрейм и 7 фреймов в секунду

        //Создание игрового окна
        public static final int SCREEN_WIDTH =CELLS_COUNT_X*CELL_SIZE;
        public static final int SCREEN_HEIGHT = CELLS_COUNT_Y*CELL_SIZE;
        public static final String SCREEN_NAME = "Snake";
    }

    public class Cell {

        private static Cell[][] cells;
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
    public static void draw(){
        glClear(GL_COLOR_BUFFER_BIT);//очистка экрана от предыдущей игры


        for(Cell[] line:cells){
            for(Cell cell:line){
                drawElement(cell);
            }
        }
    }

    private static void drawElement(ru.ssau.tk.dasha.practice.Cell elem){
        if(elem.getSprite() == null) return;// не рисует ячейку, если нет спрайта


        //Рисование ячеек
        elem.getSprite().getTexture().bind();

        glBegin(GL_QUADS);
        glTexCoord2f(0,0);
        glVertex2f(elem.getX(),elem.getY()+elem.getHeight());
        glTexCoord2f(1,0);
        glVertex2f(elem.getX()+elem.getWidth(),elem.getY()+elem.getHeight());
        glTexCoord2f(1,1);
        glVertex2f(elem.getX()+elem.getWidth(), elem.getY());
        glTexCoord2f(0,1);
        glVertex2f(elem.getX(), elem.getY());
        glEnd();
    }
    public static void update(boolean have_to_decrease) {
        updateOpenGL();


        for(Cell[] line:cells){
            for(Cell cell:line){
                cell.update(have_to_decrease);
            }
        }
    }

}
