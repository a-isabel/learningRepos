package org.academiadecodigo.bootcamp22.RockPaperScissors;

public class Players {

public static int chosenHand;

public static String name;

public Players[] player (String name){

    this.name = name;
    return name;
}

public static int getChoseenHand() {
      chosenHand = Hand.ordinal() = RandomGenerator.generateInt();
        return chosenHand.Valueof();
    }
}
