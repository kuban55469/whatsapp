package services;

import classes.Message;
import classes.Whatsapp;
import enums.WhatsappStatus;

import java.util.List;
import java.util.Map;

public interface WhatsappProfileService {


    String createProfile(List<Whatsapp> profiles);
    void crateProfile();

    List<Whatsapp> returnProfiles();

    String changeStatus(List<WhatsappStatus> statuss);
    String createContact();

    Map<String, Message> message ();

}
