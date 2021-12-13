package com.lime.pricerprovider.proxy;

import com.lime.pricerprovider.dto.ProviderDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.UUID;

@SpringBootTest
public class PricerFeignProxyTest {
    @Autowired
    private PricerFeignProxy pricerFeignProxy;

    @Test
    public void testGetPrice() {
        List<ProviderDto> providerDtos = pricerFeignProxy.getPrice("test", UUID.randomUUID(), 2, 3, 3, 3);
        System.out.println("providerDtos = " + providerDtos);
        Assertions.assertNotNull(providerDtos);
        Assertions.assertEquals(providerDtos.size(), 5);
    }
}
