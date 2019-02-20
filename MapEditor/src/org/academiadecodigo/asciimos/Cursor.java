package org.academiadecodigo.asciimos;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cursor extends Position {

    private Rectangle cursor;
    private Position position;

    public Cursor() {
        cursor = createObject(getPADDING(), getPADDING(),getWidth(),getHeight());
        cursor.draw();
        cursor.setColor(Color.CYAN);
        cursor.fill();

    }

    public Rectangle getCursor() {
        return cursor;
    }

    @Override
    public int getCol() {
        return 1;
    }

    @Override
    public int getRow() {
        return 1;
    }

    @Override
    public int getPADDING() {
        return 10;
    }

    @Override
    public int getCELL_SIZE() {
        return 20;
    }

    public int getWidth(){
        return getCol()*getCELL_SIZE();
    }

    public int getHeight(){
        return getRow()*getCELL_SIZE();
    }

    @Override
    public Position getPosition(int col, int row) {
        return super.getPosition(getCol(), getRow());
    }
}