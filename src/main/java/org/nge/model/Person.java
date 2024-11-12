package org.nge.model;

public class Person {

    private int id;
    private String fullName;
    private ContactInfo contactInfo;

    public Person() {}

    public Person(int id, String fullName, ContactInfo contactInfo) {
        this.id = id;
        this.fullName = fullName;
        this.contactInfo = contactInfo;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
            "id=" + id +
            ", fullName='" + fullName + '\'' +
            ", contactInfo=" + contactInfo +
            '}';
    }
}

