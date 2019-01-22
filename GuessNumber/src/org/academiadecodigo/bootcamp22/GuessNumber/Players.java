package org.academiadecodigo.bootcamp22.GuessNumber;

public class Players {

    public static int chosenNumber;

    public static String name;

    public Players [] arrayPlayers;

    public Players[] getArrayPlayers() {
        return arrayPlayers;
    }

    public static int getChosenNumber() {
        return chosenNumber = GetRandom.generateInt();
    }

    public String getName(){

        return Players.name;
    }

}
