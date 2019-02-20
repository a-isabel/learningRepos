package org.academiadecodigo.asciimos;

public class RecyclableDemons extends Genies {

    private boolean recycled;

    @Override
    public void grantWish() {
        if (getGrantedWishes() == 0) {
            System.out.println("I am a very special kind of Genie and I will grant you all the wishes ask.");
        }
        super.grantWish();
        System.out.println("Your wish has been granted:\nHere's your potato! ");
    }

    public boolean isRecycled() {
        return recycled;
    }

    public void setRecycled() {
        recycled = true;
    }

}
