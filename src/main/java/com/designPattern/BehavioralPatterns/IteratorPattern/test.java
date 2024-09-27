package com.designPattern.BehavioralPatterns.IteratorPattern;

public class test {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");

        Iterator<String> iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
