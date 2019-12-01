package com.project.infnet.javaproject.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
@Data
@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "title")
    String title;
    @Column(name = "description")
    String description;
    @Column(name = "quantidade")
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
