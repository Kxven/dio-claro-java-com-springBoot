package mainJava.list.list.Ordenacao;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;
    
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        Collections.sort(numerosAscendentes);
        return numerosAscendentes;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(this.numerosList);
        numerosAscendentes.sort(Collections.reverseOrder());
        return numerosAscendentes;
    }
    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
          System.out.println(this.numerosList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(13);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(11);
        ordenacaoNumeros.exibirNumeros();
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
