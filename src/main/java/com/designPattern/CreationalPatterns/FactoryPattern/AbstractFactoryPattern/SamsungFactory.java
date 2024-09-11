package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class SamsungFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Battery createBattery() {
        return new SamsungBattery();
    }

    @Override
    public Screen createScreen() {
        return new SamsungScreen();
    }
}
