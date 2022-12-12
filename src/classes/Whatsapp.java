package classes;

import enums.WhatsappStatus;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private int id;
    private String phoneNumber;
    private String image = "(❁´◡`❁)";
    private String createPassword;
    private String userName;
    private WhatsappStatus status = WhatsappStatus.ПРИВЕТ_Я_ИСРПОЛЬЗУЮ_WHATSAPP;
    private List<Contacts> contacts = new ArrayList<>();
    private List<String> message = new ArrayList<>();


    public Whatsapp(int id, String phoneNumber, String createPassword, String userName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.createPassword = createPassword;
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreatePassword() {
        return createPassword;
    }

    public void setCreatePassword(String createPassword) {
        this.createPassword = createPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public WhatsappStatus getStatus() {
        return status;
    }

    public void setStatus(WhatsappStatus status) {
        this.status = status;
    }

    public List<Contacts> getContacts() {

        return contacts;
    }

    public void setContacts(List<Contacts> contacts) {
        this.contacts = contacts;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~ * Whatsapp Profile * ~~~~~~~~~" +
                "\nId: " + id +
                "\nPhone Number: " + phoneNumber +
                "\nImage: " + image +
                "\nUser Name: " + userName+
                "\nStatus: " + status+
                "\n-----------------------------"+
                "\nContacts: " + contacts+
                "\nMessages: " + message+
                "\nPassword: " + createPassword +
                "\n-----------------------------";
    }
}
