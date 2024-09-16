package com.designPattern.CreationalPatterns.BuilderPattern;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;

    //私有化构造函数，确保只能通过Builder来创建Computer对象
    private Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
    }

    //静态内部类
    public static class Builder{
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;

        public Builder(String CPU, String RAM){
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage){
            this.storage = storage;
            return this; //链式调用
        }

        public Builder setGPU(String GPU){
            this.GPU = GPU;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    @Override
    public String toString(){
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage + ", GPU=" + GPU + "]";
    }


}
