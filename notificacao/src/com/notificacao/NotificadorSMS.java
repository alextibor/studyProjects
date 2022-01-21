package com.notificacao;

import com.notificacao.model.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
