//Programa que verifica se o número é impar ou par

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;

        System.out.println("Digite seu número: ");
        numero = scan.nextInt();

        if (numero % 2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Número ímpar");
        }

    }

}
