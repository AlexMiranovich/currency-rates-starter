package com.currency.shop.coffee.services.impl;

import com.currency.shop.coffee.entities.Latest;
import com.currency.shop.coffee.services.CurrencyRateService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.currency.shop.coffee.properties.ExchangeRatesProperties.API_KEY;
import static com.currency.shop.coffee.properties.ExchangeRatesProperties.LATEST_URL;

@NoArgsConstructor
public class CurrencyRateServiceImpl implements CurrencyRateService {

    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .build();

    @SneakyThrows
    @Override
    public Latest getCurrency(String symbols, String base){
        ObjectMapper objectMapper = new ObjectMapper();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(String.format(LATEST_URL, symbols, base)))
                .header("apikey",API_KEY)
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return objectMapper.readValue(response.body(), Latest.class);
    }
}
