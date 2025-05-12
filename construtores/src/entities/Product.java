package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    //criação do construtor Product informando de forma obrigatória name, preço e quantidade
    public Product(String name, double price, int quantity){
        this.name = name; //o this referencia o objeto da classe, nesse caso this.name chama a linha 5
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts (int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){

        this.quantity -= quantity;
    }

    public String toString (){
        return name
                + ", $ "
                + String.format("%.2f", price) //Modelo de mascara para que a string seja visivel com duas casas decimais
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}