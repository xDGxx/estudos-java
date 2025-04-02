//Programa que calcula o preço total de dois produtos extraindo informações do usuário

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int qnt1, cod1, qnt2, cod2;
        double preco1, preco2, total;

        System.out.println("Digite o código do primeiro produto: ");
        cod1 = scan.nextInt();
        System.out.println("Digite a quantidade: ");
        qnt1 = scan.nextInt();
        System.out.println("Declare o preço: ");
        preco1 = scan.nextDouble();

        System.out.println("Digite o código do segundo produto: ");
        cod2 = scan.nextInt();
        System.out.println("Digite a quantidade: ");
        qnt2 = scan.nextInt();
        System.out.println("Declare o preço: ");
        preco2 = scan.nextDouble();

        total = preco1 * qnt1 + preco2 * qnt2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

    }
}
