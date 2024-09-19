package mainJava.list.list.operaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarelaList;

    public ListaTarefa(){
        this.tarelaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarelaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarelaList){ 
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarelaList.removeAll(tarefasParaRemover);
    }
    public int obterONumeroDeTarefa(){
        return tarelaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarelaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de tarefas é : " + listaTarefa.obterONumeroDeTarefa());
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de tarefas é : " + listaTarefa.obterONumeroDeTarefa());
        listaTarefa.obterDescricoesTarefas();
    }
}

