package com.algaworks.algafood.notificador;

import com.algaworks.algafood.model.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
