package mainJava.list.map.Ordenação;


import java.util.*;

public class LivrariaOnline {
    private Map<String, main.java.map.Ordenacao.Livro> livros;

    public LivrariaOnline() {
        this.livros = new HashMap<>();
    }

    public void adicionarLivro(String link, main.java.map.Ordenacao.Livro livro) {
        livros.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, main.java.map.Ordenacao.Livro> entry : livros.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livros.remove(chave);
        }
    }

    public Map<String, main.java.map.Ordenacao.Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, main.java.map.Ordenacao.Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, main.java.map.Ordenacao.Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, main.java.map.Ordenacao.Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, main.java.map.Ordenacao.Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, main.java.map.Ordenacao.Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livros.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new main.java.map.Ordenacao.ComparatorPorAutor());

        Map<String, main.java.map.Ordenacao.Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, main.java.map.Ordenacao.Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public Map<String, main.java.map.Ordenacao.Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, main.java.map.Ordenacao.Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, main.java.map.Ordenacao.Livro> entry : livros.entrySet()) {
            main.java.map.Ordenacao.Livro livro = entry.getValue();
            if (livro.getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), livro);
            }
        }
        return livrosPorAutor;
    }

    public List<main.java.map.Ordenacao.Livro> obterLivroMaisCaro() {
        List<main.java.map.Ordenacao.Livro> livrosMaisCaros = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        if (!livros.isEmpty()) {
            for (main.java.map.Ordenacao.Livro livro : livros.values()) {
                if (livro.getPreco() > precoMaisAlto) {
                    precoMaisAlto = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, main.java.map.Ordenacao.Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisAlto) {
                main.java.map.Ordenacao.Livro livroComPrecoMaisAlto = livros.get(entry.getKey());
                livrosMaisCaros.add(livroComPrecoMaisAlto);
            }
        }
        return livrosMaisCaros;
    }

    public List<main.java.map.Ordenacao.Livro> obterLivroMaisBarato() {
        List<main.java.map.Ordenacao.Livro> livrosMaisBaratos = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        if (!livros.isEmpty()) {
            for (main.java.map.Ordenacao.Livro livro : livros.values()) {
                if (livro.getPreco() < precoMaisBaixo) {
                    precoMaisBaixo = livro.getPreco();
                }
            }
        } else {
            throw new NoSuchElementException("A livraria está vazia!");
        }

        for(Map.Entry<String, main.java.map.Ordenacao.Livro> entry: livros.entrySet()) {
            if(entry.getValue().getPreco() == precoMaisBaixo) {
                main.java.map.Ordenacao.Livro livroComPrecoMaisBaixo = livros.get(entry.getKey());
                livrosMaisBaratos.add(livroComPrecoMaisBaixo);
            }
        }
        return livrosMaisBaratos;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new main.java.map.Ordenacao.Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new main.java.map.Ordenacao.Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new main.java.map.Ordenacao.Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new main.java.map.Ordenacao.Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new main.java.map.Ordenacao.Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new main.java.map.Ordenacao.Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);

    }


}



