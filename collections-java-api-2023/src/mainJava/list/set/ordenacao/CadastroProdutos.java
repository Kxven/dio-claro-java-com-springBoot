package mainJava.list.set.ordenacao;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class CadastroProdutos {
    private Set<Produtos> produtoSet;
    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produtos(nome, cod, preco, quantidade));
    }
    public Set<Produtos> exibirProdutoPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produtos> exibirPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new compararPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1, "P1",10.0, 1);
        cadastroProdutos.adicionarProduto(2, "P2",15.3, 2);
        cadastroProdutos.adicionarProduto(3, "P3",7.3, 3);
        System.out.println(cadastroProdutos);
        System.out.println(cadastroProdutos.exibirProdutoPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}

