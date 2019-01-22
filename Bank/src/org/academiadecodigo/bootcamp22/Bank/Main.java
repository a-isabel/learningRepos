package org.academiadecodigo.bootcamp22.Bank;

public class Main {

    public static void main(String[] args) {


        Bank bank = new Bank();
        Client client = new Client();

        client.ClientName = "Isabel";
        client.bank.bankName = "piggyBank";
        client.wallet.walletName = "Porco Mealheiro";

        bank.getBankName("amarelo");


    }

}

