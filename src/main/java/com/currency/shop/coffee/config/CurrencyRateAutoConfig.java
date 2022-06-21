package com.currency.shop.coffee.config;

import com.currency.shop.coffee.services.CurrencyRateService;
import com.currency.shop.coffee.services.impl.CurrencyRateServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrencyRateAutoConfig {

    @Bean
    @ConditionalOnMissingBean
    public CurrencyRateService getCurrencyRateService() {
        return new CurrencyRateServiceImpl();
    }
}
