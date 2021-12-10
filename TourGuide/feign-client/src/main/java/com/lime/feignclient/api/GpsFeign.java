package com.lime.feignclient.api;


import com.lime.feignclient.models.Attraction;
import com.lime.feignclient.models.VisitedLocation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@FeignClient(value = "gps-provider", url = "localhost:8081")
public interface GpsFeign {

    @GetMapping("/attractions")
    List<Attraction> getAttractions();

    @PostMapping("/userLocation/{id}")
    VisitedLocation getUserLocation(@PathVariable("id") UUID userId);
}
