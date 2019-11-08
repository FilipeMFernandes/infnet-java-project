package com.project.infnet.javaproject;

import lombok.Data;

import java.util.ArrayList;
@Data
public class Proposta {
    Fornecedor supplier;
    ArrayList<String> budget;
    Produto product;
    int deliveryTime;

    public Proposta(Fornecedor supplier, Produto product, int deliveryTime) {
        this.supplier = supplier;
        this.budget = new ArrayList<>();
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposta(Fornecedor supplier, ArrayList<String> budget, Produto product, int deliveryTime) {
        this.supplier = supplier;
        this.budget = budget;
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposta() {
    }
}
