package exerciciosInterfaces.tiposPagamentos;

public class PayPal implements Pagamento {
    @Override
    public void realizarPagamento (double valor)  {
        System.out.println("Pagamento no valor de : " + valor + " Realizado no PayPal com sucesso!");
    }
}
