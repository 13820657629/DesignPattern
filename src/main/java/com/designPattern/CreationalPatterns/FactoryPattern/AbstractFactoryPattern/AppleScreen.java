package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class AppleScreen implements Screen{
    @Override
    public void displayScreenInfo() {
        System.out.println("Apple's screen resolution is 2436x1125");
    }
}
