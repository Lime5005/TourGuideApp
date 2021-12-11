package com.lime.feignclient.dto;

import com.lime.feignclient.model.Attraction;

public class AttractionPointsDto {
    private Attraction attraction;
    private UserDto userDto;

    public AttractionPointsDto() {
    }

    public AttractionPointsDto(Attraction attraction, UserDto userDto) {
        this.attraction = attraction;
        this.userDto = userDto;
    }

    public Attraction getAttraction() {
        return attraction;
    }

    public void setAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public UserDto getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }
}
