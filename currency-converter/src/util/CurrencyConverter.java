package util;

public class CurrencyConverter {

    //Preço do dolar
    public static double dollarPrice;

    //Define a cotação do dolar
    public static void setDollarPrice(double price){
        dollarPrice = price;
    }

    //Define a quantidade de dolares compraveis
    public static double calculateDollars( double amountInReais){
        return amountInReais / (dollarPrice * 1.06);
    }

    //Calcula o valor a ser pago em reais
    public static double calculateAmountInReais (double dollarsToBuy){
        return dollarsToBuy * dollarPrice * 1.06;
    }

}
