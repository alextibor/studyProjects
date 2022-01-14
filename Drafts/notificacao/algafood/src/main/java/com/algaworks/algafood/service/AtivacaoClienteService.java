package com.algaworks.algafood.service;

import com.algaworks.algafood.model.Cliente;
import com.algaworks.algafood.notificador.Notificador;
import com.algaworks.algafood.notificador.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class AtivacaoClienteService {

    private Notificador notificador;

    @Autowired
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
