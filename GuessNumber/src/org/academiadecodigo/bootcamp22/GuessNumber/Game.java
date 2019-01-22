package org.academiadecodigo.bootcamp22.GuessNumber;

public class Game {

    private int targetNumber;


    public int getTargetNumber() {
        return targetNumber = GetRandom.generateInt();
    }

    public Game(Players[] arrayPlayers, int targetNumber) {

        this.arrayPlayers = arrayPlayers;
        this.targetNumber = targetNumber;
    }

    public boolean StartGame() {

        if (Players.getChosenNumber() == getTargetNumber()) {
            System.out.println("Congrats " + arrayPlayers[1].getName() + " you won the game!");
            return true;
        }

        System.out.println("try again!");
        return false ;
    }
}
