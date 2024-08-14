package exerciciosInterfaces.tiposPagamentos;

public class CartaoCredito implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no valor de : " + valor + " Realizado no crédito com sucesso!");
    }
}
