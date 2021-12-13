package tourGuide.proxies;

import com.lime.pricerprovider.dto.ProviderDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@Component
@FeignClient(value = "pricer-provider", url = "localhost:8083")
public interface PricerFeignProxy {

    @GetMapping("/price/{apiKey}/{attractionId}/{adults}/{children}/{nightsStay}/{rewardsPoints}")
    List<ProviderDto> getPrice(@PathVariable("apiKey") String apiKey, @PathVariable("attractionId") UUID attractionId, @PathVariable("adults") int adults, @PathVariable("children") int children, @PathVariable("nightsStay") int nightsStay, @PathVariable("rewardsPoints") int rewardsPoints);

}
