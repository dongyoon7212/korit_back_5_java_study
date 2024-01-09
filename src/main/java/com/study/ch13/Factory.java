package com.study.ch13;

public class Factory {
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 2024000;

    public Factory() {}

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public Car produce(String model) {
        autoCount++;
        return new Car(Integer.toString(DEFAULT_NUMBER + autoCount), model); //"" + (DEFAULT_NUMBER + autoCount)
    }

    @Override
    public String toString() {
        return "Factory{" +
                "factoryName='" + factoryName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFAULT_NUMBER=" + DEFAULT_NUMBER +
                '}';
    }
}
