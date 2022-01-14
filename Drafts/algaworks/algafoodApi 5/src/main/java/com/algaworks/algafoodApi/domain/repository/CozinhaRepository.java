package com.algaworks.algafoodApi.domain.repository;

import com.algaworks.algafoodApi.domain.model.Cozinha;
import java.util.List;

public interface CozinhaRepository {

    List<Cozinha> listar();
    List<Cozinha> consultarPorNome(String nome);
    Cozinha buscar(Long id);
    Cozinha salvar(Cozinha cozinha);
    void remover(Long id);
}
