package hrlovecraft;

public class Contact {
    private String streetAddress;
    private String city;
    private State state;
    private int phoneNumber;
    private String emergencyContactName;
    private int emergencyContactPhoneNumber;
    private String email;

    public Contact() {
        this.streetAddress = null;
        this.city = null;
        this.state = null;
        this.phoneNumber = 0;
        this.emergencyContactName = null;
        this.emergencyContactPhoneNumber = 0;
        this.email = null;
    }

    public Contact(String streetAddress, String city, State state, int phoneNumber, String emergencyContactName, int emergencyContactPhoneNumber, String email) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
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

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public int getEmergencyContactPhoneNumber() {
        return emergencyContactPhoneNumber;
    }

    public void setEmergencyContactPhoneNumber(int emergencyContactPhoneNumber) {
        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
