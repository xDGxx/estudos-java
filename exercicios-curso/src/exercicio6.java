// Programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.


import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

            A = scan.nextDouble();
            B = scan.nextDouble();
            C = scan.nextDouble();

            triangulo = A * C / 2.0;
            circulo = 3.14159 * C * C;
            trapezio = (A + B) / 2.0 * C;
            quadrado = B * B;
            retangulo = A * B;

            System.out.printf("TRIANGULO: %.3f%n", triangulo);
            System.out.printf("CIRCULO: %.3f%n", circulo);
            System.out.printf("TRAPEZIO: %.3f%n", trapezio);
            System.out.printf("QUADRADO: %.3f%n", quadrado);
            System.out.printf("RETANGULO: %.3f%n", retangulo);

    }
}
