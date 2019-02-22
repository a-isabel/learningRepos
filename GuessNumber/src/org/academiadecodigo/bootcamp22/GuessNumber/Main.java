package org.academiadecodigo.bootcamp22.GuessNumber;


public class Main {

    public static void main(String[] args) {

        Players[] arrayPlayers = new Players[1];
        Game game = new Game(arrayPlayers, 6);

        game.StartGame();


    }

}