package tourGuide.proxies;


import com.lime.gpsprovider.dto.AttractionDto;
import com.lime.gpsprovider.dto.VisitedLocationDto;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Component
@FeignClient(value = "gps-provider", url = "localhost:8081")
public interface GpsFeignProxy {

    @GetMapping("/gps/attractions")
    List<AttractionDto> getAttractions();

    @PostMapping("/gps/userLocation/{id}")
    VisitedLocationDto getUserLocation(@PathVariable UUID id);
}
