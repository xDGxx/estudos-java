package application;

import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = scan.nextLine();//nextLine faz a leitura do nome e guarda dentro da variável product no campo name
        System.out.print("Price: ");
        product.price = scan.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity= scan.nextInt();

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);


    }
}
