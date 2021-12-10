package tourGuide.service;

import com.lime.feignclient.api.PricerFeign;
import com.lime.feignclient.models.Provider;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Service
public class PricerFeignService {

    private PricerFeign pricerFeign;

    @PostMapping("/price/{apiKey}/{attractionId}/{adults}/{children}/{nightsStay}/{rewardsPoints}")
    public List<Provider> getPrice(@PathVariable String apiKey, @PathVariable UUID attractionId, @PathVariable int adults, @PathVariable int children, @PathVariable int nightsStay, @PathVariable int rewardsPoints) {
        return pricerFeign.getPrice(apiKey, attractionId, adults, children, nightsStay, rewardsPoints);
    }

    @PostMapping("/providername/{apiKey}/{adults}")
    public String getProviderName(@PathVariable String apiKey, @PathVariable int adults) {
        return pricerFeign.getProviderName(apiKey, adults);
    }

}
