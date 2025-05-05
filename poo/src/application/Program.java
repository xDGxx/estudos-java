//Objetivo: Fazer um programa que leia as medidas dos lados de dois triângulos X e Y e
// mostre o valor das áreas e informe qual triângulo tem a maior área (Utilizando a fórmula de Heron)

package application;

import entities.Triangulo;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Entre com as medidas do triângulo X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Entre com as medidas do triângulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area();
        double areaY = y.area();
        
        System.out.printf("Área do triângulo X: %.4f%n", areaX);
        System.out.printf("Área do triângulo Y: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Maior área é X");
        }else{
            System.out.println("Maior área é Y");
        }

    }

}
