package com.springTranslater.controller;

import io.netty.channel.ChannelOption;
import io.netty.handler.timeout.ReadTimeoutHandler;
import io.netty.handler.timeout.WriteTimeoutHandler;
import org.json.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.http.HttpClient;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class WebClientContoller {


    public String connection(String inputText, String accessToken){

        JSONObject json = new JSONObject();
        json.put("model", "projects/springtranslater/locations/global/models/general/nmt");
        json.put("sourceLanguageCode", "pt");
        json.put("targetLanguageCode", "en");
        json.put("contents", inputText);

        //Creating a WebClient Instance
        WebClient client = WebClient.builder()
        .baseUrl("https://translation.googleapis.com/v3/projects/AIzaSyAEnP-n4DT_bF-54q7l_Huz5xksaiYVTN4/locations/global:translateText")
        .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
        .defaultHeader(HttpHeaders.CONTENT_TYPE, HttpHeaders.AUTHORIZATION + " Bearer " + accessToken)
//      .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
        .build();

        //Preparing a Request – Define the Method
        WebClient.UriSpec<WebClient.RequestBodySpec> uriSpec = client.method(HttpMethod.POST);
        //Preparing a Request – Define the URL
        WebClient.RequestBodySpec bodySpec = uriSpec.uri("/resource");
        //Preparing a Request – Define the Body
        WebClient.RequestHeadersSpec<?> headersSpec = bodySpec.bodyValue(json.toString());


        //Preparing a Request – Define the Headers
        WebClient.ResponseSpec responseSpec = headersSpec.header(
                HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON)
                .acceptCharset(StandardCharsets.UTF_8)
                .ifModifiedSince(ZonedDateTime.now())
                .retrieve();

        //Getting a Response
        Mono<String> response = headersSpec.retrieve()
                .bodyToMono(String.class);
        return response.toString();
    }
}
