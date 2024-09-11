package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public interface DeviceFactory {
    Phone createPhone();
    Battery createBattery();
    Screen createScreen();
}
