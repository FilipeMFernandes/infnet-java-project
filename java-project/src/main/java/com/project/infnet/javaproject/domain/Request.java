package com.project.infnet.javaproject.domain;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Request {
    String title;
    String description;
    int quantidade;
    ArrayList<String> propostas;

    public Request(String title, String description, int quantidade, ArrayList<String> propostas) {
        this.title = title;
        this.description = description;
        this.quantidade = quantidade;
        this.propostas = propostas;
    }

    public Request(String title, String description, int quantidade) {
        this.title = title;
        this.description = description;
        this.quantidade = quantidade;
        this.propostas = new ArrayList<>();
    }

    public Request() {
    }
}
