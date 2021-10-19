package br.com.mudi.controller;

import br.com.mudi.controller.model.Pedido;
import br.com.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping("/home")
    public String home(Model model){
        List<Pedido> pedidos = repository.recuperaTodosOsPedidos();
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
