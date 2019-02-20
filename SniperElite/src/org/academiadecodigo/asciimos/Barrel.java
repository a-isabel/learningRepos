package org.academiadecodigo.asciimos;

import java.sql.SQLOutput;

public class Barrel extends GameObject implements Destroyable {

    BarrelType barrelType;
    int currentDamage;
    boolean destroyed;
    String message = " This barrel was destroyed";



    public Barrel(BarrelType barrelType) {
        this.barrelType = barrelType;
    }



    @Override
    public String getMessage() {
        return message;
    }

    public void hit(int maxDamage){

        for ( BarrelType barrelType : BarrelType.values()) {

            while (barrelType.getMaxDamage() > currentDamage) {
                currentDamage -=10;
            }
                isDestroyed();
            }
        }

    @Override
    public boolean isDestroyed() {
        getMessage();
        return destroyed = true;
    }

    public String sayMaxDamage() {

        switch (barrelType) {
            case PLASTIC:
                return ("This barrel can support " + barrelType.getMaxDamage() + " of maximum damage.");
            case WOOD:
                return ("This barrel can support " + barrelType.getMaxDamage() + " of maximum damage.");
            case METAL:
                return ("This barrel can support " + barrelType.getMaxDamage() + " of maximum damage.");
            default:
                System.out.println("This is not a barrel!");
        }

        return null;

    }



}
