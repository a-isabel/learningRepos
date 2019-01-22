package org.academiadecodigo.bootcamp22.Bank;

public class Client {

    public String ClientName;
    public Wallet wallet;
    public Bank bank;


    public void getBankBalance(float bankBalance) {
        System.out.println("Receipt: " + "\n" + "Account balance: " + bankBalance + ".");
    }

    public void setBankWithdraw(float toWithdraw, float bankBalance) {
        bankBalance = bankBalance - toWithdraw;
        System.out.print("Receipt: " + "\n Amount withdrawn: " + toWithdraw + "." + "\nAccount balance: " + bankBalance + ".");
    }

    public void setBankDeposit(float toDeposit, float bankBalance) {
        bankBalance = bankBalance + toDeposit;
        System.out.println("Receipt: " + "\n Amount deposited: " + toDeposit + "." + "\n Account balance: " + bankBalance + ".");
    }

    public void getWalletBalance(float walletBalance) {
        System.out.println("I have " + walletBalance + "€ in my wallet");
    }

    public void saveInWallet(float money, float walletBalance) {
        walletBalance = walletBalance + money;
        System.out.println("I now have " + walletBalance + "€ in my wallet.");

    }

    public void spendFromWallet(float money, float walletBalance) {
        walletBalance = walletBalance - money;
        System.out.println("I still have " + walletBalance + "€ in my wallet.");
    }


}
