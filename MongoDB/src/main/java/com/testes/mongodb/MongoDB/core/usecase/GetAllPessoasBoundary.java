package com.testes.mongodb.MongoDB.core.usecase;

import com.testes.mongodb.MongoDB.core.model.Pessoa;

import java.util.List;

public interface GetAllPessoasBoundary {

    List<Pessoa> execute();
}
