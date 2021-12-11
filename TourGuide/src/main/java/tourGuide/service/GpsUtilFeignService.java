package tourGuide.service;

import com.lime.feignclient.api.GpsFeign;
import com.lime.feignclient.model.Attraction;
import com.lime.feignclient.model.VisitedLocation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class GpsUtilFeignService {

    @Autowired
    private GpsFeign gpsFeign;

    public List<Attraction> getAttractions() {
        return gpsFeign.getAttractions();
    }

    public VisitedLocation getUserLocation(UUID uuid) {
        return gpsFeign.getUserLocation(uuid);
    }
}
