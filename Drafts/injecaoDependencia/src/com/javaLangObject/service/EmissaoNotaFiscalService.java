package com.javaLangObject.service;

import com.javaLangObject.modelo.Cliente;
import com.javaLangObject.modelo.Produto;
import com.javaLangObject.notificacao.Notificador;
import com.javaLangObject.notificacao.NotificadorEmail;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto){
        this.notificador.notificar(cliente, "Nota fiscal do produto "
                + produto.getNome() + "foi emitida");
    }
}
