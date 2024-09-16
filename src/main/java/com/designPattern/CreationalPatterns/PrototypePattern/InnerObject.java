package com.designPattern.CreationalPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InnerObject implements Cloneable{
    public String detail;
    public List<String> detailsList;
    public int[] numbers;

    public InnerObject(String detail, List<String> detailsList, int[] numbers) {
        this.detail = detail;
        this.detailsList = detailsList;
        this.numbers = numbers;
    }

    protected InnerObject clone() throws CloneNotSupportedException {
        InnerObject cloned = (InnerObject) super.clone();

        cloned.numbers = numbers.clone();

        cloned.detailsList = new ArrayList<>(detailsList);
        return cloned;

    }

    @Override
    public String toString() {
        return "InnerObject{" +
                "detail='" + detail + '\'' +
                ", detailsList=" + detailsList +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
