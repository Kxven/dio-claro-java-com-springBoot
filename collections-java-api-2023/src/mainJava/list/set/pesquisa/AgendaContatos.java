package mainJava.list.set.pesquisa;
import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {
    private Set<Contato> contatoSet;
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numeroTelefone){
        contatoSet.add(new Contato(nome, numeroTelefone));
    }
    public void exibirContatos(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPeloNome = new HashSet<>();
        if(!contatoSet.isEmpty()){
            for(Contato i : contatoSet){
                if(i.getNome().startsWith(nome)){
                    contatosPeloNome.add(i);
                    break;
                }
            }
        }else{
            throw new RuntimeException("O conjunto está vazio!");
        }
        return contatosPeloNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();
        contatos.adicionarContato("Pessoa 1", 1234);
        contatos.adicionarContato("Pessoa 2", 2345);
        contatos.adicionarContato("Pessoa 3", 3456);
        contatos.adicionarContato("Pessoa 4", 4567);
        contatos.exibirContatos();
        System.out.println(contatos.pesquisarPorNome("Pessoa 1"));
        contatos.atualizarNumeroContato("Pessoa 1", 8901);
        System.out.println(contatos.pesquisarPorNome("Pessoa 1"));
        contatos.exibirContatos();
    }
}
