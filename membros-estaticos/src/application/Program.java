package application;

import util.Calculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scan.nextDouble();

        // Como os objetos que precisamos de calculator são estaticos
        // Apenas chamamos a classe Calculator acessando o objeto que precisamos dentro do nosso main
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);


        System.out.printf("Circumference: %.2f\n ", c);
        System.out.printf("Volume: %.2f\n ", v);
        System.out.printf("PI value: %.2f\n ", Calculator.PI);

    }

}
