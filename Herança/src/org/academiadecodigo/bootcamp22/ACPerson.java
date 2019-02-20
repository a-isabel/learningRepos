package org.academiadecodigo.bootcamp22;

public class ACPerson {

    private String name;
    private String machine;
    private int age;

    public ACPerson(String name, String machine, int age){

        this.name = name;
        this.age = age;
        this.machine = machine;

    }

    public String getName() {
            return name;
    }

    public int getAge() {
        return age;
    }

    public String getMachine() {
        return machine;
    }

    public void panicate()
    {
        System.out.println("Panic mode in full on!!");

    }

    public void shitCodding(){

        System.out.println("Pooping lots of shit code");

    }

    public void eating(){

        System.out.println("Filling my fucking belly");

    }
}
