package hrlovecraft;

public class Contact {
    private String streetAddress;
    private String city;
    private State state;
    private int phoneNumber;
    private String email;

    public Contact() {
        this.streetAddress = null;
        this.city = null;
        this.state = null;
        this.phoneNumber = 0;
        this.email = null;
    }

    public Contact(String streetAddress, String city, State state, int phoneNumber, String email) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
