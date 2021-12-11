package tourGuide.service;

import com.lime.feignclient.api.RewardFeign;
import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

@Service
public class RewardFeignService {

    @Autowired
    private RewardFeign rewardFeign;

    @GetMapping("/rewardpoints")
    public int getAttractionRewardPoints(@RequestParam("attraction") Attraction attraction, @RequestParam("user") User user) {
        return rewardFeign.getAttractionRewardPoints(attraction, user);
    }
}
