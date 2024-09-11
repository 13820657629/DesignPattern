package com.designPattern.CreationalPatterns.FactoryPattern.SimpleFactoryPattern;

public class SamsungPhone implements Phone{
    @Override
    public void displayInfo() {
        System.out.println("This is a Samsung Phone");
    }
}
