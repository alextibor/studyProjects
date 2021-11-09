package com.algaworks.algafood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.algaworks.algafood.model.*;
import com.algaworks.algafood.notificador.*;
import com.algaworks.algafood.service.*;

@SpringBootApplication
public class AlgafoodApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgafoodApplication.class, args);

    }

}
