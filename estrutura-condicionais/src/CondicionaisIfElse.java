import java.util.Scanner;

public class CondicionaisIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas?");
        hora = scan.nextInt();
        
        if(hora < 12){
            System.out.println("Bom dia!");
        } else if (hora >= 12 & hora < 18) {
            System.out.println("Boa tarde");
        }else{
            System.out.println("Boa noite");
        }

    }
}
