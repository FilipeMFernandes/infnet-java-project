package com.project.infnet.javaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "budget")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Logo vai ser o SEQUENCE
    Long id;
    @Column(name = "price")
    Double price;
    @Column(name = "freight")
    Double freight ;
    @Column(name = "fee")
    Double fee;
    @Column(name = "cnpj")
    String cnpj;

}
