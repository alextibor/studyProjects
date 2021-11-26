package com.algaworks.algafoodApi.api.controller;

import com.algaworks.algafoodApi.domain.exception.EntidadeEmUsoException;
import com.algaworks.algafoodApi.domain.exception.EntidadeNaoEncontradaException;
import com.algaworks.algafoodApi.domain.model.Cozinha;
import com.algaworks.algafoodApi.domain.model.Restaurante;
import com.algaworks.algafoodApi.domain.repository.CozinhaRepository;
import com.algaworks.algafoodApi.domain.repository.RestauranteRepository;
import com.algaworks.algafoodApi.domain.service.CadastroCozinhaService;
import com.algaworks.algafoodApi.domain.service.CadastroRestauranteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private CadastroRestauranteService cadastroRestaurante;

    @GetMapping
    public List<Restaurante> listar() {
        return restauranteRepository.listar();
    }

    @GetMapping("/{restauranteId}")
    public Restaurante buscar(@PathVariable Long restauranteId){
        return restauranteRepository.buscar(restauranteId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurante adicionar(@RequestBody Restaurante restaurante){
        return cadastroRestaurante.salvar(restaurante);
    }

    @PutMapping("/{restauranteId}")
    public ResponseEntity<Restaurante> atualizar(@PathVariable Long restauranteId, @RequestBody Restaurante restaurante){
        Restaurante restauranteAtual = restauranteRepository.buscar(restauranteId);

        if (restauranteAtual != null) {
            BeanUtils.copyProperties(restaurante, restauranteAtual, "id");
            restauranteRepository.salvar(restauranteAtual);
            return ResponseEntity.ok(restauranteAtual);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{restauranteId}")
    public ResponseEntity<Restaurante> remover(Long restauranteId) {
        try{
            cadastroRestaurante.excluir(restauranteId);
            return ResponseEntity.noContent().build();

        } catch (EntidadeNaoEncontradaException e) {
            return ResponseEntity.notFound().build();

        } catch (EntidadeEmUsoException e){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }
}
