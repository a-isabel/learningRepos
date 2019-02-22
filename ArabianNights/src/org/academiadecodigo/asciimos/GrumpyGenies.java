package org.academiadecodigo.asciimos;

public class GrumpyGenies extends Genies {

    @Override
    public void grantWish() {
        if (getGrantedWishes() == 1) {
            System.out.println("AHAHAHAH! Bamboozled again! " +
                    "\nYou should try to rub the Magic Lamp again.");
            return;
        }
        if (getGrantedWishes() == 0) {
            System.out.println("I am a very Grumpy Genie and maybe " +
                    "I can grant you " + getWishes() + " wishes.");

        }

        super.grantWish();
        System.out.println("Your wish has been granted! ");
        System.out.println("You can still ask for " + (getWishes() - getGrantedWishes()) + " wish(es).");
    }


}
