package com.project.infnet.javaproject.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
@Data
@Entity
@Table(name = "proposal")
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Provider supplier;
    ArrayList<String> budget;
    Product product;
    int deliveryTime;

    public Proposal(Provider supplier, Product product, int deliveryTime) {
        this.supplier = supplier;
        this.budget = new ArrayList<>();
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposal(Provider supplier, ArrayList<String> budget, Product product, int deliveryTime) {
        this.supplier = supplier;
        this.budget = budget;
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposal() {
    }
}
