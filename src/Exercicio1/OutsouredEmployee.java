package Exercicio1;

public class OutsouredEmployee extends Employee{

    private double addicionalCharge = 1.1;

    public OutsouredEmployee(){

    }
    public OutsouredEmployee(String name, int hours, double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    @Override
    public double payment(double valuePerHour, int hours) {
        System.out.println("O valor do pagamento é: ");
        return valuePerHour * hours * addicionalCharge;
    }
}
