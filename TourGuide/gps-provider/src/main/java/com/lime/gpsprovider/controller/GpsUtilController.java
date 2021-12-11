package com.lime.gpsprovider.controller;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.VisitedLocation;
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
    public List<Attraction> getAttractions() {
        List<Attraction> attractions = gpsUtilService.getAttractions();
        System.out.println("attractions = " + attractions);
        //attractions = [gpsUtil.location.Attraction@4c5269fc, ...
        return attractions;
//        return gpsUtilService.getAttractions();
    }

    @PostMapping("/userLocation/{id}")
    public VisitedLocation getUserLocation(@PathVariable UUID id) {
        return gpsUtilService.getUserLocation(id);
//        return gpsUtilService.getUserLocation(id);
    }

}
