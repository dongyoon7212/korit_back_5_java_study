package com.study.ch15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SendData<T, R, E> { // 제네릭클래스 통상적으로 T는 Type, 알파벳은 아무거나 상관없음, 여러개 가능
    // 제네릭타입으로 일반자료형은 쓸 수 없다. int등등 int가 쓰고 싶으면 Integer를 써야한다.
    private int code;
    private T data; // 자유롭게 변할 수 있는 자료형이 된다.

    public void send(T message) {
        System.out.println("[ 데이터 전송 ]");
        System.out.println("code: " + code);
        System.out.println("data: " + data);
    }
}
