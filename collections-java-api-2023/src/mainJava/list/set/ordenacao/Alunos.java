package mainJava.list.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Alunos implements Comparable<Alunos>{
    private String nome;
    private long matricula;
    double media;

    public Alunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alunos alunos = (Alunos) o;
        return matricula == alunos.matricula;
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public int compareTo(Alunos o) {
        return nome.compareTo(o.getNome());
    }
}
class ComparatorPorNota implements Comparator<Alunos>{
    @Override
    public int compare(Alunos o1, Alunos o2) {
        return Double.compare(o1.getMedia(),o2.getMedia());
    }
}