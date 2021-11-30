package com.testes.mongodb.MongoDB.dataprovider.gateway.database.impl;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import com.testes.mongodb.MongoDB.core.usecase.InsertPessoaBoundary;
import com.testes.mongodb.MongoDB.dataprovider.gateway.database.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InsertPessoaGateway implements InsertPessoaBoundary {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa execute(Pessoa pessoa) {
        pessoaRepository.save(pessoa);
        System.out.println("Pessoa salva com Sucesso");
        return pessoa;
    }
}
