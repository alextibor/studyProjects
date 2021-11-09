package com.notificacao;

import com.notificacao.model.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
