package com.lime.feignclient.dto;

import com.lime.feignclient.model.Attraction;

import java.util.List;

public class AttractionDto {
    public List<Attraction> attractions;

    public AttractionDto(List<Attraction> attractions) {
        this.attractions = attractions;
    }

    public AttractionDto() {
    }

    public List<Attraction> getAttractions() {
        return attractions;
    }

}
