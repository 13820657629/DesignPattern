package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        DeviceFactory appleFactory = new AppleFactory();
        Phone applePhone = appleFactory.createPhone();
        Battery appleBattery = appleFactory.createBattery();
        Screen appleScreen = appleFactory.createScreen();

        applePhone.displayInfo();
        appleBattery.displayBatteryInfo();
        appleScreen.displayScreenInfo();

        System.out.println("------------------------------------");

        DeviceFactory samsungFactory = new SamsungFactory();
        Phone samsungPhone = samsungFactory.createPhone();
        Battery samsungBattery = samsungFactory.createBattery();
        Screen samsungScreen = samsungFactory.createScreen();

        samsungPhone.displayInfo();
        samsungBattery.displayBatteryInfo();
        samsungScreen.displayScreenInfo();

        System.out.println("-------------------------------------");

        DeviceFactory xiaomiFactory = new XiaomiFactory();
        Phone xiaomiPhone = xiaomiFactory.createPhone();
        Battery xiaomiBattery = xiaomiFactory.createBattery();
        Screen xiaomiScreen = xiaomiFactory.createScreen();

        xiaomiPhone.displayInfo();
        xiaomiBattery.displayBatteryInfo();
        xiaomiScreen.displayScreenInfo();
    }
}
