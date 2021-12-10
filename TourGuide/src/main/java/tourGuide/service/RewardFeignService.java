package tourGuide.service;

import com.lime.feignclient.api.RewardFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Service
public class RewardFeignService {

    @Autowired
    private RewardFeign rewardFeign;

    public int getAttractionRewardPoints(@PathVariable("attractionId") UUID attractionId, @PathVariable("userId") UUID userId) {
        return rewardFeign.getAttractionRewardPoints(attractionId, userId);
    }
}
