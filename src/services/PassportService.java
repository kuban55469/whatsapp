package services;

import classes.Passport;

import java.util.List;

public interface PassportService {
    String cratePassport(List<Passport> passports);
    void createPassportt();
    List<Passport> returnPassport();
    List<Passport> findByFirstName(String name);
}
