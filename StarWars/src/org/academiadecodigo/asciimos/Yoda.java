package org.academiadecodigo.asciimos;

public class Yoda extends Character {


    @Override

    public String talk(String message){

        String toRemoveLast = message.substring(23,25);
        String toRemoveSecondLast = message.substring(18,22);
        String toRemoveLast = toRemoveLast.charAt(0).toUpperCase();


        String messageFinal = message.replaceAll("with you", "");
        message = toRemoveLast + " " + toRemoveSecondLast + "," + messageFinal;












    }
}
