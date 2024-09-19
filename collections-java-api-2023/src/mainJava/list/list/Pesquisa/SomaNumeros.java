package mainJava.list.list.Pesquisa;
import java.util.List;
import java.util.ArrayList;
public class SomaNumeros {
    private List<Integer> numeros;
    public SomaNumeros(){
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }
    public int calcularSoma(){
        int resultado = 0;
        for (Integer i : numeros) {
            resultado += i;
        }
        return resultado;
    }
    public int encontrarMaiorNumero(){
        int resultado = 0;
        for (Integer i : numeros) {
            if(i>resultado){
                resultado = i;
            }
        }
        return resultado;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        for(Integer i : numeros){
            if(i<=menorNumero){
                menorNumero = i;
            }
        }
        return menorNumero;
    }
    public void exibirNumeros(){
        System.out.println(numeros);
    }
    public static void main(String[] args) {
        SomaNumeros num = new SomaNumeros();
        num.adicionarNumero(11);
        num.adicionarNumero(4);
        num.adicionarNumero(15);
        num.adicionarNumero(7);
        num.adicionarNumero(10);
        num.adicionarNumero(1);
        num.exibirNumeros();
        System.out.println(num.calcularSoma());
        num.exibirNumeros();
        System.out.println(num.encontrarMaiorNumero());
        num.exibirNumeros();
        System.out.println(num.encontrarMenorNumero());
    }

}   
