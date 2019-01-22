package org.academiadecodigo.bootcamp22.Bank;

public class Wallet {

    public static String walletName;

    public static float money = 0f;

    public static void getWalletName(String walletName) {
        System.out.println(walletName);
    }

    public static float walletBalance = 0f;

    public static void getWalletBalance(float walletBalance) {
        System.out.println(walletBalance);
    }

    public static void saveInWallet(float money) {
        walletBalance = walletBalance + money;
        System.out.println(walletBalance);
    }

    public static void spendFromWallet(float money) {
        walletBalance = walletBalance - money;
        System.out.println(walletBalance);
    }


}
