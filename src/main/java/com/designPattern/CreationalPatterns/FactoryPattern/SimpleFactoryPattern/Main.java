package com.designPattern.CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Phone apple = PhoneFactory.createPhone("apple");
        apple.displayInfo();

        Phone samsung = PhoneFactory.createPhone("samsung");
        samsung.displayInfo();

        Phone xiaomi = PhoneFactory.createPhone("xiaomi");
        xiaomi.displayInfo();
    }
}
