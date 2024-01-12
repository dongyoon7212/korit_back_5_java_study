package com.study.ch20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    OK(200, "정상적인 요청"),
    // 생성자의 이름을 OK로 생성 => 하나의 키워드로 바꿈
    BADREQUEST(400, "비정상적인 요청");

    private int code;
    private String StatusName;
}
