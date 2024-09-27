package com.designPattern.BehavioralPatterns.IteratorPattern;

/**
 * 迭代器接口
 * @param <T>
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
