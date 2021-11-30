package com.testes.mongodb.MongoDB.core.usecase;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InsertPessoaUsecase {

    private final InsertPessoaBoundary insertPessoaBoundary;

    public Pessoa execute(Pessoa pessoa){
        insertPessoaBoundary.execute(pessoa);
        return pessoa;
    }
}
