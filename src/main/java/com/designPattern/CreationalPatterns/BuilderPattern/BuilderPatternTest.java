package com.designPattern.CreationalPatterns.BuilderPattern;

public class BuilderPatternTest {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i7", "16BG")
                .setStorage("1TB SSD")
                .setGPU("NVIDIA RTX 3080")
                .build();

        System.out.println(computer);
    }
}
