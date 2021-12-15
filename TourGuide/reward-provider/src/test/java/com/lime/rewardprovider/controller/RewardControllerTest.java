package com.lime.rewardprovider.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class RewardControllerTest {
    @Autowired
    private RewardController rewardController;

    @Test
    public void testGetRewardPoints() {
        int rewardPoints = rewardController.getAttractionRewardPoints(UUID.randomUUID(), UUID.randomUUID());
        System.out.println("rewardPoints = " + rewardPoints);//rewardPoints = 323
        Assertions.assertNotNull(rewardPoints);
    }
}
