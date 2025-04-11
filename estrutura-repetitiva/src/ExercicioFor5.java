//Ler um numero inteiro e calcular todos os seus divisores

import java.util.Scanner;

public class ExercicioFor5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE UM NUMERO E DESCUBRA SEUS DIVISORES INTEIROS: ");
        int n = scan.nextInt();

        for(int i=0; i<=n; i++){
            if (n % i == 0){
                System.out.println(i);
            }
        }

    }

}
