//Programa para ler um numero inteiro e dizer se é negativo ou não

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite seu número: ");
        numero = scan.nextInt();

        if (numero < 0){
            System.out.println("Número negativo");
        }else{
            System.out.println("Número não negativo");
        }

    }
}
