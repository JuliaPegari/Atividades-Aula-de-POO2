package Exercicio2_1bi;

public interface PagamentoOnline {

    double taxaDePagamento(double valor);
    double juros (double valor, int meses);
}
