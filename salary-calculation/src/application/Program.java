package application;

import entities.Employee;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.println("Name: ");
        emp.name = scan.nextLine();

        System.out.println("Gross Salary: ");
        emp.grossSalary = scan.nextDouble(); // Informação sobre o salario bruto

        System.out.println("Tax: ");
        emp.tax = scan.nextDouble(); //Qual a taxa a ser removida do salario

        System.out.println();
        System.out.println("Employee: " + emp); //Dados atuais do empregado

        System.out.println();
        System.out.println("Wich percentage to increase salary?: ");
        double percentage = scan.nextDouble();  //Informe a porcentagem do salario a ser adicionada

        System.out.println();
        System.out.println("Uptade data: " + emp); // Dados atualizados do empregado

    }
}
