package com.algaworks.algafoodApi.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public EntidadeNaoEncontradaException(String mensagem){
        super(mensagem);
    }
}
