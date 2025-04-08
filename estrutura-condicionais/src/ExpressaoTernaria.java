import java.util.Scanner;

public class ExpressaoTernaria {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // ? = sim
        // : = não

        /*DEMO
        double preco = 34.5;
        double desconto;
        if (preco < 20.0){
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05
        }
        */

        //TERNARIA
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);

    }

}
