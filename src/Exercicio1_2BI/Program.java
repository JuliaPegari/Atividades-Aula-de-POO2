package Exercicio1_2BI;

import Exercicio2_2BI.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        int i = 0;

        Map<Integer, String> Lista = new HashMap<>();
        Lista.put(32,"John");
        Lista.put(30,"Júlia");
        Lista.put(33,"Ali");

        Map<Integer, String> Lista2 = new HashMap<>();
        Lista2.put(32,"Andreia");
        Lista2.put(30,"Jose");
        Lista2.put(33,"Bruno");

        Map<Integer, String> Lista3 = new HashMap<>();
        Lista3.put(32,"Babi");
        Lista3.put(30,"Oddy");
        Lista3.put(33,"Scooby");

        ArrayList<Map<Integer, String>> contatos = new ArrayList<>();
        contatos.add(Lista);
        contatos.add(Lista2);
        contatos.add(Lista3);

        for (Map<Integer, String> contato: contatos) {
            System.out.printf("\n" + contato);
            i++;
        }

    }
}
