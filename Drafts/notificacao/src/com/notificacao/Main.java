package com.notificacao;

import com.notificacao.model.Cliente;
import com.notificacao.service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("Joao", "joao@xyz.com", "345452312321");
        Cliente maria = new Cliente("maria", "maria@xyz.com", "23564534532");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoCliente = new AtivacaoClienteService(notificador);
        ativacaoCliente.ativar(joao);
        ativacaoCliente.ativar(maria);
    }
}
