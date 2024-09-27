package com.designPattern.BehavioralPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合类
 */
public class ConcreteAggregate<T> implements Aggregate<T>{

    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public List<T> getItems(){
        return items;
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }
}
