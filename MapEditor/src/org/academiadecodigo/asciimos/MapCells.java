package org.academiadecodigo.asciimos;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MapCells extends Position {

    private Position position;

    private Rectangle[][] mapCells;


    public MapCells(){
        mapCells = new Rectangle[getWidth()][getHeight()];

    }

    public Rectangle[][] createMapCells() {

        for (int i = 0; i < (getWidth()); i += getCELL_SIZE()) {

            for (int j = 0; j < (getHeight()); j += getCELL_SIZE()) {
                mapCells[i][j] = new Rectangle(getPADDING() + i, getPADDING()+ j, getCELL_SIZE(), getCELL_SIZE());
                mapCells[i][j].setColor(Color.MAGENTA);
                mapCells[i][j].draw();
            }
        }
        return mapCells;
    }

    @Override
    public int getCol() {
        return 20;
    }

    @Override
    public int getRow() {
        return 30;
    }

    @Override
    public int getPADDING() {
        return super.getPADDING();
    }

    @Override
    public int getCELL_SIZE() {
        return super.getCELL_SIZE();
    }


    public int getWidth(){
        return getCol() * getCELL_SIZE();
    }


    public int getHeight(){
        return getRow()* getCELL_SIZE();
    }

    @Override
    public Position getPosition(int col, int row ){
        return super.getPosition(getCol(), getRow());
    }

}