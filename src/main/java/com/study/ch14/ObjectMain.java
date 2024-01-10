package com.study.ch14;

public class ObjectMain {

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("이동윤", "사하구");

        System.out.println(objectTest.toString());
        System.out.println(objectTest); // 이렇게 해도 자동으로 toString이 호출된다. => 굳이 toString을 호출할 필요 없다.

        ObjectTest objectTest1 = new ObjectTest("이동윤", "사하구");

        System.out.println(objectTest.equals(objectTest1)); // 서로 다른 Object임, 메모리 주소가 다름 => equals는 주소 비교
        // 메모리 주소 달라고 값이 같으면 ture
        System.out.println(objectTest == objectTest1); // 이거랑 같음
        // 메모리 주소만 비교
        System.out.println(objectTest.getClass()); //생성자로 접근할때 getClass()
        System.out.println(objectTest1.getClass());
        System.out.println(ObjectTest.class); // 스태틱으로 접근할때 class

        System.out.println(objectTest.hashCode()); // 실제 메모리 주소
        System.out.println(objectTest1.hashCode()); // 찍어낸 틀이 달라도 두개의 값이 같으면 같은 해쉬값으로 만듦

    }
}
