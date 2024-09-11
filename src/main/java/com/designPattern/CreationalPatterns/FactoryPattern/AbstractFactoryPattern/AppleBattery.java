package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class AppleBattery implements Battery{
    @Override
    public void displayBatteryInfo() {
        System.out.println("Apple's battery capacity is 3000mAh");
    }
}
