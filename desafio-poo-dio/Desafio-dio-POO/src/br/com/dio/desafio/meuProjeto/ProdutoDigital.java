package br.com.dio.desafio.meuProjeto;

public class ProdutoDigital extends Produto{
    private double tamanhoEmMb;

    public ProdutoDigital(String nome, double preco, int quantidadeEmEstoque, double tamanhoEmMb) {
        super(nome, preco, quantidadeEmEstoque);
        this.tamanhoEmMb = tamanhoEmMb;
    }

    public double getTamanhoEmMb() {
        return tamanhoEmMb;
    }

    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "tamanhoEmMb=" + tamanhoEmMb +
                '}';
    }
}
