//Fazer um programa que lê números inteiros até que um zero seja lido
// Ao final mostra a soma dos números lidos

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int x = scan.nextInt();

        int soma = 0;
        //enquanto x for diferente de 0, continua repetindo
        // verdadeiro = continua rodando
        // falso = pula fora
        while (x != 0){
            soma += x;
            x = scan.nextInt();
        }

        System.out.println("A soma dos valores digitados foram: " + soma);

    }

}
