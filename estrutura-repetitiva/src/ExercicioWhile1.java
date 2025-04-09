//Escreva um programa que repita a leitura de uma senha até que ela seja válida

import java.util.Scanner;

public class ExercicioWhile1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        int senha = scan.nextInt();

        while ( senha != 2004){
            System.out.println("Senha inválida, tente novamente: ");
            senha = scan.nextInt();
        }

        System.out.println("Acesso permitido");
    }

}
