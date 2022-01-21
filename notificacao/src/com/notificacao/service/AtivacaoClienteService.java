package com.notificacao.service;

import com.notificacao.Notificador;
import com.notificacao.NotificadorEmail;
import com.notificacao.NotificadorSMS;
import com.notificacao.model.Cliente;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
