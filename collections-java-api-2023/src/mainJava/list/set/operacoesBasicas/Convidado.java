package mainJava.list.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
    //Atributo
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.codigoConvite = codigoConvite;
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
