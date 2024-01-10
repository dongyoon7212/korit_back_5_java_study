package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //NoArgus는 안됨, AllArgus 가능
@AllArgsConstructor
@Data
public class Student2 {
    private final String name;
    private String address;
    @NonNull // phone final이 없어도 상수로, Null만 아니면 된다.
    private String phone;
}
