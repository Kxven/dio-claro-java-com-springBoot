package mainJava.list.set.ordenacao;
import java.util.Comparator;
import java.util.Objects;
public class Produtos implements Comparable<Produtos>{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;
    public Produtos(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public int compareTo(Produtos o) {
        return nome.compareToIgnoreCase(o.getNome());
    }
    public String getNome() {
        return nome;
    }
    public long getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return codigo == produtos.codigo;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
class compararPorPreco implements Comparator<Produtos>{
    @Override
    public int compare(Produtos o1, Produtos o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}