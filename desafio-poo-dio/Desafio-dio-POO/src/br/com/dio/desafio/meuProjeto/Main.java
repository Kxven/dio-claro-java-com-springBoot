package br.com.dio.desafio.meuProjeto;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new ProdutoFisico("Bolacha", 5.0, 3, 3.7);
        Produto produto2 = new ProdutoDigital("Jogo Steam", 200.0, 9, 1.000);
        /*Carrinho carrinho = new Carrinho();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);*/
        /*
        Pedido pedido = new Pedido(carrinho.getProdutos());
        System.out.println("===============");
        pedido.confirmarPedido();
        System.out.println("Pedido confirmado. Status : " + pedido.getStatus());
        System.out.println(produto1.getQuantidadeEmEstoque());
        System.out.println(produto2.getQuantidadeEmEstoque());
        System.out.println("===============");
         */
        Cliente keven = new Cliente("Keven", "Rua A");
        System.out.println();
        keven.adicionarAoCarrinho(produto1,3);
        keven.adicionarAoCarrinho(produto2,2);
        System.out.println(produto1.getQuantidadeEmEstoque());
        Pagamento cartaoDebito = new CartaoDebito();
        keven.finalizarPedido(cartaoDebito);
    }
}
