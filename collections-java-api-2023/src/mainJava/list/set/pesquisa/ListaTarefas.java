package mainJava.list.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String nome, boolean descricao){
        this.tarefaSet.add(new Tarefa(nome, descricao));
    }
    public void removerTarefa(String descricao){
        Set<Tarefa> tarefaParaRemover = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefaSet.removeAll(tarefaParaRemover);
    }
    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }
    public int contarTarefas(){
        return tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t : tarefaSet){
           if(t.isConcluida()){
               tarefasConcluidas.add(t);
           }
        }
        return tarefasConcluidas;
    }public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t : tarefaSet){
           if(!t.isConcluida()){
               tarefasPendentes.add(t);
           }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
            }
        }
    }
    public void marcarTarefaPendente(String descricao){
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
            }
        }
    }
    public void limparListaTarefas(){
        tarefaSet.removeAll(tarefaSet);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Tarefa 1", false);
        listaTarefas.adicionarTarefa("Tarefa 2", false);
        listaTarefas.adicionarTarefa("Tarefa 3", false);
        listaTarefas.adicionarTarefa("Tarefa 4", true);
        listaTarefas.exibirTarefas();
        listaTarefas.removerTarefa("Tarefa 1");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());
        listaTarefas.marcarTarefaConcluida("Tarefa 3");
        listaTarefas.marcarTarefaPendente("Tarefa 4");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());


    }


}
