package com.designPattern.CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class XiaomiPhoneFactory implements PhoneFactory{
    @Override
    public Phone createPhone() {
        return new XiaomiPhone();
    }
}
