package com.notificacao.service;

import com.notificacao.Notificador;
import com.notificacao.NotificadorEmail;
import com.notificacao.model.Cliente;
import com.notificacao.model.Produto;

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
