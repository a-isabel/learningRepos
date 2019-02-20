package org.academiadecodigo.asciimos;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Position {


    private int col;
    private int row;
    private int PADDING = 10;
    private int CELL_SIZE = 20;
    private int width = col * CELL_SIZE;
    private int height = row * CELL_SIZE;
    private Position position;
    private Rectangle object;

    public Position() {

    }

    public Position( int col, int row) {
        this.col = col;
        this.row = row;
    }

    public Rectangle createObject(int col, int row, int width, int height) {

        return object = new Rectangle(col, row, width, height);
    }

    public void setPosition(int x, int y) {
        object.delete();
        object = new Rectangle(object.getX() + x,object.getY() + y,CELL_SIZE,CELL_SIZE);
    }

    public int getPADDING(){
        return PADDING;
    }
    public int getCELL_SIZE(){
        return CELL_SIZE;
    }

    public abstract int getCol();

    public abstract int getRow();

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Position getPosition(int col, int row) {
        return position;
    }

}
