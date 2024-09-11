package com.designPattern.CreationalPatterns.FactoryPattern.AbstractFactoryPattern;

public class SamsungScreen implements Screen{
    @Override
    public void displayScreenInfo() {
        System.out.println("Samsung's screen resolution is 2960x1440");
    }
}
