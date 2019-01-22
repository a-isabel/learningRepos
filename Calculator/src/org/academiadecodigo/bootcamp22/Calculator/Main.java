package org.academiadecodigo.bootcamp22.Calculator;

public class Main {
    public static void main(String[] args) {


        Calculator casio = new Calculator("hotpink", "unicorn");
        Calculator texas = new Calculator();

        texas.setColor("purple");

        System.out.println("I have a dream of owning a calculator texas " + casio.getColor() + " shaped like an " + casio.getShape()+ ".");

        System.out.println("I have a dream of owning a calculator texas shaped like a " + texas.getShape() + ".");


        int sum = casio.sum(2, 3);
        sum = casio.sum(sum, 5);
        System.out.println(sum);

        float misterZeMoney = casio.sum(0.65f, 1f);
        System.out.println(misterZeMoney);

        float nandaChula = casio.subtract(1f ,7f);
        System.out.println(nandaChula);

        float multipica = texas.multiply(2.5f, 0f);
        System.out.println(multipica);

        float dividir = casio.divide(5f , 0f);
        System.out.println(dividir);

        float dividirByZero = texas.divide(0f, 2f);
        System.out.println(dividirByZero);

       System.out.println("Battery: " + Calculator.getBattery());
        System.out.println(texas.getBattery());

    }

}
