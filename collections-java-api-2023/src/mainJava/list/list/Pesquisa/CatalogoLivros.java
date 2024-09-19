package mainJava.list.list.Pesquisa;
import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private List<Livros> livrosList;

    public CatalogoLivros() {  this.livrosList = new ArrayList<>();}
    
    public void adicionarLivro(String titulo, String autor, int anoPubicacao){      
            livrosList.add(new Livros(titulo, autor, anoPubicacao));
    };

    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
            return livrosPorAutor;
        }else {
            throw new RuntimeException("A lista está vazia!");
          }
    }
    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livros l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
            return livrosPorIntervaloAnos;
        }else {
            throw new RuntimeException("A lista está vazia!");
          }
    }
    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTituLivros = null;
        if(!livrosList.isEmpty()){
            for(Livros l : livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTituLivros = l;
                    break;
                }
            }
            return livroPorTituLivros;
        }else {
            throw new RuntimeException("A lista está vazia!");
          }
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("O Menino", "joao", 2000);
        catalogoLivros.adicionarLivro("É assim que acaba", "Maria", 2020);
        catalogoLivros.adicionarLivro("A Menina", "Autor 1", 1999);
        catalogoLivros.adicionarLivro("O Menino", "joao", 2000);

        System.out.println(catalogoLivros.pesquisarPorAutor("joao") );

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1998, 2001));

        System.out.println(catalogoLivros.pesquisarPorTitulo("O Menino"));
    }

}
