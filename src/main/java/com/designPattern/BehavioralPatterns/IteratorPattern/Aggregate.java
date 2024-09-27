package com.designPattern.BehavioralPatterns.IteratorPattern;

/**
 * 聚合接口
 * @param <T>
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
