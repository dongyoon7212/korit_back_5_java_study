package com.study.ch14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // 이 안에 Setter, Getter, EqualsAndHashCode, toString이 다 들어있음
public class Student {
    private String name;
    private String phone;
    private String address;
    private int age;
}
