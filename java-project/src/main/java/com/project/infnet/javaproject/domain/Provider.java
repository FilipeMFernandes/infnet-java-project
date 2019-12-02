package com.project.infnet.javaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
@Table(name = "provider")
public class Provider extends Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
}
