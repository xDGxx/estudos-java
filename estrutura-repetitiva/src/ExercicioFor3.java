//Fazer um programa para ler um número N.
// Depois leia N pares de números e mostre a divisão do primeiro pelo 2
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

import java.util.Scanner;

public class ExercicioFor3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE SEU NÚMERO: ");
        int n = scan.nextInt();

        for ( int i = 0; i < n; i++){

            System.out.println("DIGITE O PRIMEIRO NUMERO PARA DIVISÃO: ");
            int x = scan.nextInt();
            System.out.println("DIGITE O SEGUNDO NUMERO PARA DIVISÃO:  ");
            int y = scan.nextInt();

            if ( y == 0){
                System.out.println("divisão impossivel");
            } else {
                double div = (double) x/y;
                System.out.printf("%.1f", div);
            }

        }

    }

}
