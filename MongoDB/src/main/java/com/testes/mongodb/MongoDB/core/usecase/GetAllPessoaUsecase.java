package com.testes.mongodb.MongoDB.core.usecase;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetAllPessoaUsecase {

    private final GetAllPessoasBoundary getAllPessoasBoundary;

    public List<Pessoa> execute(){
        System.out.println("Buscando Pessoas...");
        return getAllPessoasBoundary.execute();
    }
}
