package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class SamsungPhone implements Phone{
    @Override
    public void displayInfo() {
        System.out.println("This is a Samsung phone");
    }
}
