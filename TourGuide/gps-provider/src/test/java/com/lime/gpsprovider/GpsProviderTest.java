package com.lime.gpsprovider;


import com.lime.gpsprovider.proxy.GpsFeignProxy;
import gpsUtil.location.Attraction;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class GpsProviderTest {




    @Autowired
    private GpsFeignProxy gpsFeignProxy;

    @LocalServerPort
    private int port;

    @Autowired
    private Environment environment;

    @Test
    public void testGetAllAttractions() throws Exception {
        System.out.println(port);
        System.out.println(gpsFeignProxy.getAttractions());
    }
}
