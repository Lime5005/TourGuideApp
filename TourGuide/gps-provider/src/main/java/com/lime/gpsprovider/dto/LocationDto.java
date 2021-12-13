package com.lime.gpsprovider.dto;

import java.io.Serializable;

public class LocationDto implements Serializable {
    public double longitude;
    public double latitude;

    public LocationDto() {

    }

    public LocationDto(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
