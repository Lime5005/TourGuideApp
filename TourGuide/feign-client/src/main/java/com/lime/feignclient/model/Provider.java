package com.lime.feignclient.model;

import java.io.Serializable;
import java.util.UUID;

public class Provider implements Serializable {
    public String name;
    public double price;
    public UUID tripId;

    public Provider() {
    }

    public Provider(UUID tripId, String name, double price) {
        this.name = name;
        this.tripId = tripId;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getTripId() {
        return tripId;
    }

    public void setTripId(UUID tripId) {
        this.tripId = tripId;
    }
}
