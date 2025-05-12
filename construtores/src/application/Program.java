package application;

import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = scan.nextLine(); //Variavel temporaria
        System.out.print("Price: ");
        double price = scan.nextDouble(); //Variavel temporaria

        Product product = new Product(name, price); //Criação do objeto product com os construtores definidos

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt(); //Cria a variavel e solicita uma quantidade
        product.addProducts(quantity); //Chama a variavel de adição e mostra a nova quantidade adicionada

        System.out.println();
        System.out.println("Update data: " + product); //Mostra product com dados atualizados

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
    }
}