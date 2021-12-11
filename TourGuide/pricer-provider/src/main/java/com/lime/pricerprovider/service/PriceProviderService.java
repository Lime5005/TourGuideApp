package com.lime.pricerprovider.service;

import com.lime.feignclient.model.Provider;
import com.lime.feignclient.service.PricerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class PriceProviderService implements PricerService {

    @Autowired
    private TripPricer tripPricer;

    public List<Provider> getPrice(String apiKey, UUID attractionId, int adults, int children, int nightsStay, int rewardsPoints) {
//        return tripPricer.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
        List<tripPricer.Provider> providers = tripPricer.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
        List<Provider> providerDto = new ArrayList<>();
        providers.forEach(provider -> providerDto.add(new Provider(provider.tripId, provider.name, provider.price)));
        return providerDto;
    }

    public String getProviderName(String apiKey, int adults) {
//        String providerName = tripPricer.getProviderName(apiKey, adults);
        //The ONLY usage of this method in the whole project
        return tripPricer.getProviderName(apiKey, adults);
    }
}
