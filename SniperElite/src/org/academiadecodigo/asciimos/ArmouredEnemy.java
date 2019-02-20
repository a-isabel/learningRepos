package org.academiadecodigo.asciimos;

public class ArmouredEnemy extends Enemy implements Destroyable {

    private int armour = 50;

    private int health = 100;

    @Override
    public void hit(int armour) {
        while (armour > 0) {
            armour -= 5;
            break;
        }
        if (armour == 0) {
            super.hit(health);
        }
    }

    @Override
    public boolean isDestroyed() {
        getMessage();
        return super.isDestroyed();

    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }


}

