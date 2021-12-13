package com.lime.rewardprovider.proxy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

@SpringBootTest
public class RewardFeignProxyTest {
    @Autowired
    private RewardFeignProxy rewardFeignProxy;

    @Test
    public void testGetRewardPoints() {
        int rewardPoints = rewardFeignProxy.getAttractionRewardPoints(UUID.randomUUID(), UUID.randomUUID());
        System.out.println("rewardPoints = " + rewardPoints);//rewardPoints = 323
        Assertions.assertNotNull(rewardPoints);
    }
}
