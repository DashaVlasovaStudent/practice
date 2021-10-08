package ru.ssau.tk.dasha.practice;

import static org.lwjgl.opengl.GL11.*;

public class drawCells {
    public static void draw(){
        glClear(GL_COLOR_BUFFER_BIT);//очистка экрана от предыдущей игры

        for(Cell[] line:cells){
            for(Cell cell:line){
                drawElement(cell);
            }
        }
    }

    private static void drawElement(Cell elem){
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


}
