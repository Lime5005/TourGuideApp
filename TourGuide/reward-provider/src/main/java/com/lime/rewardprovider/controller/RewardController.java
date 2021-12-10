package com.lime.rewardprovider.controller;

import com.lime.rewardprovider.service.RewardProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardController {
    @Autowired
    private RewardProviderService providerService;

    @PostMapping("/rewardpoints/{attractionId}/{userId}")
    public int getAttractionRewardPoints(@PathVariable UUID attractionId, @PathVariable UUID userId) {
        return providerService.getAttractionRewardPoints(attractionId, userId);
    }
}
