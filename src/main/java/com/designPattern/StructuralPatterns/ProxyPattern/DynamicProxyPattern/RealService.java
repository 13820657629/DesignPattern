package com.designPattern.StructuralPatterns.ProxyPattern.DynamicProxyPattern;

public class RealService implements Service{
    @Override
    public void performOperation() {
        System.out.println("执行实际操作");
    }

    @Override
    public void anotherOperation() {
        System.out.println("执行另一个操作");
    }
}
