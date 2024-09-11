package com.designPattern.CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        PhoneFactory appleFactory = new ApplePhoneFactory();
        Phone apple = appleFactory.createPhone();
        apple.displayInfo();

        PhoneFactory samsungFactory = new SamsungPhoneFactory();
        Phone samsung = samsungFactory.createPhone();
        samsung.displayInfo();

        PhoneFactory xiaomiFactory = new XiaomiPhoneFactory();
        Phone xiaomi = xiaomiFactory.createPhone();
        xiaomi.displayInfo();

    }
}
