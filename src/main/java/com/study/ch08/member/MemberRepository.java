package com.study.ch08.member;

public class MemberRepository {

    int insert(Member member) {
        Member[] members = new Member[3];
        for (int i = 0; i < members.length; i++) {
            if(members[i] == null) {
                members[i] = member;
                break;
            }
        }
        System.out.println("저장소에 Member 저장");
        System.out.println(member);
        return 1;
    }

}
