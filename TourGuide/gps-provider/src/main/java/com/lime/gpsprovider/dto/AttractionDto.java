package com.lime.gpsprovider.dto;

import gpsUtil.location.Attraction;
import gpsUtil.location.Location;

import java.util.UUID;

public class AttractionDto {

    public String attractionName;
    public String city;
    public String state;
    public UUID attractionId;
    public Location location;


    public void setLocation(double latitude, double longitude) {
        this.location = new Location(latitude, longitude);
    }

    public AttractionDto() {}

    public AttractionDto(String attractionName, String city, String state, Location location) {
        this.attractionName = attractionName;
        this.city = city;
        this.state = state;
        this.attractionId = UUID.randomUUID();
        this.location = location;
    }

    public static AttractionDto fromAttr(Attraction attraction) {
        if (attraction == null) return null;
        AttractionDto attractionDto = new AttractionDto();

        attractionDto.setLocation(attraction.latitude, attraction.longitude);
        attractionDto.setAttractionId(attraction.attractionId);
        attractionDto.setAttractionName(attractionDto.attractionName);
        attractionDto.setCity(attraction.city);
        attractionDto.setState(attraction.state);
        return attractionDto;
    }


    public String getAttractionName() {
        return attractionName;
    }

    public void setAttractionName(String attractionName) {
        this.attractionName = attractionName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public UUID getAttractionId() {
        return attractionId;
    }

    public void setAttractionId(UUID attractionId) {
        this.attractionId = attractionId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
