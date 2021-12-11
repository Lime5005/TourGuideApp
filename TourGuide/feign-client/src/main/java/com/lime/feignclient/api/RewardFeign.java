package com.lime.feignclient.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.UUID;

@FeignClient(value = "reward-provider", url = "localhost:8082")
public interface RewardFeign {

    @PostMapping("/rewardpoints/{attractionId}/{userId}")
    int getAttractionRewardPoints(@PathVariable("attractionId") UUID attractionId, @PathVariable("userId") UUID userId);

}
