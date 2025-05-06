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

        //System.out.println(product); = ao tentar realizar essa
        // operação não mostrará a string e sim o nome product + números

        // Para que seja visivel como String, devemos criar a função
        // toString em Product pois a mesma também é um objeto

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
