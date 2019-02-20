package org.academiadecodigo.asciimos;

import java.security.PublicKey;

public enum EnemyTypes {

    BARREL,
    SOLDIER,
    ARMOURED;


    public static EnemyTypes chosenEnemy(){

        EnemyTypes[] enemy = EnemyTypes.values();

        int randomEnemy = (int)(Math.random() * enemy.length);

        return enemy[randomEnemy];

    }


}
