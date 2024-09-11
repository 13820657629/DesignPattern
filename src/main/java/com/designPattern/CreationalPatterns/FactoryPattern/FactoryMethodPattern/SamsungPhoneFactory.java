package com.designPattern.CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class SamsungPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }
}
