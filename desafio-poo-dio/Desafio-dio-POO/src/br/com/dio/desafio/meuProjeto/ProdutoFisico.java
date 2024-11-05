package br.com.dio.desafio.meuProjeto;

public class ProdutoFisico extends Produto{
    private double peso;
    public ProdutoFisico(String nome, double preco, int quantidadeEmEstoque, double peso) {
        super(nome, preco, quantidadeEmEstoque);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "peso=" + peso +
                '}';
    }
}
