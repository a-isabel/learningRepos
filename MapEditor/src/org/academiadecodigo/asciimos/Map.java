package org.academiadecodigo.asciimos;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;


public class Map extends Position {

    private Rectangle map = createObject(getPADDING(), getPADDING(), getWidth(), getHeight());

    public Rectangle getMap() {
        return map;
    }
   
    public int getCol() {
        return 20;
    }

    public int getRow() {
        return 30;
    }
    
    public int getPADDING() {
        return super.getPADDING();
    }
    
    public int getCELL_SIZE() {
        return super.getCELL_SIZE();
    }
    
    public int getWidth() {
        return getCol()*getCELL_SIZE();
    }

    public int getHeight() {
        return getRow()*getCELL_SIZE();
    }

    public void drawMap() {
        map.setColor(Color.BLUE);
        map.draw();
    }

    public Position getPosition() {
        return getPosition(getCol(),getRow());
    }

}
