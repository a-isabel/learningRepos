package org.academiadecodigo.asciimos;

public enum BarrelType {

    PLASTIC(10),
    WOOD(30),
    METAL(50);

    private int maxDamage;

    BarrelType(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    int randomBarrel = (int) (Math.random() * BarrelType.values().length);

    public int getMaxDamage() {
        return maxDamage;

    }

}
