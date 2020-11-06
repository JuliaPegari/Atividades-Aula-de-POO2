package Exercicio2_2BI;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Cliente clientes1 = new Cliente(1, "Júlia", 21, "999876420");
        Cliente clientes2 = new Cliente(2, "Ali", 25, "912323");
        Cliente clientes3 = new Cliente(3, "Amor", 30, "9931240");

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(clientes1);
        clientes.add(clientes2);
        clientes.add(clientes3);

        int i = 0;
        for (Cliente contato: clientes) {
            System.out.printf("\nNome: " + contato.getNome() + " - Tell: " + contato.getTelefone());
            i++;
        }

    }


}


