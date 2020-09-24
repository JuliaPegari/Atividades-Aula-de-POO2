package Exercicio3;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Número: ");
        int number = sc.nextInt();
        System.out.println("Titular: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();
        System.out.println("Limite de Saque: ");
        double limite = sc.nextDouble();

        Conta conta = new Conta(number, titular, saldo, limite);

        try{
            conta.saque(1000.00);
        }
        catch (ContaExceptions exc){
            System.out.println("Erro no saque!" + exc.getMessage());
        }
    }
}
