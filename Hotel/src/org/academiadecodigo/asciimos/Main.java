package org.academiadecodigo.asciimos;

public class Main {

    public static void main(String[] args) {

        Hotel hotel1 = new Hotel();

        Guest guest1 = new Guest();
        Guest guest2 = new Guest();
        Guest guest3 = new Guest();


        guest1.setHotel(hotel1);
        guest1.askCheckIn();


        guest2.setHotel(hotel1);
        guest2.askCheckIn();


        guest1.askCheckOut();

        guest3.setHotel(hotel1);
        guest3.askCheckIn();




    }
}
