package com.designPattern.CreationalPatterns.FactoryPattern.FactoryMethodPattern;

public class SamsungPhone implements Phone{
    @Override
    public void displayInfo() {
        System.out.println("This is a Samsung phone");
    }
}
