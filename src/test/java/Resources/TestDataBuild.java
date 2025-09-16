package Resources;

import org.example.pojo.AddPlace;
import org.example.pojo.Location;

import java.util.Arrays;

public class TestDataBuild {

    // old method (hardcoded data)
    public AddPlace Addplacepayload() {
        AddPlace addPlace = new AddPlace();
        Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);

        addPlace.setLocation(location);
        addPlace.setAccuracy(50);
        addPlace.setName("Rushikesh");
        addPlace.setPhone_number("(+91) 983 893 3937");
        addPlace.setAddress("29, side layout, cohen 09");
        addPlace.setTypes(Arrays.asList("shoe park", "shop"));
        addPlace.setWebsite("http://google.com");
        addPlace.setLanguage("French-IN");
        return addPlace;
    }

    // ✅ new method with parameters (used in Scenario Outline)
    public AddPlace addPlacePayload(String name, String language, String address) {
        AddPlace addPlace = new AddPlace();
        Location location = new Location();
        location.setLat(-38.383494);
        location.setLng(33.427362);

        addPlace.setLocation(location);
        addPlace.setAccuracy(50);
        addPlace.setName(name);
        addPlace.setPhone_number("(+91) 983 893 3937");
        addPlace.setAddress(address);
        addPlace.setTypes(Arrays.asList("shoe park", "shop"));
        addPlace.setWebsite("http://google.com");
        addPlace.setLanguage(language);
        return addPlace;
    }
}
