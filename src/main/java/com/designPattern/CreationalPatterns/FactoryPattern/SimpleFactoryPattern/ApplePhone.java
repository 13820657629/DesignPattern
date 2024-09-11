package com.designPattern.CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class ApplePhone implements Phone{
    @Override
    public void displayInfo() {
        System.out.println("This is a Apple phone");
    }
}
