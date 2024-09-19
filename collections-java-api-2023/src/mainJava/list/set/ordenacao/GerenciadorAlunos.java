package mainJava.list.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }
    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;
        for(Alunos a : alunosSet){
            if(a.getMatricula()== matricula){
                alunoParaRemover = a;
                break;
            }
        }
        alunosSet.remove(alunoParaRemover);
    }
    public void exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        System.out.println(alunosPorNome);
    }
    public void exibirAlunosPorNota(){
        Set<Alunos> alunosNota = new TreeSet<>(new ComparatorPorNota());
        alunosNota.addAll(alunosSet);
        System.out.println(alunosNota);
    }
    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
