package com.lime.feignclient.service;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.VisitedLocation;

import java.util.List;
import java.util.UUID;

public interface GpsService {
    List<Attraction> getAttractions();

    VisitedLocation getUserLocation(UUID userId);
}
