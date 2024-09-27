package com.designPattern.BehavioralPatterns.IteratorPattern;

public class ConcreteIterator<T> implements Iterator<T>{
    private ConcreteAggregate<T> aggregate;
    private int index = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate){
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.getItems().size();
    }

    @Override
    public T next() {
        return hasNext() ? aggregate.getItems().get(index++) : null;
    }
}
