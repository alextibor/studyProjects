package br.com.mudi.controller;

import br.com.mudi.controller.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){

        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Echo Dot (3ª Geração)");
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/61mjTR81OtL._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/dp/B07PDHSJ1H/?pf_rd_r=J1HHY305Y7MSYFWVSRY6&pf_rd_p=71f03b49-1a00-4f1c-a43b-fb4d5cd4f6ae&pd_rd_r=e4720818-acd2-4429-9cf6-9d52e05ea31d&pd_rd_w=dEFDx&pd_rd_wg=3H6n2&ref_=pd_gw_unk");
        pedido.setDescricao("O Echo Dot é o nosso smart speaker de maior sucesso.");

        List<Pedido> pedidos = Arrays.asList(pedido);

        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
