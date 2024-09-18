package com.designPattern.CreationalPatterns.ObjectPoolPattern;


import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

//对象池
public class ObjectPool {
    private List<PooledObject> availableObjects = new ArrayList<>();
    private List<PooledObject> usedObjects = new ArrayList<>();

    //初始化池中的对象
    public ObjectPool(int initialSize){
        for(int i = 1; i <= initialSize; i++){
            availableObjects.add(new PooledObject("Object-" + i));
        }
    }

    //获取对象
    public synchronized PooledObject borrowObject(){
        if(availableObjects.isEmpty()){
            System.out.println("No available object. Creating a new one...");
            PooledObject newObj = new PooledObject("Object-New");
            usedObjects.add(newObj);
            return newObj;
        }else{
            PooledObject obj = availableObjects.remove(availableObjects.size() - 1);
            usedObjects.add(obj);
            return obj;
        }
    }

    //归还对象
    public synchronized void returnObject(PooledObject obj){
        usedObjects.remove(obj);
        availableObjects.add(obj);
        System.out.println(obj.getName() + " returned to pool");
    }
}
