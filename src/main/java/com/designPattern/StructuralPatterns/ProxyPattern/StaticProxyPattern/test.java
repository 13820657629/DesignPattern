package com.designPattern.StructuralPatterns.ProxyPattern.StaticProxyPattern;

import java.time.Period;

public class test {
    public static void main(String[] args) {
        RealService realService = new RealService();
        ServiceProxy proxy = new ServiceProxy(realService);
        proxy.performOperation();
    }
}
