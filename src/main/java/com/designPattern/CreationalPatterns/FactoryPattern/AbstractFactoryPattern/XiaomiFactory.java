package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class XiaomiFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Battery createBattery() {
        return new XiaomiBattery();
    }

    @Override
    public Screen createScreen() {
        return new XiaomiScreen();
    }
}
