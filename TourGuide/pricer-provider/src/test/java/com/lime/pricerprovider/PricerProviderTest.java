package com.lime.pricerprovider;

import com.lime.pricerprovider.controller.PricerController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@WebMvcTest(PricerController.class)
public class PricerProviderTest {

    //test under feign url using mockMvc?

    @Autowired
    private MockMvc mockMvc;


    @Test
    public void testGetPrice() throws Exception {
        //{adults}/{children}/{nightsStay}/{rewardsPoints}
//        List<Provider> providers = priceProviderService.getPrice("test", UUID.randomUUID(), 2, 4, 3, 4);
//        assertThat(providers.size(), equalTo(5));
//        UUID uuid = UUID.randomUUID();
//        mockMvc.perform(get(MockMvcRequestBuilders.
//            post("/localhost:8083/price")
//                        .param("apiKey", "test")
//                        .param("attractionId", new UUID(111, 2222).toString())
//                        .param("adults", String.valueOf(2))
//                        .param("children",  String.valueOf(4))
//                        .param("nightsStay",  String.valueOf(3))
//                        .param("rewardsPoints",  String.valueOf(2))
//                .accept(MediaType.ALL).andDo()
//
//
//        )
    }

}
