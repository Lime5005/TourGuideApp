package com.lime.gpsprovider.controller;

import com.lime.gpsprovider.dto.AttractionDto;
import com.lime.gpsprovider.dto.VisitedLocationDto;
import com.lime.gpsprovider.service.GpsUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/gps")
public class GpsUtilController {

    @Autowired
    private GpsUtilService gpsUtilService;

    @GetMapping("/attractions")
    public List<AttractionDto> getAttractions() {
        return gpsUtilService.getAttractions();
    }

    @PostMapping("/userLocation/{id}")
    public VisitedLocationDto getUserLocation(@PathVariable UUID id) {
        return gpsUtilService.getUserLocation(id);
    }

}
