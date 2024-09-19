package mainJava.list.set.pesquisa;

public class Contato {
        private String nome;
        private int numeroTelefone;

    public Contato(String nome, int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.nome = nome;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }
}
