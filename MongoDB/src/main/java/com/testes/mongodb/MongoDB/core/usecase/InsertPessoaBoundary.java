package com.testes.mongodb.MongoDB.core.usecase;

import com.testes.mongodb.MongoDB.core.model.Pessoa;

public interface InsertPessoaBoundary {

    Pessoa execute(Pessoa pessoa);
}
