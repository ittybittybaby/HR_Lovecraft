package hrlovecraft;

public class Person {
    private String name;
    private Contact contactInfo;

    public Person() {
        this.name = null;
        this.contactInfo = null;
    }

    public Person(String name, Contact contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }
}
