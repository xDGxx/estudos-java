import java.util.Scanner;

//DO WHILE = Faça enquanto
// No do,é testado um bloco de comandos e no while é testada a condição para que aquilo seja true ou false,
// porém o bloco de comandos sempre é testado primeiro
public class DoWhile {

    public static void main(String[] args) {

        //Fazer um programa que leia a temperatura em Celsius e
        // mostra o equivalente em Fahrenheit e se o usuário deseja repetir (s/n)

        char resp;

        do { // o comando será executado até que...
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite a quantidade de graus: ");
            double C = scan.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir? (s/n)? ");
            resp = scan.next().charAt(0);
        } while (resp != 'n'); // esse comando seja verdadeiro

    }

}
