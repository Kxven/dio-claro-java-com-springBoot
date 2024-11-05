package br.com.dio.desafio.meuProjeto;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Pedido {
    private List<Produto> produtos;
    private String  status;

    public Pedido(List<Produto> produtos) {
        this.produtos = produtos;
        this.status = "Em processamento";
    }

    public void confirmarPedido(){
        this.status = "Confirmado";
        produtos.forEach(p -> p.atualizarEstoque(1));
    }
    public void cancelarPedido(){
        this.status = "Cancelado";
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "produtos=" + produtos +
                ", status='" + status + '\'' +
                '}';
    }
}
