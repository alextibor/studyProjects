package com.javaLangObject;

import com.javaLangObject.modelo.Cliente;
import com.javaLangObject.notificacao.Notificador;
import com.javaLangObject.notificacao.NotificadorEmail;
import com.javaLangObject.notificacao.NotificadorSMS;
import com.javaLangObject.service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "3498484884");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "1154896325");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
