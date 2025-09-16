package Resources;

public enum APIResources {
    AddPlaceAPI("/maps/api/place/add/json"),
    GetPlaceAPI("/maps/api/place/get/json"),
    DeletePlaceAPI("/maps/api/place/delete/json");

    private String resource;

    // constructor
    APIResources(String resource) {
        this.resource = resource;
    }

    // getter method
    public String getResource() {
        return resource;
    }
}
