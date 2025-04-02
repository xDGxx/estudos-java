//Programa que calcula o sálario de um funcionário com
// base no valor de hora ganha pelo mesmo e suas horas trabalhadas.

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String funcionario;
        int numeroFuncionario;
        double horasTrabalhadas = 0;
        double valorHora = 6.49;

        System.out.println("Digite seu nome: ");
        funcionario = scan.next();

        System.out.println("Digite seu numero: ");
        numeroFuncionario = scan.nextInt();

        System.out.println("Digite suas horas trabalhadas: ");
        horasTrabalhadas = scan.nextDouble();

        double calculoSalario = valorHora * horasTrabalhadas;

        System.out.println("Olá " + funcionario + "! " + "Seu salario é de " + calculoSalario);
    }
}
