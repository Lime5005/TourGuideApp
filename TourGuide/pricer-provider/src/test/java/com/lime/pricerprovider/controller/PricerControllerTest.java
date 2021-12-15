package com.lime.pricerprovider.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class PricerControllerTest {
    @Autowired
    private PricerController pricerController;

    @Test
    public void testGetProviders() {
        List<Provider> providers = pricerController.getPrice("test", UUID.randomUUID(), 2, 3, 3, 3);
        Assertions.assertNotNull(providers);
        Assertions.assertEquals(providers.size(), 5);
    }
}
