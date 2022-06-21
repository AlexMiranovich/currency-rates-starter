package com.currency.shop.coffee.services;

import com.currency.shop.coffee.entities.Latest;

public interface CurrencyRateService {

    Latest getCurrency(String base, String target);
}
