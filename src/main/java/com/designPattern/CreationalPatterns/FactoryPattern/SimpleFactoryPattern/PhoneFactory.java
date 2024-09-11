package com.designPattern.CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class PhoneFactory {
    public static Phone createPhone(String type){
        if("apple".equals(type)){
            return new ApplePhone();
        }else if("samsung".equals(type)){
            return new SamsungPhone();
        }else if("xiaomi".equals(type)){
            return new XiaomiPhone();
        }else{
            throw new IllegalArgumentException("Unknown phone type : " + type);
        }
    }
}
