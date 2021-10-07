package ru.ssau.tk.dasha.practice;


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

