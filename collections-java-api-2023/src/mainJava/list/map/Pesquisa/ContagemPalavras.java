package mainJava.list.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer > contagemMap;

    public ContagemPalavras() {
        this.contagemMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }
    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }
    public int exibirContagemPalavras(){
        int contagemTotal = 0;
        for(int c : contagemMap.values()){
            contagemTotal += c;
        }
        return contagemTotal;
    }
    public String encontrarPalavraMaisFrequente(){
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for(Map.Entry<String, Integer> entry : contagemMap.entrySet()){
            if(entry.getValue() > maiorContagem){
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Java", 2);
        contagemPalavras.adicionarPalavra("Python", 8);
        contagemPalavras.adicionarPalavra("JavaScript", 1);
        contagemPalavras.adicionarPalavra("C#", 6);
        System.out.println(contagemPalavras.exibirContagemPalavras());
        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }

}
