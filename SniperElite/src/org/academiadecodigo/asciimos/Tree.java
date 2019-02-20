package org.academiadecodigo.asciimos;

public class Tree extends GameObject {

    public Tree tree = new Tree();

    String message = " I am a tree. Don't shoot me";

    @Override
    public String getMessage() {
        return message;
    }
}
