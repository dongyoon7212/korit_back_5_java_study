package com.study.test2.A;

public class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory() {}

    public static Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }
}
