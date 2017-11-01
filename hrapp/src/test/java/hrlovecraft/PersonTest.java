package hrlovecraft;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void personConstructorTest_Empty() {
        Person person = new Person();
        String nameExpected = null;
        String nameActual = person.getName();

        Contact contactExpected = null;
        Contact contactActual = person.getContactInfo();

        Assert.assertEquals(nameExpected, nameActual);
        Assert.assertEquals(contactExpected, contactActual);
    }

    @Test
    public void personConstructorTest_AllArguments() {
        //Part of person object
        String nameExpected = "Brian Sutton";

        //Part of contact object
        String address = "9 Musket lane";
        String city = "Darien";
        State state = State.CONNECTICUT;
        int phoneNumber = 203655780;
        String emergencyContactName = "Sally Sutton";
        int emergencyContactPhoneNumber = 2039127969;
        String email = "Basgolfer@gmail.com";

        Contact contactInfoExpected = new Contact(address, city, state, phoneNumber, emergencyContactName, emergencyContactPhoneNumber, email);

        Person person = new Person(nameExpected, contactInfoExpected);

        String nameActual = person.getName();
        Contact contactInfoActual = person.getContactInfo();

        Assert.assertEquals(nameExpected, nameActual);
        Assert.assertEquals(contactInfoExpected, contactInfoActual);
    }

    @Test
    public void getSetNameTest() {
        Person person = new Person();
        String expectedName = "Brian Sutton";
        person.setName(expectedName);
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getSetContactInfoTest() {
        Person person = new Person();
        Contact contactExpected = null;
        person.setContactInfo(contactExpected);
        Contact contactActual = person.getContactInfo();
        Assert.assertEquals(contactExpected, contactActual);
    }