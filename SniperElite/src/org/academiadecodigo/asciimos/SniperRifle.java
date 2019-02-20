package org.academiadecodigo.asciimos;

public class SniperRifle {

    private int bulletDamage = 10;

    private final float hitProb = 0.3f;

    public void shoot(Destroyable destroyable) {

        if (Math.random() > hitProb) {

            destroyable.hit(bulletDamage);

            System.out.println("Enemy was hit!");
        } else {

            System.out.println("Enemy dodged the bullet!");
        }

    }

}
