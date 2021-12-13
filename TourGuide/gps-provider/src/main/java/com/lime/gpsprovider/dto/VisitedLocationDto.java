package com.lime.gpsprovider.dto;

import gpsUtil.location.VisitedLocation;

import java.util.Date;
import java.util.UUID;

public class VisitedLocationDto {
    public UUID userId;
    public LocationDto locationDto;
    public Date timeVisited;

    public VisitedLocationDto() {
    }

    public VisitedLocationDto(UUID userId, LocationDto locationDto, Date timeVisited) {
        this.userId = userId;
        this.locationDto = locationDto;
        this.timeVisited = timeVisited;
    }

    public static VisitedLocationDto fromVisitedLocation(VisitedLocation visitedLocation) {
        if (visitedLocation == null) return null;
        VisitedLocationDto visitedLocationDto = new VisitedLocationDto();
        LocationDto locationDto = new LocationDto();
        locationDto.setLatitude(visitedLocation.location.latitude);
        locationDto.setLongitude(visitedLocation.location.longitude);
        visitedLocationDto.setLocationDto(locationDto);
        visitedLocationDto.setUserId(visitedLocation.userId);
        visitedLocationDto.setTimeVisited(visitedLocation.timeVisited);
        return visitedLocationDto;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public LocationDto getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(LocationDto locationDto) {
        this.locationDto = locationDto;
    }

    public Date getTimeVisited() {
        return timeVisited;
    }

    public void setTimeVisited(Date timeVisited) {
        this.timeVisited = timeVisited;
    }
}
