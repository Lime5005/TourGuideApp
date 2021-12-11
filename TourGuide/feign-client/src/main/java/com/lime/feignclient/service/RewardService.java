package com.lime.feignclient.service;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.user.User;

import java.util.UUID;

public interface RewardService {
    int getAttractionRewardPoints(Attraction attraction, User user);

}
