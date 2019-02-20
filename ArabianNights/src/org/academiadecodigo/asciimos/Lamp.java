package org.academiadecodigo.asciimos;

public class Lamp {

    private int timesRecharged = 0;
    private int timesRubbed = 0;


    private Genies[] genies;

    public Lamp() {
        this.genies = new Genies[4];
        System.out.println("A Magic Lamp with " + (genies.length - 1) + " Magic Genies appeared." +
                " Try rubbing it to see if they'll come out.");
    }

    public void getTimesRecharged() {

        System.out.println("The Magic Lamp was recycled " + (timesRecharged) + " times.");
    }


    public void rub() {
        timesRubbed++;

        // TODO: 2019-01-28 Return the genies.

        if (timesRubbed % 2 == 0 && timesRubbed < genies.length) {
            genies[timesRubbed - 1] = new HappyGenies();
            System.out.println("An Happy Genie has appeared!");
            //return genies[timesRubbed - 1];

        }
        if (timesRubbed % 2 != 0 && timesRubbed < genies.length) {
            genies[timesRubbed - 1] = new GrumpyGenies();
            System.out.println("A Grumpy Genie has appeared!");
        }
        if (timesRubbed == genies.length) {
            genies[timesRubbed - 1] = new RecyclableDemons();
            System.out.println("A Recyclable Genie has appeared!");
        }

    }

    public void askWish(int i) {

        if (i >= genies.length || genies[i] == null) {
            System.out.println("Only existing Genies can grant you wishes.");
            return;
        }

        if (genies[i] instanceof HappyGenies) {
            genies[i].grantWish();
        }
        if (genies[i] instanceof GrumpyGenies) {
            genies[i].grantWish();
        }
        if (genies[i] instanceof RecyclableDemons) {
            genies[i].grantWish();
        }

    }

    public void recharge() {

        int demon = genies.length - 1;

        if (!(genies[demon] instanceof RecyclableDemons)) {
            System.out.println("Only demons can be recycled.");
            return;
        }
        //EXEMPLO DE DOWNCASTING

        if (((RecyclableDemons) genies[demon]).isRecycled()) {
            System.out.println("This demon was already recycled");
            return;
        }

        ((RecyclableDemons) genies[demon]).setRecycled();

        for (int i = 0; i < genies.length - 1; i++) {
            genies[i] = null;
        }
        timesRubbed = 0;
        timesRecharged++;
        System.out.println("The Magic Lamp is recharged! You can rub it again ...");
    }
}