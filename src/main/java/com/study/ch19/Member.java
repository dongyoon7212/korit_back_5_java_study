package com.study.ch19;

import lombok.Builder;
import lombok.Data;

// 다 어노테이션 사용했을때
@Builder // 올아규컨스트럭터 내장
@Data
public class Member {
    private String name;
    private String phone;
}
