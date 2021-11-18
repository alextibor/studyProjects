package com.alexFood.repository;

import com.alexFood.model.Cidade;
import com.alexFood.model.Cozinha;

import java.util.List;

public interface CidadeRepository {
    List<Cidade> listar();
    Cidade buscar(Long id);
    Cidade salvar(Cidade cidade);
    void remover(Cidade cidade);
}
