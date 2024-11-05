package br.com.dio.desafio.meuProjeto;

public class CartaoCredito implements Pagamento{
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento com cartã de crédito efetuado com suceso");
        return true;
    }
}
