import java.util.List;

interface VenueService {

	Iterable<Venue> findNearbyVenue(String laglon, int radius, String keywords);

	Iterable<Venue> findClosestVenues(List<String> laglon, String keywords);
}
