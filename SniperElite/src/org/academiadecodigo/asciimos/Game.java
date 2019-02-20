package org.academiadecodigo.asciimos;

public class Game {

    private GameObject[] gameObjects;

    private SniperRifle sniperRifle;

    private int shotsFired;

    public Game(int gameObjects) {
        this.gameObjects = new GameObject[gameObjects];
        this.sniperRifle = new SniperRifle();

    }

    public void start() {

        createObjects();

    }

    public void createObjects() {

        for (int i = 0; i < gameObjects.length; i++) {

            double random = Math.random();

            if (random < 0.30d) {

                gameObjects[i] = new Tree();
                continue;
            }
            switch (EnemyTypes.chosenEnemy()) {
                case BARREL:
                    gameObjects[i] = new Barrel(BarrelType.WOOD);
                    break;
                case SOLDIER:
                    gameObjects[i] = new SoldierEnemy();
                    break;
                case ARMOURED:
                    gameObjects[i] = new ArmouredEnemy();
                    break;
            }

        }

        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Tree) {
                continue;
            }
            while ()
           sniperRifle.shoot();


        }


   /* public int getShotsFired() {
        return shotsFired;
    }*/

    }
}
