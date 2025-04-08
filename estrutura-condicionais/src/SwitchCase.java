//Fazer um programa qpara ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1= domingo, 2= segunda e assim por diante).
//Escrever na tela o dia da semana correspondente

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana: ");
        int x = scan.nextInt();
        String dia;

        //selecionando (switch) x, temos casos, nesse caso 7 e um default,
        // onde cada caso se comporta de maneira diferente
        switch (x){
            case 1:
                dia = "domingo";
                break;

            case 2:
                dia = "segunda";
                break;

            case 3:
                dia = "terça-feira";
                break;

            case 4:
                dia = "quarta-feira";
                break;

            case 5:
                dia = "quinta-feira";
                break;

            case 6:
                dia = "sexta-feira";
                break;

            case 7:
                dia = "sábado";
                break;

            default:
                dia = "valor inválido";
                break;
        }

        System.out.println("Dia da semana: " + dia);

    }

}
