package mainJava.list.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else{
            System.out.println("A lista está vazia!!!");
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionarioMap.get(palavra);
        if(definicao != null){
            return definicao;
        }else{
            return "Linguagem não encontrada no dicionário";
        }
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Oi", "Cumprimento");
        dicionario.adicionarPalavra("Lindo", "Elogio");
        dicionario.adicionarPalavra("Vamos", "Ação");
        dicionario.removerPalavra("Oi");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Lindo"));
    }
}
