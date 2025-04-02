//Programa que calcula 4 valores e mostra da diferença do produto A e B pelo produto C e D

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int A, B, C, D;

        System.out.println("Digite o primeiro valor: ");
        A = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        B = scan.nextInt();
        System.out.println("Digite o terceiro valor: ");
        C = scan.nextInt();
        System.out.println("Digite o quarto valor: ");
        D = scan.nextInt();

        int dif = A * B - C * D;

        System.out.println( "Diferença " + dif );
    }
}
