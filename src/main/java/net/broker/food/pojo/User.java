package net.broker.food.pojo;

public class User {
    private final int userId;
    private final String firstName;
    private final String lastName;
    private final String addressLine1;
    private final String addressLine2;
    private final String addressCity;
    private final String addressState;
    private final String addressCountry;
    private final String image;
    private final int points;

    public User(int userId, String firstName, String lastName, String addressLine1, String addressLine2, String addressCity, String addressState, String addressCountry, String image, int points) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressCountry = addressCountry;
        this.image = image;
        this.points = points;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public String getAddressState() {
        return addressState;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public String getImage() {
        return image;
    }

    public int getPoints() {
        return points;
    }
}
