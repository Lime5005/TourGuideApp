package tourGuide;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Locale;
import java.util.UUID;

import com.lime.feignclient.model.Attraction;
import org.junit.Before;
import org.junit.Test;

import tourGuide.helper.InternalTestHelper;
import tourGuide.service.GpsUtilFeignService;
import tourGuide.service.RewardFeignService;
import tourGuide.service.RewardsService;
import tourGuide.service.TourGuideService;
import com.lime.feignclient.user.User;
import com.lime.feignclient.model.Provider;

public class TestTourGuideService {

	@Before
	public void init() {
		Locale.setDefault(Locale.US);
	}

	@Test
	public void getUserLocation() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");
		tourGuideService.trackUserLocation(user).join();
		tourGuideService.tracker.stopTracking();
		assertTrue(user.getLastVisitedLocation().userId.equals(user.getUserId()));
	}
	
	@Test
	public void addUser() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");
		User user2 = new User(UUID.randomUUID(), "jon2", "000", "jon2@tourGuide.com");

		tourGuideService.addUser(user);
		tourGuideService.addUser(user2);
		
		User retrivedUser = tourGuideService.getUser(user.getUserName());
		User retrivedUser2 = tourGuideService.getUser(user2.getUserName());

		tourGuideService.tracker.stopTracking();
		
		assertEquals(user, retrivedUser);
		assertEquals(user2, retrivedUser2);
	}
	
	@Test
	public void getAllUsers() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");
		User user2 = new User(UUID.randomUUID(), "jon2", "000", "jon2@tourGuide.com");

		tourGuideService.addUser(user);
		tourGuideService.addUser(user2);
		
		List<User> allUsers = tourGuideService.getAllUsers();

		tourGuideService.tracker.stopTracking();
		
		assertTrue(allUsers.contains(user));
		assertTrue(allUsers.contains(user2));
	}
	
	@Test
	public void trackUser() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");
		tourGuideService.trackUserLocation(user).join();
		
		tourGuideService.tracker.stopTracking();
		
		assertEquals(user.getUserId(), user.getLastVisitedLocation().userId);
	}

	@Test
	public void getNearbyAttractions() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");
		tourGuideService.trackUserLocation(user).join();
		
		List<Attraction> attractions = tourGuideService.getNearByAttractions(user.getLastVisitedLocation());
		
		tourGuideService.tracker.stopTracking();
		
		assertEquals(5, attractions.size());
	}

	@Test
	public void getTripDeals() {
		GpsUtilFeignService gpsUtil = new GpsUtilFeignService();
		RewardsService rewardsService = new RewardsService(gpsUtil, new RewardFeignService());
		InternalTestHelper.setInternalUserNumber(0);
		TourGuideService tourGuideService = new TourGuideService(gpsUtil, rewardsService);
		
		User user = new User(UUID.randomUUID(), "jon", "000", "jon@tourGuide.com");

		List<Provider> providers = tourGuideService.getTripDeals(user);
		
		tourGuideService.tracker.stopTracking();
		
		assertEquals(5, providers.size());
	}
	
	
}
