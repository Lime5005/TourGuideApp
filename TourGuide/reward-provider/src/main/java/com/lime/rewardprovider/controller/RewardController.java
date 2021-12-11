package com.lime.rewardprovider.controller;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.user.User;
import com.lime.rewardprovider.service.RewardProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class RewardController {
    @Autowired
    private RewardProviderService providerService;

    @GetMapping("/rewardpoints")
    public int getAttractionRewardPoints(@RequestParam Attraction attraction, @RequestParam User user) {
//        return providerService.getAttractionRewardPoints(attractionId, userId);
        return providerService.getAttractionRewardPoints(attraction, user);
    }
}
