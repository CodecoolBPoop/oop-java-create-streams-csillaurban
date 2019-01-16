package com.codecool;

import java.util.function.Supplier;

public class Fibonacci implements Supplier {
    private int prev = 0;
    private int current = 1;
    private int next;

    @Override
    public Integer get() {
        next = prev + current;
        int temp = prev;
        prev = current;
        current = next;
        return temp;
    }
}
