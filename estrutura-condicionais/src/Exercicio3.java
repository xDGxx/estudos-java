import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();

        System.out.println("Digite o egundo valor: ");
        b = scan.nextInt();

        if (a % b == 0 && b % a == 0){
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são múltiplos");
        }
    }
}
