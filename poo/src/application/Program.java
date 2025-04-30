//Objetivo: Fazer um programa que leia as medidas dos lados de dois triângulos X e Y e
// mostre o valor das áreas e informe qual triângulo tem a maior área (Utilizando a fórmula de Heron)

package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Entre com as medidas do triângulo X: ");
        xA = scan.nextDouble();
        xB = scan.nextDouble();
        xC = scan.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        yA = scan.nextDouble();
        yB = scan.nextDouble();
        yC = scan.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior área é X");
        }else{
            System.out.println("Maior área é Y");
        }

    }

}
