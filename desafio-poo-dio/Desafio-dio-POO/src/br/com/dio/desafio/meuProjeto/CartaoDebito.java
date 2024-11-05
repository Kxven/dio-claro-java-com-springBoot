package br.com.dio.desafio.meuProjeto;

public class CartaoDebito implements Pagamento{

    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento com cartão de débito efetuado com sucessso");
        return true;
    }
}


