package org.academiadecodigo.bootcamp22.GuessNumber;

public class Game {

    private final Players[] arrayPlayers;
    private int targetNumber;

    public Game(Players[] arrayPlayers, int targetNumber) {

        this.arrayPlayers = arrayPlayers;
        this.targetNumber = targetNumber;
    }

    public void StartGame() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("  Let's play a guessing game!");
        System.out.println("  Guess number from 0 to 10.");
        System.out.println("_____________________________________________________________________________________");

        while (Players.getChosenNumber() != targetNumber) {
            System.out.println(" ");
            System.out.println("  " + Players.getChosenNumber() + " is wrong.");
            System.out.println("  Try again!");
            System.out.println("_________________________________________________________________________________");

        }
            System.out.println(" ");
            System.out.println("  Congrats you won the game.");
            System.out.println("  The correct number was " + targetNumber + ".");

    }
}
