package com.designPattern.CreationalPatterns.ObjectPoolPattern;

//可复用的对象
public class PooledObject {
    private String name;

    public PooledObject(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void doWork(){
        System.out.println("Doing work with object:" + name);
    }
}
