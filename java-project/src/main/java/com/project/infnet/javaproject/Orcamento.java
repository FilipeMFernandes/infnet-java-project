package com.project.infnet.javaproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orcamento {
    Double price;
    Double freight ;
    Double fee;
    String cnpj;
}
