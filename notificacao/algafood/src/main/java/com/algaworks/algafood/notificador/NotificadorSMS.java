package com.algaworks.algafood.notificador;

import com.algaworks.algafood.model.Cliente;

public class NotificadorSMS {

    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notificando %s por SMS atraves do telefone %s: %s\n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
