package model;

public class Contacts {
    private String fullName;
    private int phoneNumber;
    private String address;
    private String email;
    private String facebook;

    public Contacts() {
    }

    public Contacts(String fullName, int phoneNumber, String address, String email, String facebook) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.facebook = facebook;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", facebook='" + facebook + '\'' +
                '}';
    }
}
