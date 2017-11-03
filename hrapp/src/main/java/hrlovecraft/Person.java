package hrlovecraft;

public abstract class Person {
    private String name;
    private Contact contactInfo;

    public Person() {
        this.name = null;
        this.contactInfo = null;
    }

    public Person(String name,String addr, String city, String state, String phone, String email) {
        this.name = name;
        this.contactInfo = new Contact(addr, city, State.valueOf(state.toUpperCase()), phone, email);
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
