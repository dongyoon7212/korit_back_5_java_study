package com.study.ch14;

import java.util.Objects;

/*
 * *** [[ Object 클래스 ]] ***
 *
 * 모든 클래스는 Object클래스를 상속받고 있다. extends Object가 생략되어있음.
 * */
public class ObjectTest {
    private String name;
    private String address;

    public ObjectTest(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "toString 메소드 테스트";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectTest that = (ObjectTest) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
