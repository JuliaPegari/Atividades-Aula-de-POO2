package Exercicio2_1bi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContratoService {




    private PagamentoOnline pagamentoOnline;

    public ContratoService(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public void processaContrato(Contrato contrato, int meses) {

        double parcela = contrato.getValor_total() / meses;

        for (int i = 0; i < meses; i++) {
            Date data = addMonths(contrato.getData_contrato(), i);

            Calendar cal = Calendar.getInstance();
            cal.setTime(data);
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

            double valor = pagamentoOnline.juros(pagamentoOnline.taxaDePagamento(parcela), i);
            System.out.println("Vencimento: " + formatador.format(data) + " Preço: " + valor);
        }

    }

    private Date addMonths(Date date, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }

}
