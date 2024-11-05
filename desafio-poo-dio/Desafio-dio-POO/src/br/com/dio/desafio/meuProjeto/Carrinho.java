package br.com.dio.desafio.meuProjeto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    private double total;

    public void adicionarProduto(Produto produto, int quantidade){
        if (produto.reduziEstoque(quantidade)){
            produtos.add(produto);
            System.out.println("Produto " + produto.getNome() +  " Adicionado ao carrinho");
            exibirInformações(produto, quantidade);
        }else{
            System.out.println("Não foi possível adicionar o produto : " + produto.getNome());
        }
    }
    public void exibirProdutos(){
        System.out.println(produtos);
    }
    public void exibirInformações(Produto produto, int quantidade){
        System.out.println("Produto adicionado ao carrinho com sucesso : Nome: " + produto.getNome() + ", valor total do carrinho : " + produto.getPreco()*quantidade);
    }

    public double calcularTotal(){
        return total = produtos.stream().mapToDouble(Produto::getPreco).sum() ;
    }

    public void removerProduto(Produto produto){
        produtos.remove(produto);
    }
    public List<Produto> getProdutos(){
        return produtos;
    }
    @Override
    public String toString() {
        return "Carrinho{" +
                "produtos=" + produtos +
                ", total=" + total +
                '}';
    }
}
