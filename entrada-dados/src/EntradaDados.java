import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        //LEITURA DE STRING
        String x;
        System.out.println("Digite");
        x = scanner.next(); //lê o comando digitado
        System.out.println("Você digitou: " + x);


        //LEITURA DE NUMERO INTEIRO
        int y;
        System.out.println("Digite um numero inteiro");
        y = scanner.nextInt();
        System.out.println("O número inteiro digitado foi: " + y);


        //LEITURA EM NUMERO DECIMAL
        double z;
        System.out.println("Digite um numero decimal");
        z = scanner.nextDouble();
        System.out.println("Seu numero é: " + z);


        //LEITURA DE CARACTER
        char b;
        System.out.println("Digite um caracter: ");
        b = scanner.next().charAt(0); //esse comando recebe 0 pois é o primeiro caracter
        System.out.println("O primeiro caracter digitado foi: " + x);


        //nexLine() -- Realiza a leitura com a linha sendo quebrada
        //ao fazer o nextLine uma linha fica como pendente, nesse caso é recomendado realizar um nextLine extra para não haver esse consumo
        scanner.close();
    }
}

