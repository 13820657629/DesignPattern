package com.designPattern.CreationalPatterns.ObjectPoolPattern;

import java.security.Policy;

public class ObjectPoolDemo {
    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool(2);

        PooledObject obj1 = pool.borrowObject();
        obj1.doWork();

        PooledObject obj2 = pool.borrowObject();
        obj2.doWork();

        pool.returnObject(obj1);

        PooledObject obj3 = pool.borrowObject();
        obj3.doWork();
    }
}
