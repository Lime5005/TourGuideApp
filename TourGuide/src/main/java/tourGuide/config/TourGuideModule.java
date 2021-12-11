package tourGuide.config;

import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.Location;
import com.lime.feignclient.model.Provider;
import com.lime.feignclient.model.VisitedLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tourGuide.service.GpsUtilFeignService;
import tourGuide.service.RewardFeignService;
import tourGuide.service.RewardsService;

@Configuration
public class TourGuideModule {

    @Bean
    public GpsUtilFeignService getGpsUtilFeignService() {
        return new GpsUtilFeignService();
    }

    @Bean
    public RewardFeignService getRewardFeignService() {
        return new RewardFeignService();
    }

    @Bean
    public RewardsService getRewardService() {
        return new RewardsService(getGpsUtilFeignService(), getRewardFeignService());
    }

    @Bean
    public Location getLocation() {
        return new Location();
    }

    @Bean
    public Attraction getAttraction() {
        return new Attraction();
    }

    @Bean
    public Provider getProvider() {
        return new Provider();
    }

    @Bean
    public VisitedLocation getVisitedLocation() {
        return new VisitedLocation();
    }

}
