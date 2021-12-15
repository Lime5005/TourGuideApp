package com.lime.gpsprovider.controller;


import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class GpsControllerTest {

    @Autowired
    private GpsUtilController gpsUtilController;

    @Test
    public void testGetAllAttractions() {
        List<Attraction> attractions = gpsUtilController.getAttractions();
        Assertions.assertNotNull(attractions);
        Assertions.assertEquals(attractions.size(), 26);
    }

    @Test
    public void testGetUserLocation() {
        VisitedLocation userLocation = gpsUtilController.getUserLocation(UUID.randomUUID());
        Assertions.assertNotNull(userLocation);
    }

}
