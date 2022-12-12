package classes;

public class Contacts {

    private String userName;
    private String phoneNumber;

    public Contacts(String userName, String phoneNumber) {

        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "\nUser Name: " + userName +
                "\nPhone Number: " + phoneNumber;
    }
}
