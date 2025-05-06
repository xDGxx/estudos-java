package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts (int quantity){
        //ao informar o this, estamos chamando a variavel da classe e não da função (linha 7)
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