package com.lime.gpsprovider.service;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.Location;
import com.lime.feignclient.model.VisitedLocation;
import com.lime.feignclient.service.GpsService;
import gpsUtil.GpsUtil;
//import gpsUtil.location.VisitedLocation;
//import gpsUtil.location.Attraction;
//import gpsUtil.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class GpsUtilService implements GpsService {

    @Autowired
    private GpsUtil gpsUtil;

    public List<Attraction> getAttractions() {
        List<gpsUtil.location.Attraction> attractions = gpsUtil.getAttractions();
        List<Attraction> attractionsDto = new ArrayList<>();
        attractions.forEach(attr ->
                attractionsDto.add(new Attraction(attr.attractionName, attr.city, attr.state, attr.latitude, attr.longitude)));
//        return gpsUtil.getAttractions();
        return attractionsDto;
    }

    public VisitedLocation getUserLocation(UUID userId) {
        gpsUtil.location.VisitedLocation userLocation = gpsUtil.getUserLocation(userId);
//        return gpsUtil.getUserLocation(userId);
        VisitedLocation visitedLocation = new VisitedLocation();

        gpsUtil.location.Location location = userLocation.location;
        Location locationDto = new Location();
        locationDto.setLatitude(location.latitude);
        locationDto.setLongitude(locationDto.longitude);

        visitedLocation.setLocation(locationDto);
        visitedLocation.setTimeVisited(userLocation.timeVisited);
        visitedLocation.setUserId(userLocation.userId);
        return visitedLocation;
    }

}
