package mainJava.list.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer > agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }else{
            System.out.println("A lista está vazia!");
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }else{
            System.out.println("A lista está vazia!");
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Keven", 1);
        agendaContatos.adicionarContato("Tiago", 2);
        agendaContatos.adicionarContato("Juh", 3);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Keven");
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisaPorNome("Juh"));
    }
}
