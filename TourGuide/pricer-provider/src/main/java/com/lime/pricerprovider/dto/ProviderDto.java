package com.lime.pricerprovider.dto;

import tripPricer.Provider;

import java.util.UUID;

public class ProviderDto {
    public String name;
    public double price;
    public UUID tripId;

    public ProviderDto() {
    }

    public ProviderDto(UUID tripId, String name, double price) {
        this.name = name;
        this.tripId = tripId;
        this.price = price;
    }

    public static ProviderDto fromProvider(Provider provider) {
        if (provider == null) return null;
        ProviderDto providerDto = new ProviderDto();
        providerDto.setTripId(provider.tripId);
        providerDto.setPrice(provider.price);
        providerDto.setName(provider.name);
        return providerDto;
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

    @Override
    public String toString() {
        return "ProviderDto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", tripId=" + tripId +
                '}';
    }
}
