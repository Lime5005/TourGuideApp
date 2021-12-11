package com.lime.feignclient.api;


import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.VisitedLocation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@FeignClient(value = "gps-provider", url = "localhost:8081")
public interface GpsFeign {

    @GetMapping("/gps/attractions")
    List<Attraction> getAttractions();

    @PostMapping("/gps/userLocation/{id}")
    VisitedLocation getUserLocation(@PathVariable("id") UUID userId);
}
