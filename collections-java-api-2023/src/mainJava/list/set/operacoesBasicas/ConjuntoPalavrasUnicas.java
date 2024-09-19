package mainJava.list.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasSet;
    public ConjuntoPalavrasUnicas() {
        palavrasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        if(!palavrasSet.isEmpty()){
            if(palavrasSet.contains(palavra)){
                palavrasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }else{
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("OI");
        conjuntoPalavrasUnicas.adicionarPalavra("Olá");
        conjuntoPalavrasUnicas.adicionarPalavra("SLV");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("OI"));
        conjuntoPalavrasUnicas.removerPalavra("SLV");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("OI"));
    }

}

