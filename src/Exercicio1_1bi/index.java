package Exercicio1_1bi;

import java.util.Scanner;

class index {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        OutsouredEmployee two = new OutsouredEmployee();
        Employee one = new Employee();

        System.out.println("Digite seu nome");
        one.setName(myObj.nextLine());

        System.out.println("Digite o numero de horas trabalhadas");
        one.setHours(myObj.nextInt());

        System.out.println("\nDigite o valor da hora");
        one.setValuePerHour(myObj.nextDouble());

        System.out.println(one.payment(one.getValuePerHour(), one.getHours()));

        System.out.println("Digite seu nome");
        two.setName(myObj.next());

        System.out.println("Digite o numero de horas trabalhadas");
        two.setHours(myObj.nextInt());

        System.out.println("Digite o valor da hora");
        two.setValuePerHour(myObj.nextDouble());

        System.out.println(two.payment(two.getValuePerHour(), two.getHours()));

    }

}
