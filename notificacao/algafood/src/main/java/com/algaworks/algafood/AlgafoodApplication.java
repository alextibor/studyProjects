package com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.algaworks.algafood.model.*;
import com.algaworks.algafood.notificador.*;
import com.algaworks.algafood.service.*;


// 2.19. Desambiguação de beans com anotação customizada.mp4
// PAREI NESSA AULA
@SpringBootApplication
public class AlgafoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodApplication.class, args);

    }

}
