//Nesse programa testei o Debug do Java no IntelliJ

import java.util.Scanner;

public class DebugJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double largura = scan.nextDouble();
        double comprimento = scan.nextDouble();
        double metroQuadrado = scan.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f", area);
        System.out.printf("PRECO = %.2f", preco);

    }

}
