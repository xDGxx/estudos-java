package entities; //pacote da classe

public class Triangulo { //Nome da classe

    public double a; //Atributo da classe
    public double b; //Atributo da classe
    public double c; //Atributo da classe


    //public indica que o atributo ou metodo pode ser acesso em outros arquivos
    public double area(){
        //double informa o tipo de dado que o metodo retorna
        //area é o nome do metodo
        
        //corpo do metodo
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p-a) * (p-b) * (p-c));
    }

}
