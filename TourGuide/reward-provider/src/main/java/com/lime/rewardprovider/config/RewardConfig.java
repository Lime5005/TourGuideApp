package com.lime.rewardprovider.config;

import com.lime.gpsprovider.service.GpsUtilService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import rewardCentral.RewardCentral;

@Configuration
public class RewardConfig {

    @Bean
    public RewardCentral getRewardCentral() {
        return new RewardCentral();
    }

    @Bean
    public GpsUtilService getGpsUtilService() {
        return new GpsUtilService();
    }

}
