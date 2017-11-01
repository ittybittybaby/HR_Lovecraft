package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

public class ContactTest {

    @Test
    public void contactConstructorTest() {
        String address = "9 Musket lane";
        String city = "Darien";
        State state = State.CONNECTICUT;
        int phoneNumber = 203655780;
        String emergencyContactName = "Sally Sutton";
        int emergencyContactPhoneNumber = 2039127969;
        String email = "Basgolfer@gmail.com";

        Contact contact = new Contact(address, city, state, phoneNumber, emergencyContactName, emergencyContactPhoneNumber, email);

        String streetAddressExpected = address;
        String cityExpected = city;
        State stateExpected = state;
        int phoneNumberExpected = phoneNumber;
        String emergencyContactNameExpected = emergencyContactName;
        int emergencyContactPhoneNumberExpected = emergencyContactPhoneNumber;
        String emailExpected = email;

        String streetAddressActual = contact.getStreetAddress();
        String cityActual = contact.getCity();
        State stateActual = contact.getState();
        int phoneNumberActual = contact.getPhoneNumber();
        String emergencyContactNameActual = contact.getEmergencyContactName();
        int emergencyContactPhoneNumberActual = contact.getEmergencyContactPhoneNumber();
        String emailActual = contact.getEmail();

        Assert.assertEquals(streetAddressExpected, streetAddressActual);
        Assert.assertEquals(cityExpected, cityActual);
        Assert.assertEquals(stateExpected, stateActual);
        Assert.assertEquals(phoneNumberExpected, phoneNumberActual);
        Assert.assertEquals(emergencyContactNameExpected, emergencyContactNameActual);
        Assert.assertEquals(emergencyContactPhoneNumberExpected, emergencyContactPhoneNumberActual);
        Assert.assertEquals(emailExpected, emailActual);

    }

    @Test
    public void getSetStreetAddressTest() {
        Contact contact = new Contact();
        String streetAddressExpected = "9 Musket Lane";
        contact.setStreetAddress(streetAddressExpected);
        String streetAddressActual = contact.getStreetAddress();

        Assert.assertEquals(streetAddressExpected, streetAddressActual);

    }

    @Test
    public void getSetCityTest() {
        Contact contact = new Contact();
        String cityExpected = "Darien";
        contact.setCity(cityExpected);
        String cityActual = contact.getCity();

        Assert.assertEquals(cityExpected, cityActual);
    }

    @Test
    public void getSetStateTest() {
        Contact contact = new Contact();
        State stateExpected = State.CONNECTICUT;
        contact.setState(stateExpected);
        State stateActual = contact.getState();

        Assert.assertEquals(stateExpected, stateActual);
    }

    @Test
    public void getSetPhoneNumberTest() {
        Contact contact = new Contact();
        int phoneNumberExpected = 2036556780;
        contact.setPhoneNumber(phoneNumberExpected);
        int phoneNumberActual = contact.getPhoneNumber();

        Assert.assertEquals(phoneNumberExpected, phoneNumberActual);
    }

    @Test
    public void getSetEmergencyContactNameTest() {
        Contact contact = new Contact();
        String emergencyContactNameExpected = "Sally Sutton";
        contact.setEmergencyContactName(emergencyContactNameExpected);
        String emergencyContactNameActual = contact.getEmergencyContactName();

        Assert.assertEquals(emergencyContactNameExpected, emergencyContactNameActual);
    }

    @Test
    public void getSetEmergencyContactPhoneNumberTest() {
        Contact contact = new Contact();
        int emergencyContactPhoneNumberExpected = 203-912-7969;
        contact.setEmergencyContactPhoneNumber(emergencyContactPhoneNumberExpected);
        int emergencyContactPhoneNumberActual = contact.getEmergencyContactPhoneNumber();

        Assert.assertEquals(emergencyContactPhoneNumberExpected, emergencyContactPhoneNumberActual);
    }

    @Test
    public void getSetEmailTest() {
        Contact contact = new Contact();
        String emailExpected = "Basgolfer@gmail.com";
        contact.setEmail(emailExpected);
        String emailActual = contact.getEmail();

        Assert.assertEquals(emailExpected, emailActual);
    }

}
