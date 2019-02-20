package org.academiadecodigo.bootcamp22;

public class CodeCadet extends ACPerson {

    private String bootcamp;

    public CodeCadet(String name, String machine, int age, String bootcamp){
       super(name, machine, age);
       this.bootcamp = bootcamp;

    }

    public void CoffeBreaking(){

        System.out.println("Obrigada Filipe, estava a adormecer!");
    }

    public void queenDancing(){

        System.out.println("Dancing like Queen B!");
    }

}
