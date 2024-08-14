package exerciciosInterfaces;

import exerciciosInterfaces.tiposPagamentos.CartaoCredito;
import exerciciosInterfaces.tiposPagamentos.CartaoDebito;
import exerciciosInterfaces.tiposPagamentos.Pagamento;
import exerciciosInterfaces.tiposPagamentos.PayPal;

public class Main {
    public static void main(String[] args) {
        Pagamento pag = new CartaoCredito();
        Pagamento p2 = new CartaoDebito();
        Pagamento p3 = new PayPal();

        pag.realizarPagamento(150.00);
        p2.realizarPagamento(2000.00);
        p3.realizarPagamento(15.00);
    }
}
