package org.academiadecodigo.asciimos;

public class HappyGenies extends Genies {



    @Override
    public void grantWish() {
        if (getWishes() <= getGrantedWishes()) {
            System.out.println("I don't have any more wishes to grant. You should try the Magic Lamp again!");
            return;
        }

        if (getGrantedWishes() == 0) {
            System.out.println("I am a super Happy Genie and I can grant you " + getWishes() + " wishes.");

        }

        super.grantWish();
        System.out.println("Your wish has been granted!");
        System.out.println("You can still ask for " + (getWishes() - getGrantedWishes()) + " wish(es).");
    }
}

