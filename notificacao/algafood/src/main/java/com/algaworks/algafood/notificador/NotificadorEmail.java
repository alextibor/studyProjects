package com.algaworks.algafood.notificador;

import com.algaworks.algafood.model.Cliente;
import org.springframework.stereotype.Component;

import java.lang.String;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){

        System.out.printf("Notificando %s atraves do email %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}
