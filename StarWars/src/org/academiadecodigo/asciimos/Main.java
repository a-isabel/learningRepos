package org.academiadecodigo.asciimos;

public class Main {

    public static void main(String[] args) {

        Yoda yoda = new Yoda();
        R2D2 r2d2 = new R2D2();
        DarthVader darthVader = new DarthVader();

        Character[] characters = { yoda, r2d2, darthVader };

        for(int i = 0; i < characters.length; i++) {

            characters[i].talk("May the force be with you!");
        }

    }
}
