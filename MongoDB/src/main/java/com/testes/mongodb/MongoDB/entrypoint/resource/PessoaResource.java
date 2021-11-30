package com.testes.mongodb.MongoDB.entrypoint.resource;

import com.testes.mongodb.MongoDB.core.model.Pessoa;
import com.testes.mongodb.MongoDB.core.usecase.GetAllPessoaUsecase;
import com.testes.mongodb.MongoDB.core.usecase.GetAllPessoasBoundary;
import com.testes.mongodb.MongoDB.core.usecase.InsertPessoaBoundary;
import com.testes.mongodb.MongoDB.core.usecase.InsertPessoaUsecase;
import com.testes.mongodb.MongoDB.dataprovider.gateway.database.impl.GetAllPessoasGateway;
import com.testes.mongodb.MongoDB.dataprovider.gateway.database.impl.InsertPessoaGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/pessoas")
public class PessoaResource {

    private GetAllPessoaUsecase getAllPessoaUsecase;
    private InsertPessoaUsecase insertPessoaUsecase;

    @GetMapping
    private List<Pessoa> getAllPessoas(){
        return getAllPessoaUsecase.execute();
    }

    @PostMapping
    private Pessoa insertPessoa(@RequestBody Pessoa pessoa){
        return insertPessoaUsecase.execute(pessoa);
    }

}
