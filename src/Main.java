import classes.Contacts;
import classes.Passport;
import enums.Country;
import enums.WhatsappStatus;
import services.impl.PassportServiceImpl;
import services.impl.WhatsappProfileServiceImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WhatsappProfileServiceImpl profile = new WhatsappProfileServiceImpl();
        PassportServiceImpl passportService = new PassportServiceImpl();
        while (true) {
            System.out.println("""
                                        
                    ====== * Commands * ======
                    1: Создать пасспорт.
                    2: Скачать whatsapp.
                    3: Сохранить контакт.
                    4: Вывести всех людей.
                    5: Вывести всех профилей.
                    6: Вывести всех государств.
                    7: Вывести всех статусов.
                    8: Поиск по имени.
                    9: Поменять статус.
                    10: Отправить сообщение.
                    """);
            switch (sc.nextInt()) {
                case 1:
                    passportService.createPassportt();
                    break;
                case 2:
                    profile.crateProfile();
                    break;
                case 3:
                    System.out.println(profile.createContact());
                    break;
                case 4:
                    System.out.println(passportService.returnPassport());
                    break;
                case 5:
                    System.out.println(profile.returnProfiles());
                    break;
                case 6:
                    List<Country> countries = new ArrayList<>(List.of(Country.values()));
                    for (Country country : countries) {
                        System.out.println(country);
                    }
                    break;
                case 7:
                    List<WhatsappStatus> whatsappStatuses = new ArrayList<>(List.of(WhatsappStatus.values()));
                    for (WhatsappStatus whatsappStatus : whatsappStatuses) {
                        System.out.println(whatsappStatus);
                    }
                    break;
                case 8:
                    System.out.println("Enter first name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.println(passportService.findByFirstName(name));
                    break;
                case 9:
                    List<WhatsappStatus> whatsappStatuses1 = new ArrayList<>(List.of(WhatsappStatus.values()));
                    System.out.println(profile.changeStatus(whatsappStatuses1));
                    break;
                case 10:
                    System.out.println(profile.message());
                    break;
            }
        }
    }
}