//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//exemplo.

import java.util.Scanner;

public class ExercicioWhile3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("POSTO DE COMBUSTÍVEL: \n OPÇÃO 1: ALCOOL \n OPÇÃO 2: GASOLINA \n OPÇÃO 3: DIESEL" );

        System.out.println("Por favor informe sua opção: ");
        int tipo = scan.nextInt();

        while( tipo != 4){
            if (tipo == 1){
                alcool +=1;
            }else if (tipo == 2){
                gasolina += 1;
            }else if ( tipo == 3){
                diesel += 1;
            }else {
                System.out.println("Opção inexistente, por favor inserir de 1 a 4");
            }

            tipo = scan.nextInt();

        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

    }

}
