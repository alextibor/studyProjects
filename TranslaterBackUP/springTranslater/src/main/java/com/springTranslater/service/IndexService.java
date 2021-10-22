package com.springTranslater.service;

import com.springTranslater.model.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class IndexService {

    @Autowired
    private WebClient webClient;

    public Index chamarTranslate(String inputText){
        Mono<Index> indexMono = this.webClient
                .method(HttpMethod.POST)
                .uri("/translate")
                .retrieve()
                .bodyToMono(Index.class);

        indexMono.subscribe(p -> {

        });
        return null;
    }
}
