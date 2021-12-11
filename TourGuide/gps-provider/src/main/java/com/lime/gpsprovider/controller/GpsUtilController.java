package com.lime.gpsprovider.controller;

import com.lime.gpsprovider.service.GpsUtilService;
import gpsUtil.location.Attraction;
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
    public List<Attraction> getAttractions() {
        List<gpsUtil.location.Attraction> attractions = gpsUtilService.getAttractions();
        System.out.println("attractions = " + attractions);
        //attractions = [gpsUtil.location.Attraction@4c5269fc, ...
        return gpsUtilService.getAttractions();
    }

    @PostMapping("/userLocation/{id}")
    public gpsUtil.location.VisitedLocation getUserLocation(@PathVariable UUID id) {
        return gpsUtilService.getUserLocation(id);
    }

}
