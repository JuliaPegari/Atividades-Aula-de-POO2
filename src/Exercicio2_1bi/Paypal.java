package Exercicio2_1bi;

public class Paypal implements PagamentoOnline{

    //constantes
    private double porcentagem_taxa = 0.02;
    private double juros_mensais = 0.01;

    @Override
    public double taxaDePagamento(double valor) {
        double resultado;
        resultado = valor + (porcentagem_taxa * valor);
        return resultado;
    }

    @Override
    public double juros(double valor, int meses) {
        double resultado;

        resultado = valor + ((juros_mensais * valor) * meses);

        return resultado;
    }
}
