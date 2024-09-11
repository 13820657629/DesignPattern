package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class AppleFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Battery createBattery() {
        return new AppleBattery();
    }

    @Override
    public Screen createScreen() {
        return new AppleScreen();
    }
}
