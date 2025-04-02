//Programa que calcula o valor de um circulo e sua area com 4 casas decimais

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double PI = 3.14;

        System.out.println("Digite o valor do raio do circulo: ");
        double raio = scanner.nextDouble();
        double area = PI * raio * raio;
        System.out.printf("A área do círculo é %.4f%n", area);
    }
}
