package com.currency.shop.coffee;

import com.currency.shop.coffee.entities.Latest;
import com.currency.shop.coffee.properties.ExchangeRatesProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static com.currency.shop.coffee.properties.ExchangeRatesProperties.API_KEY;


@SpringBootTest
class CurrencyRatesStarterApplicationTests {
/*
	HttpClient httpClient = HttpClient.newBuilder()
			.version(HttpClient.Version.HTTP_1_1)
			.build();

	@Autowired
	ExchangeRatesProperties exchangeRatesProperties;

	@Test
	@SneakyThrows
	void contextLoads() {
		HttpRequest request1 = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create(String.format("https://api.apilayer.com/exchangerates_data/latest?symbols=%s&base=%s", "USD", "BYN")))
				.header("apikey", API_KEY)
				.build();

		HttpResponse<String> response = httpClient.send(request1, HttpResponse.BodyHandlers.ofString());

		ObjectMapper objectMapper = new ObjectMapper();

		Latest strinhs = objectMapper.readValue(response.body(), Latest.class);
        String df = "";
	}
 */
}
