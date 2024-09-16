package com.designPattern.CreationalPatterns.PrototypePattern;

import javax.sound.sampled.Port;

public class Prototype implements Cloneable{
    public String name;
    public int age;
    public InnerObject innerObject;

    public Prototype(String name, int age, InnerObject innerObject) {
        this.name = name;
        this.age = age;
        this.innerObject = innerObject;
    }

    @Override
    protected Prototype clone() throws CloneNotSupportedException {
        Prototype cloned = (Prototype) super.clone();
        cloned.innerObject = innerObject.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", innerObject=" + innerObject +
                '}';
    }
}
