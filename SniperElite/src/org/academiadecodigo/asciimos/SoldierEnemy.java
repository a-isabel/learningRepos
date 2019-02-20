package org.academiadecodigo.asciimos;

public class SoldierEnemy extends Enemy implements Destroyable {

    private int health = 100;
    private boolean dead = false;

    @Override
    public void hit(int health) {
        super.hit(health);
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
