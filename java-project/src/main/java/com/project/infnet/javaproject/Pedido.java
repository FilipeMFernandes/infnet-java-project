package com.project.infnet.javaproject;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Pedido {
    String title;
    String description;
    int quantidade;
    ArrayList<String> propostas;

    public Pedido(String title, String description, int quantidade, ArrayList<String> propostas) {
        this.title = title;
        this.description = description;
        this.quantidade = quantidade;
        this.propostas = propostas;
    }

    public Pedido(String title, String description, int quantidade) {
        this.title = title;
        this.description = description;
        this.quantidade = quantidade;
        this.propostas = new ArrayList<>();
    }

    public Pedido() {
    }
}
