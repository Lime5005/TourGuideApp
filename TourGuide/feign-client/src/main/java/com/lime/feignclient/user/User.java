package com.lime.feignclient.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.lime.feignclient.dto.UserDto;
import com.lime.feignclient.model.VisitedLocation;
import com.lime.feignclient.model.Provider;

public class User {
	private final UUID userId;
	private final String userName;
	private String phoneNumber;
	private String emailAddress;
	private Date latestLocationTimestamp;
	private List<VisitedLocation> visitedLocations = new ArrayList<>();
	private List<UserReward> userRewards = new ArrayList<>();
	private UserPreferences userPreferences = new UserPreferences();
	private List<Provider> tripDeals = new ArrayList<>();
	public User(UUID userId, String userName, String phoneNumber, String emailAddress) {
		this.userId = userId;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public User(UserDto userDto) {
		this.userId = userDto.getUserId();
		this.userName = userDto.getUserName();
		this.phoneNumber = userDto.getPhoneNumber();
		this.emailAddress = userDto.getEmailAddress();
		this.latestLocationTimestamp = userDto.getLatestLocationTimestamp();
		this.visitedLocations = userDto.getVisitedLocations();
		this.userRewards = userDto.getUserRewards();
	}
	
	public UUID getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setLatestLocationTimestamp(Date latestLocationTimestamp) {
		this.latestLocationTimestamp = latestLocationTimestamp;
	}
	
	public Date getLatestLocationTimestamp() {
		return latestLocationTimestamp;
	}
	
	public void addToVisitedLocations(VisitedLocation visitedLocation) {
		visitedLocations.add(visitedLocation);
	}
	
	public List<VisitedLocation> getVisitedLocations() {
		return visitedLocations;
	}

	public void setVisitedLocations(List<VisitedLocation> visitedLocations) {
		this.visitedLocations.clear();
		this.visitedLocations.addAll(visitedLocations);
	}

	public void clearVisitedLocations() {
		visitedLocations.clear();
	}
	
	public void addUserReward(UserReward userReward) {
		userRewards.add(userReward);
	}
	
	public void setUserRewards(List<UserReward> userRewards) {
		this.userRewards.clear();
		this.userRewards.addAll(userRewards);
	}
	
	public List<UserReward> getUserRewards() {
		return userRewards;
	}
	
	public UserPreferences getUserPreferences() {
		return userPreferences;
	}
	
	public void setUserPreferences(UserPreferences userPreferences) {
		this.userPreferences = userPreferences;
	}

	public VisitedLocation getLastVisitedLocation() {
		return visitedLocations.get(visitedLocations.size() - 1);
	}
	
	public void setTripDeals(List<Provider> tripDeals) {
		this.tripDeals = tripDeals;
	}
	
	public List<Provider> getTripDeals() {
		return tripDeals;
	}

}
