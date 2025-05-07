package application;

import entities.Student;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter your name: ");
        student.name = scan.nextLine();
        System.out.println("Enter your first grade: ");
        student.grade1= scan.nextDouble();
        System.out.println("Enter your second grade: ");
        student.grade2= scan.nextDouble();
        System.out.println("Enter your third grade:");
        student.grade3= scan.nextDouble();

        System.out.printf("FINAL GRADE: %.2f", student.finalGrade());

        if (student.finalGrade() < 60){
            System.out.println(" FAILED");
            System.out.printf("MISSING %.2f POINTS\n ", student.missingPoints());
        } else {
            System.out.println(" PASS");
        }

    }

}
