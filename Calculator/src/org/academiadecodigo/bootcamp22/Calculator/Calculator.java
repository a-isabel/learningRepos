package org.academiadecodigo.bootcamp22.Calculator;

public class Calculator {

    private static int battery = 100;

       //Every instance will have a color and a shape
        private String color;
        private String shape;


    public Calculator (String color, String shape) {
        this.color = color;
        this.shape = shape;
    }

    public Calculator(){

        color = "silver";
        shape = "square";
    }

    public String getColor(){
        return color;
    }

    public String getShape(){
        return shape;
    }

    public void setColor(String color) {
        if (!color.equals("YELLOW")){
            return;
        }

        this.color = color;
    }


    public int sum (int firstNumber, int secondNumber) {
        loseBattery();
        return firstNumber + secondNumber;
    }

    public float sum(float firstNumber, float secondNumber){
        loseBattery();
        return firstNumber + secondNumber;
    }

    public float subtract(float firstNumber, float secondNumber) {
        return secondNumber - firstNumber;
    }

    public float multiply(float firstNumber, float secondNumber) {
        return secondNumber * firstNumber;
    }

    public float divide( float firstNumber, float secondNumber) {

        if (secondNumber == 0f){

            System.out.println("It's not possible to divide by 0");
            return secondNumber;
        }
        return firstNumber / secondNumber;
    }

    private void loseBattery(){
        battery -= 10;
    }

    public static int getBattery() {
        return battery;
    }

}