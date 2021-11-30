package com.testes.mongodb.MongoDB.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Getter
@Setter
@Document
public class Pessoa {

    @Id
    private long id;
    private String name;
    private int idade;

}
