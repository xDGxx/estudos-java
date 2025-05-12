package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Cotação do dolar
        System.out.println("What is the dollar price? ");
        CurrencyConverter.setDollarPrice(5.65);

        //Solicita a quantidade em dolares
        System.out.println("How many dollars will be bought? ");
        double dollarsToBuy = scan.nextDouble();

        //Calcula o valor em reais
        double amountInReais = CurrencyConverter.calculateAmountInReais(dollarsToBuy);

        System.out.println("Amount to be paid in reais " + amountInReais);

    }

}
