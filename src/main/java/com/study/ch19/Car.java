package com.study.ch19;

//import lombok.Builder;
import lombok.ToString;

//@Builder
@ToString
public class Car { // Car -> CarBuilder클래스(static) = 내부 클래스
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Builder 직접 만들기
    public static CarBuilder builder() { // builder메소드에 해당
        return new CarBuilder(); // CarBuilder라는 객체 생성 후 리턴
    }
    // 위에서 CarBuilder클래스 객체 생성
    public static class CarBuilder {
        private String model;
        private String color;

        public Car build() { // build메소드에 해당
            return new Car(model, color); // Car객체로 리턴
        };

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }
    }

}
