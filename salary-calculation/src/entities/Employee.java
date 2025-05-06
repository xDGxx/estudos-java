package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double nextSalary() { //Afirma que o proximo salario será o salario bruto com adicção da taxa
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage){ // Incremento do salario com a porcentagem
        grossSalary += grossSalary * percentage / 100;
    }

    public String toString(){ //Impressão em toString dos dados do funcionario
        return name
                + ", $ "
                + String.format("%.2f", nextSalary());
    }

}
