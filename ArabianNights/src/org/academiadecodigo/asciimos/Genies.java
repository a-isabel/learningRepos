package org.academiadecodigo.asciimos;

public class Genies {

    private int wishes;
    private int grantedWishes;

    public Genies() {
        wishes = 4;
        grantedWishes = 0;

    }

    public int getWishes() {
        return wishes;
    }

    public int getGrantedWishes() {
        return grantedWishes;
    }

    public void grantWish() {
        grantedWishes++;
    }

}
