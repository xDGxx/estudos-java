//Fazer um programa que leia três números inteiros e mostre na tela o maior deles

import java.util.Scanner;

public class Funcoes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int higher = max(a,b,c);

        showResult(higher);

    }

        public static int max(int x, int y, int z){

            int aux;
            if (x > y && x > z){
                aux = x;
            }else if(y>z){
                aux = y;
            }else {
                aux = z;
            } return aux;
        }

        public static void showResult(int value){
            System.out.println("Higher = " + value);
    }

}
