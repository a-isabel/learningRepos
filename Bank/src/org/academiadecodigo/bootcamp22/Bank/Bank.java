package org.academiadecodigo.bootcamp22.Bank;

public class Bank {

    public String bankName;

    public static float toDeposit;

    public float toWithdraw;

    public static float bankBalance = 1000f;

    public void getBankName(String bankName) {
        System.out.println(bankName);
    }

    public static void getBankBalance(float bankBalance) {
        System.out.println("Receipt: " + "\n" + "Account balance: " + bankBalance + ".");
    }

    public static void setBankWithdraw(float toWithdraw, float bankBalance) {
        bankBalance = bankBalance - toWithdraw;
        System.out.print("Receipt: " + "\n Amount withdrawn: " + toWithdraw + "." + "\nAccount balance: " + bankBalance + ".");
    }

    public static void setBankDeposit(float toDeposit, float bankBalance) {
        bankBalance = bankBalance + toDeposit;
        System.out.println("Receipt: " + "\n Amount deposited: " + toDeposit + "." + "\n Account balance: " + bankBalance + ".");
    }
}
