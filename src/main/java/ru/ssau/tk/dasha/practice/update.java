package ru.ssau.tk.dasha.practice;

import org.lwjgl.opengl.Display;

public class update {

    public static void update(boolean have_to_decrease) {
        updateOpenGL();

        for(Cell[] line:cells){
            for(Cell cell:line){
                cell.update(have_to_decrease);
            }
        }
    }


    private static void updateOpenGL() {
        Display.update();
        Display.sync(FPS);
    }
}
