package com.algaworks.algafoodApi.domain.service;

import com.algaworks.algafoodApi.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafoodApi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafoodApi.domain.model.Cidade;
import com.algaworks.algafoodApi.domain.model.Restaurante;
import com.algaworks.algafoodApi.domain.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class CadastroRestauranteService {

    @Autowired
    private RestauranteRepository restauranteRepository;

    public Restaurante salvar(Restaurante restaurante){

        return restauranteRepository.salvar(restaurante);
    }

    public void excluir(Long restauranteId){
        try {
            restauranteRepository.remover(restauranteId);
        } catch (EntidadeNaoEncontradaException e) {
            throw new EntidadeNaoEncontradaException(
                    String.format("Não existe cadastro de restaurante com código %d", restauranteId));
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format("Restaurante de código %d não pode ser removido, pois está em uso", restauranteId));
        }
    }

}
