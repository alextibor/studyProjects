package com.javaLangObject.notificacao;

import com.javaLangObject.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente client, String mensagem);

}
