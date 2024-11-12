package org.nge.model;

public class ContactInfo {

    private String email;
    private String phone;
    private Location location;

    public ContactInfo() {}

    public ContactInfo(String email, String phone, Location location) {
        this.email = email;
        this.phone = phone;
        this.location = location;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
            "email='" + email + '\'' +
            ", phone='" + phone + '\'' +
            ", location=" + location +
            '}';
    }
}
