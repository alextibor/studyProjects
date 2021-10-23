package com.javaLangObject.service;

import com.javaLangObject.modelo.Cliente;
import com.javaLangObject.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente){
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
