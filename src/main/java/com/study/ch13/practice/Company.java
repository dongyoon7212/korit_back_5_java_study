package com.study.ch13.practice;

public class Company {
    private static Company instance;
    private String companyName;
    private int autoCount;
    private final int DEFUALT_NUMBER = 20240000;

    private Company() {}

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
        System.out.println(companyName);
    }

    public Product produce(String model) {
        autoCount++;
        return new Product(Integer.toString(DEFUALT_NUMBER + autoCount), model);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", autoCount=" + autoCount +
                ", DEFUALT_NUMBER=" + DEFUALT_NUMBER +
                '}';
    }
}
