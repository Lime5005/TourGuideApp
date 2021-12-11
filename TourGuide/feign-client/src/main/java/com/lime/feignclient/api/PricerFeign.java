package com.lime.feignclient.api;

import com.lime.feignclient.model.Provider;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@FeignClient(value = "pricer-provider", url = "localhost:8083")
public interface PricerFeign {

    @GetMapping("/price/{apiKey}/{attractionId}/{adults}/{children}/{nightsStay}/{rewardsPoints}")
    List<Provider> getPrice(@PathVariable("apiKey") String apiKey, @PathVariable("attractionId") UUID attractionId, @PathVariable("adults") int adults, @PathVariable("children") int children, @PathVariable("nightsStay") int nightsStay, @PathVariable("rewardsPoints") int rewardsPoints);

    @GetMapping("/providername/{apiKey}/{adults}")
    String getProviderName(@PathVariable("apiKey") String apiKey, @PathVariable("adults") int adults);

}
