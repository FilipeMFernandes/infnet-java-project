package com.project.infnet.javaproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Budget {
    Double price;
    Double freight ;
    Double fee;
    String cnpj;
}
