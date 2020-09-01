package Exercicio2;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

        PagamentoOnline paypal = new Paypal();
        ContratoService contratoService = new ContratoService(paypal);

        Date data = new Date(118, 6, 25); //25/06/2018

        Contrato contrato1 = new Contrato(1, data, 600.00);

        contratoService.processaContrato(contrato1, 3);
    }
}
