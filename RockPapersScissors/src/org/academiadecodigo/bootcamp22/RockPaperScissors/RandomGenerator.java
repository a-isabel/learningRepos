package org.academiadecodigo.bootcamp22.RockPaperScissors;

public class RandomGenerator {

    public static int generateInt() {

        return (int) (Math.floor(Math.random() * 3));
    }
}
