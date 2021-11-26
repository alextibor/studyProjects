package com.algaworks.algafoodApi.domain.service;

import com.algaworks.algafoodApi.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafoodApi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafoodApi.domain.model.Cozinha;
import com.algaworks.algafoodApi.domain.repository.CozinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CadastroCozinhaService {

    @Autowired
    private CozinhaRepository cozinhaRepository;

    public Cozinha salvar(Cozinha cozinha){
       return cozinhaRepository.salvar(cozinha);
    }

    public void excluir(Long cozinhaId){
        try {
            cozinhaRepository.remover(cozinhaId);
        } catch (EntidadeNaoEncontradaException e) {
            throw new EntidadeNaoEncontradaException(
                    String.format("Não existe cadastro de cozinha com código %d", cozinhaId));
        } catch (DataIntegrityViolationException e) {
            throw new EntidadeEmUsoException(
                    String.format("Cozinha de código %d não pode ser removida, pois está em uso", cozinhaId));
        }
    }
}
