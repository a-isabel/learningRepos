package org.academiadecodigo.asciimos;

abstract class Enemy extends GameObject implements Destroyable {

    private int health;
    private boolean dead;

    public boolean isDestroyed() {
        return dead = true;
    }


    @Override
    public void hit(int health) {
        while (health > 0) {
            health -= 10;
        }
        if (health == 0) {
            isDestroyed();
        }
    }

    @Override
    public String getMessage() {
        return "I am dead";
    }


}
