package com.testes.mongodb.MongoDB.dataprovider.gateway.database.repository;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, Long> {
}
