package com.project.infnet.javaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Company {
    String name;
    String corporateName;
    String cnpj;
    Double rating;
}
