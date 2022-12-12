package services.impl;

import classes.Contacts;
import classes.Message;
import classes.Whatsapp;
import enums.WhatsappStatus;
import services.WhatsappProfileService;

import java.util.*;

public class WhatsappProfileServiceImpl implements WhatsappProfileService {
    List<Whatsapp> newWhatsapp = new ArrayList<>();

    @Override
    public String createProfile(List<Whatsapp> profiles) {
        newWhatsapp.addAll(profiles);
        return "Profiles created seccessfully!";
    }

    @Override
    public void crateProfile() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Введите id: ");
        int idWhp = scanner2.nextInt();
        System.out.print("Введите номер телефона: ");
        String num = scanner3.nextLine();
        System.out.print("Создайте пароль: ");
        String password = scanner1.nextLine();
        System.out.print("Введите имя пользователья: ");
        String userName = scanner3.nextLine();
        Whatsapp whatsapp = new Whatsapp(idWhp, num, password, userName);
        System.out.println(whatsapp);
        System.out.println("Profiles created seccessfully!");
        newWhatsapp.add(whatsapp);
    }

    @Override
    public List<Whatsapp> returnProfiles() {
        return newWhatsapp;
    }

    @Override
    public String changeStatus(List<WhatsappStatus> statuss) {
        System.out.println("Enter userName: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Enter status: ");
        String status2 = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : newWhatsapp) {
            for (WhatsappStatus whatsappStatus : statuss) {
                if (whatsapp.getUserName().equals(name)) {
                    if (whatsappStatus.name().equals(status2.toUpperCase())) {
                        whatsapp.setStatus(whatsappStatus);
                    }
                }
            }
        }
        return "Вы изменили статус.";
    }

    @Override
    public String createContact() {
        System.out.println("Enter your userName: ");
        String userName = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : newWhatsapp) {
            if (whatsapp.getUserName().equals(userName)) {
                System.out.println("Enter your password: ");
                String password = new Scanner(System.in).nextLine();
                if (whatsapp.getCreatePassword().equals(password)) {
                    System.out.println("Enter contact user  name: ");
                    String userContact = new Scanner(System.in).nextLine();
                    System.out.println("Enter contact phone Number: ");
                    String phoneNumber = new Scanner(System.in).nextLine();
                    Contacts contacts1 = new Contacts(phoneNumber, userContact);
                    whatsapp.getContacts().add(contacts1);
                }
            }
        }
        return "Contacts Created.";
    }

    @Override
    public Map<String, Message> message() {
        Map<String,Message> newMessage = new HashMap<>();
        System.out.println("Enter your password: ");
        String password = new Scanner(System.in).nextLine();
        for (Whatsapp whatsapp : newWhatsapp) {
            if (whatsapp.getCreatePassword().equals(password)){
                System.out.println("Выберите контакт, enter user name:  ");
                String userName = new Scanner(System.in).nextLine();
                for (Contacts contact : whatsapp.getContacts()) {
                   if (contact.getUserName().equals(userName)){
                       while (true) {
                           System.out.println("Write message: ");
                           String messages = new Scanner(System.in).nextLine();
                           Message message = new Message(messages);
                           newMessage.put(whatsapp.getUserName(),message);
                       }
                    }
                }

            }
        }
        return newMessage;
    }
}
