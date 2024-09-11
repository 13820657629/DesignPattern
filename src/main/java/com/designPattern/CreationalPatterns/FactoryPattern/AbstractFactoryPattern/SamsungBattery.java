package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class SamsungBattery implements Battery{
    @Override
    public void displayBatteryInfo() {
        System.out.println("Samsung's battery capacity is 3500mAh");
    }
}
