//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA SOMATÓRIA");

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Quase lá... Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1+num2;

        System.out.println("Soma do número " + num1 + "mais o número " + num2 + "é igual a: " + soma);
    }
}
