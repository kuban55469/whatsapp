package services.impl;

import classes.Passport;
import enums.Country;
import enums.Gender;
import services.PassportService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassportServiceImpl implements PassportService {
    List<Passport> newPassports = new ArrayList<>();
    @Override
    public String cratePassport(List<Passport> passports) {
        newPassports.addAll(passports);
        return "Passports created";
    }

    @Override
    public void createPassportt() {
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите id: ");
        int id = scanner.nextInt();
        System.out.print("Введите фамилию: ");
        String surName = scanner1.nextLine();
        System.out.print("Введите имя: ");
        String name = scanner1.nextLine();
        System.out.print("Введите день рождение: ");
        String dthb = sc.nextLine();
        System.out.print("Введите страну: ");
        String country = scanner1.nextLine();
        System.out.print("Введите пол: ");
        String gender = scanner1.nextLine();
        Passport p1 = new Passport(id, surName, name, dthb, Country.valueOf(country.toUpperCase()), Gender.valueOf(gender.toUpperCase()));
        System.out.println(p1);
        newPassports.add(p1);
    }

    @Override
    public List<Passport> returnPassport() {
        return newPassports;
    }

    @Override
    public List<Passport> findByFirstName(String name) {
        List<Passport> newProf  = new ArrayList<>();
        for (Passport newPassport : newPassports) {
            if (newPassport.getFirstName().equals(name)){
                newProf.add(newPassport);
            }
        }
        return newProf;
    }
}
