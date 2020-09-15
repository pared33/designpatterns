package com.example;

abstract class Plan {
    protected Double rate;

    abstract void getRate();

    public void calculateBill(Integer units) {
        System.out.println(units * rate);
    }
}
