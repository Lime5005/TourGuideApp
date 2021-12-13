package com.lime.gpsprovider.proxy;

import com.lime.gpsprovider.dto.AttractionDto;
import com.lime.gpsprovider.dto.VisitedLocationDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class GpsFeignProxyTest {
    @Autowired
    private GpsFeignProxy gpsFeignProxy;
    @Test
    public void testGetAttractions() {
        List<AttractionDto> attractionDtos = gpsFeignProxy.getAttractions();
        Assertions.assertEquals(attractionDtos.size(), 26);
    }

    @Test
    public void testGetUserLocation() {
        VisitedLocationDto userLocation = gpsFeignProxy.getUserLocation(UUID.randomUUID());
        Assertions.assertNotNull(userLocation);
    }
}
