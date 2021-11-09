package com.algaworks.algafood.notificador;

import com.algaworks.algafood.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;

    public NotificadorEmail() {
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if (this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s atraves do email %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
