//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

import java.util.Scanner;

public class ExercicioFor4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int fat = 1;

        for(int i = 0; i<=n; i++){
            fat *= i;
        }

        System.out.println(fat);
    }

}
