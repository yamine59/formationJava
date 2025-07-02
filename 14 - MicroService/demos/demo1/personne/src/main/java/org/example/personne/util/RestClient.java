package org.example.personne.util;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class RestClient<T>{


    private final RestTemplate template;
    private final HttpHeaders headers;

    public RestClient() {
        this.template = new RestTemplate();
        this.headers = new HttpHeaders();
        this.headers.setContentType(MediaType.APPLICATION_JSON);
        this.headers.setAccept(List.of(MediaType.APPLICATION_JSON));
    }

    public T get (String url,Class<T> responseType){
        HttpEntity<String> requestEntity = new HttpEntity<>("",headers);
        ResponseEntity<T> response = template.exchange(url, HttpMethod.GET,requestEntity,responseType);
        if (response.hasBody()){
            return response.getBody();
        }
        return null;
    }
}
