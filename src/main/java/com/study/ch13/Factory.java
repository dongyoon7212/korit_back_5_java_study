package com.study.ch13;

public class Factory {
    // 싱글톤
    // - 유일한 객체 하나만 만들어야 할 때
    // - 기능적인 서비스 클래스들

    // 싱글톤 - 자기 자신 클래스를 스태틱 변수로 가지고 있어야 한다. => 변수명을 instance로
    private static Factory instance;
    private String factoryName;
    private int autoCount;
    private final int DEFAULT_NUMBER = 2024000;

    // 싱글톤 - 생성자는 private로 외부 생성을 막아준다.
    private Factory() {}

    // 싱글톤 - 아래와 같다. *** 중요 ***
    public static Factory getInstance() {
        // instance(static) 하나의 공간 => 생성 안하고 호출 가능
        // 맨처음 한번은 null => 그 다음은 생성 => 다시 if문이 돌땐 null 아니라서 한번만 생성되는 것
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

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
