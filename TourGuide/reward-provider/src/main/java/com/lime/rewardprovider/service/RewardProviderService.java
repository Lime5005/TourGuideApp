package com.lime.rewardprovider.service;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.service.RewardService;
import com.lime.feignclient.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardProviderService implements RewardService {

    @Autowired
    private RewardCentral rewardCentral;

//    public int getAttractionRewardPoints(UUID attractionId, UUID userId) {
//       return rewardCentral.getAttractionRewardPoints(attractionId, userId);
//}
    public int getAttractionRewardPoints(Attraction attraction, User user) {
        //1, Get Attraction, and User
        UUID attractionId = attraction.getAttractionId();
        UUID userId = user.getUserId();
        //2, Transfer to feign-client models
        return rewardCentral.getAttractionRewardPoints(attractionId, userId);
    }

}
