package com.project.infnet.javaproject.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "proposal")
public class Proposal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "id_provider")
    Provider provider;

    @OneToOne
    @JoinColumn(name = "id_budget")
    ArrayList<String> budget;

    @ManyToMany
    @JoinColumn(name = "id_product")
    Product product;

    @Column(name = "deliveryTime")
    Integer deliveryTime;

    public Proposal(Provider provider, Product product, int deliveryTime) {
        this.provider = provider;
        this.budget = new ArrayList<>();
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposal(Provider provider, ArrayList<String> budget, Product product, int deliveryTime) {
        this.provider = provider;
        this.budget = budget;
        this.product = product;
        this.deliveryTime = deliveryTime;
    }

    public Proposal() {
    }
}
