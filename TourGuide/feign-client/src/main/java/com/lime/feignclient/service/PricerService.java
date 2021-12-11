package com.lime.feignclient.service;

import com.lime.feignclient.model.Provider;

import java.util.List;
import java.util.UUID;

public interface PricerService {

    List<Provider> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints);
    String getProviderName(String apiKey, int adults);
}
