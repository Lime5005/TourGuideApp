package tourGuide.config;

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
}
