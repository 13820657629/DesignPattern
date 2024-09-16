package com.designPattern.CreationalPatterns.PrototypePattern;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> detailsList = new ArrayList<>(Arrays.asList("detail1", "detail2"));
        int[] numbers = {1, 2, 3};
        InnerObject innerObject = new InnerObject("Initial Detail", detailsList, numbers);

        Prototype prototype1 = new Prototype("Alice", 25, innerObject);

        Prototype prototype2 = prototype1.clone();

        prototype2.innerObject.detail = "Changed Detail";
        prototype2.innerObject.detailsList.add("detail3");
        prototype2.innerObject.numbers[0] = 99;

        System.out.println("Prototype 1: " + prototype1);
        System.out.println("Prototype 2: " + prototype2);
    }
}
