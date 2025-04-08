import java.util.Scanner;

public class AtribuicaoAcumulativa {
    public static void main(String[] args) {

        Scanner scan = new Scanner( System.in);

        int minutos = scan.nextInt();

        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0; //a variavel conta recebe conta + minutos, forma abreviada
        }
        System.out.printf("Valor da conta = R$ %.2f", conta);

    }
}
