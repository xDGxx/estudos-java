//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso.

import java.util.Scanner;

public class ExercicioFor1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE UM VALOR E DESCUBRA OS NÚMEROS PARES ATÉ ELE");
        int x = scan.nextInt();

        for ( int i = 0; i<=x; i++ ){
            if ( i % 2 != 0){
                System.out.println(i);
            }
        }

    }

}
