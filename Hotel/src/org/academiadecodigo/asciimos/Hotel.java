package org.academiadecodigo.asciimos;

public class Hotel {

    public int roomKey;
    private Room[] rooms;

    public Hotel() {
        rooms = new Room[10];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
        }
    }

    public int checkIn() {
        for (int i = 0; i < rooms.length; i++) {

            if (!rooms[i].isAvailable()) {
                continue;
            }
            roomKey = i;
            System.out.println("You are going to stay in room number " + i + ".");
            rooms[roomKey].setAvailable(false);
            return roomKey;
        }
        System.out.println("There are no rooms available! Please check another Hotel");
        return -1;
    }

    public void checkout(int roomKey) {

        rooms[roomKey].setAvailable(true);
        System.out.println("Goodbye! Thank you for your staying!");

    }
}

