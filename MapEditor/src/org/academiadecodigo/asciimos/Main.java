package org.academiadecodigo.asciimos;

public class Main {

    public static void main(String[] args) {

        Map map = new Map();
        map.drawMap();

        MapCells mapCells = new MapCells();
        mapCells.createMapCells();

        Cursor cursor = new Cursor();
        cursor.getCursor();

    }
}
