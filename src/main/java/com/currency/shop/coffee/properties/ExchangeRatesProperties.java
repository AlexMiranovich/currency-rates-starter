package com.currency.shop.coffee.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ExchangeRatesProperties {

    public static String API_KEY;

    public static String LATEST_URL;

    @Value("${api.key}")
    public void setDatabase(String key) { API_KEY = key; }

    @Value("${open.exchange.rates.url.latest}")
    public void setLatestUrl(String latest) { LATEST_URL = latest; }
}
