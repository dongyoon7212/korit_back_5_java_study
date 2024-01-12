package com.study.ch21;

import com.study.ch19.Member;

import java.util.ArrayList;

public class MemberMain {
    // 일반적으로(JVM) 최상위에서 예외처리
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        members.add(Member.builder().name("이동윤").build());
        members.add(Member.builder().name("삼동윤").build());
        members.add(Member.builder().name("사동윤").build());
        members.add(Member.builder().name("오동윤").build());

        MemberService memberService = new MemberServiceImpl();
        try {
            memberService.printMemberList(members);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("프로그램 종료");


    }

}
