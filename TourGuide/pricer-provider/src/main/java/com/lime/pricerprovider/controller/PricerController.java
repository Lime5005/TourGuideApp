package com.lime.pricerprovider.controller;

import com.lime.pricerprovider.service.PriceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;

@RestController
public class PricerController {

    @Autowired
    private PriceProviderService priceProviderService;

    @PostMapping("/price/{apiKey}/{attractionId}/{adults}/{children}/{nightsStay}/{rewardsPoints}")
    public List<Provider> getPrice(@PathVariable String apiKey, @PathVariable UUID attractionId, @PathVariable int adults, @PathVariable int children, @PathVariable int nightsStay, @PathVariable int rewardsPoints) {
        return priceProviderService.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
    }

    @PostMapping("/providername/{apiKey}/{adults}")
    public String getProviderName(@PathVariable String apiKey, @PathVariable int adults) {
        return priceProviderService.getProviderName(apiKey, adults);
    }
}
