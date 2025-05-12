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

        //Não seria possivel alterar o nome dessa forma, pois name é privado agora, então...
        //product.name = "Computer";

        //Criamos o setName, passando o valor que desejamos como nome
        product.setName("Computer");
        // Criamos o getName para pegarmos o novo valor de nome
        System.out.println("Updated name: " + product.getName());

        product.setPrice(1099.99);
        System.out.println("Updated price: " + product.getPrice());


        System.out.println("Product in stock: " + product.getQuantity());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Update data: " + product);
    }
}