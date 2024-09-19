package mainJava.list.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProduto() {
        this.estoqueProdutosMap = new HashMap<>();
    }
    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    public double calculaValorTotal(){
        double valorTotalEstoque = 0.0;
       if(!estoqueProdutosMap.isEmpty()){
           for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
           }
       }
       return valorTotalEstoque;
    }
    public Produto obterProdutorMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }
    public Produto obterProdutorMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
        for(Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
            Produto produtoMaiorQuantidadeEstoque = null;
            double maiorValorTotalProdutoEstoque = 0d;
            if(!estoqueProdutosMap.isEmpty()){
                for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){
                    double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                    if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque){
                        maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                        produtoMaiorQuantidadeEstoque = entry.getValue();
                    }
                }
            }
            return produtoMaiorQuantidadeEstoque;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.adicionarProduto(1l, "Produto A", 10, 5.0);
        estoqueProduto.adicionarProduto(2l, "Produto B", 5, 10.0);
        estoqueProduto.adicionarProduto(3l, "Produto C", 2, 15.0);
        estoqueProduto.exibirProdutos();
        System.out.println(estoqueProduto.calculaValorTotal());
        System.out.println(estoqueProduto.obterProdutorMaisCaro());
        System.out.println(estoqueProduto.obterProdutorMaisBarato());
        System.out.println(estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
