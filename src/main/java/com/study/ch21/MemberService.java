package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public interface MemberService {

    public void printMemberList(ArrayList<Member> members) throws Exception; // 인터페이스는 확신하지 않는 이상 무조건 throws Exception 달아주기 (강제 예외처리)

}
