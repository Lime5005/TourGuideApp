package com.lime.pricerprovider.service;

import com.lime.pricerprovider.dto.ProviderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class PriceProviderService {

    @Autowired
    private TripPricer tripPricer;

    public List<ProviderDto> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints) {
        List<Provider> providers = tripPricer.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
        List<ProviderDto> providerDtos = providers.stream().map(ProviderDto::fromProvider).collect(Collectors.toList());
        return providerDtos;
    }
}
