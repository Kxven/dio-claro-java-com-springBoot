package exerciciosInterfaces.tiposPagamentos;

public class CartaoDebito implements Pagamento{
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento no valor de : " + valor + " Realizado no Débito com sucesso!");
    }
}
