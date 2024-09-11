package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class XiaomiBattery implements Battery{
    @Override
    public void displayBatteryInfo() {
        System.out.println("Xiaomi's battery capacity is 4000mAh");
    }
}
