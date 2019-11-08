package com.project.infnet.javaproject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Empresa  {
    String name;
    String corporateName;
    String cnpj;
    Double rating;
}
