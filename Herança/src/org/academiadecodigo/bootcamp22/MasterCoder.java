package org.academiadecodigo.bootcamp22;

public class MasterCoder extends ACPerson {

    private String pokemonTeam;

    public MasterCoder(String name, String machine, int age, String pokemonTeam){
        super(name, machine,age);
        this.pokemonTeam = pokemonTeam;

    }

    @Override
    public void panicate(){

        System.out.println("I'm so good at panicating that I can choose when to do it");
    }


    public void pokeCatching() {

        System.out.println("Let's catch'em all!!");
    }

    public void lecturing(){

        System.out.println("Faustino rambling, Sid Rambling, Jorge patiently rambling, Filipe tying nots in codecadets' brains ");

    }

}
