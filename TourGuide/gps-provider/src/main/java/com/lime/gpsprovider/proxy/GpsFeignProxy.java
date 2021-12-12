package com.lime.gpsprovider.proxy;


import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@FeignClient(value = "gps-provider", url = "localhost:8081")
public interface GpsFeignProxy {

    @GetMapping("/gps/attractions")
    List<Attraction> getAttractions();

    @PostMapping("/gps/userLocation/{id}")
    VisitedLocation getUserLocation(@PathVariable UUID id);
}