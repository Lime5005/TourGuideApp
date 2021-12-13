package com.lime.gpsprovider.service;

import com.lime.gpsprovider.dto.AttractionDto;
import com.lime.gpsprovider.dto.VisitedLocationDto;
import gpsUtil.GpsUtil;
import gpsUtil.location.VisitedLocation;
import gpsUtil.location.Attraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class GpsUtilService {

    @Autowired
    private GpsUtil gpsUtil;

    public List<AttractionDto> getAttractions() {
        List<Attraction> attractions = gpsUtil.getAttractions();
        List<AttractionDto> attractionDtos = attractions.stream().map(AttractionDto::fromAttr).collect(Collectors.toList());
        return attractionDtos;
    }

    public VisitedLocationDto getUserLocation(UUID userId) {
        VisitedLocation userLocation = gpsUtil.getUserLocation(userId);
        VisitedLocationDto visitedLocationDto = VisitedLocationDto.fromVisitedLocation(userLocation);
        return visitedLocationDto;
    }


}
