package br.com.dio.desafio.meuProjeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private String nome;
    private String enderecos;
    private int quantidade;

    private Carrinho carrinhoDeCompras;
    private List<Pedido> pedidos;

    public Cliente(String nome, String enderecos) {
        this.nome = nome;
        this.enderecos = enderecos;
        this.quantidade = quantidade;
        this.carrinhoDeCompras = new Carrinho();
        this.pedidos = new ArrayList<>();
    }
    public void adicionarAoCarrinho(Produto produto, int quantidade){
        carrinhoDeCompras.adicionarProduto(produto, quantidade);
    }
    public boolean processarPagamento(double total){
        if(total>0){
            System.out.println("Pagamento Efetuado com sucesso!");
            return true;
        }else{
        System.out.println("Pagamento Falhou!");
        return false;
        }
    }
    public void removerProdutoDoCarrinho(Produto produto){
        carrinhoDeCompras.removerProduto(produto);
    }
    public Pedido finalizarPedido(Pagamento pagamento){
        double total = carrinhoDeCompras.calcularTotal();
        if(pagamento.processarPagamento(total)){
            Pedido pedido = new Pedido(carrinhoDeCompras.getProdutos());
            pedido.confirmarPedido();
            pedidos.add(pedido);
            carrinhoDeCompras = new Carrinho();
            return pedido;
        }else{
            System.out.println("Não foi possivel concluir o pedido! TENTE NOVAMENTE");
            return null;
        }
    }
    public List<Pedido> getHistoricoDePedidos(){
        return pedidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(String enderecos) {
        this.enderecos = enderecos;
    }
}
