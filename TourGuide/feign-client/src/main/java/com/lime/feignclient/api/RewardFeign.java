package com.lime.feignclient.api;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.user.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "reward-provider", url = "localhost:8082")
public interface RewardFeign {

    @GetMapping("/rewardpoints")
    int getAttractionRewardPoints(@RequestParam("attraction") Attraction attraction, @RequestParam("user") User user);

}
