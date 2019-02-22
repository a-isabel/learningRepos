package org.academiadecodigo.asciimos;

public class Guest {

    private Hotel hotel1;
    private int roomKey;

    public void setHotel(Hotel hotel1) {
        this.hotel1 = hotel1;
    }

    public void askCheckIn() {

       roomKey = hotel1.checkIn();
    }

    public void askCheckOut() {

        hotel1.checkout(roomKey);
    }

}
