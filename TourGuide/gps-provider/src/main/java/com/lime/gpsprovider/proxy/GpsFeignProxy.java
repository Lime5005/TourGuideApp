package com.lime.gpsprovider.proxy;

import com.lime.gpsprovider.dto.AttractionDto;
import com.lime.gpsprovider.dto.VisitedLocationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@FeignClient(value = "gps-provider", url = "localhost:8081")
public interface GpsFeignProxy {

    @GetMapping("/gps/attractions")
    List<AttractionDto> getAttractions();

    @PostMapping("/gps/userLocation/{id}")
    VisitedLocationDto getUserLocation(@PathVariable UUID id);
}
