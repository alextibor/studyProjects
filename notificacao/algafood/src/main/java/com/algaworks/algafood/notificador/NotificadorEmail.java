package com.algaworks.algafood.notificador;

import com.algaworks.algafood.model.Cliente;
import java.lang.String;

public class NotificadorEmail implements Notificador {

    private boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem){
        if (this.caixaAlta){
            mensagem = mensagem.toUpperCase();
        }

        System.out.printf("Notificando %s atraves do email %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
