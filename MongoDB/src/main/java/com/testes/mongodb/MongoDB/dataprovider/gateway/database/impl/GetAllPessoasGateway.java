package com.testes.mongodb.MongoDB.dataprovider.gateway.database.impl;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import com.testes.mongodb.MongoDB.core.usecase.GetAllPessoasBoundary;
import com.testes.mongodb.MongoDB.dataprovider.gateway.database.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class GetAllPessoasGateway implements GetAllPessoasBoundary {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public List<Pessoa> execute() {
        return pessoaRepository.findAll();
    }
}
