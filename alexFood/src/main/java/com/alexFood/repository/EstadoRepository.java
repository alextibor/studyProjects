package com.alexFood.repository;

import com.alexFood.model.Cozinha;
import com.alexFood.model.Estado;

import java.util.List;

public interface EstadoRepository {
    List<Estado> listar();
    Estado buscar(Long id);
    Estado salvar(Estado estado);
    void remover(Estado estado);
}
