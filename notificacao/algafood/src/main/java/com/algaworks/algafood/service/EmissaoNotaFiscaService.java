package com.algaworks.algafood.service;

import com.algaworks.algafood.model.*;
import com.algaworks.algafood.notificador.Notificador;


public class EmissaoNotaFiscaService {

    private Notificador notificador;

    public EmissaoNotaFiscaService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        this.notificador.notificar(cliente, "Nota fiscal do produto"
            + produto.getNome() + " foi emitida"
        );
    }
}
