package com.study.ch17;

import com.study.ch13.A;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;

public class HashSetMain {


    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("이동윤");
        nameList.add("삼동윤");
        nameList.add("삼동윤");
        nameList.add("오동윤");

        HashSet<String> names = new HashSet<>();
//        names.add("이동윤"); // set은 set, get, indexOf가 없음(순서가 없어서), 수정이 불가능 => 지우고 새로 추가 해야함
//        names.add("삼동윤"); // 순서가 없지만 Hash값이 순서가 있음
//        names.add("사동윤");
//        names.add("오동윤");

        names.addAll(nameList); // set은 중복이 안됨, 중복제거로 이용 가능

        System.out.println(names);

        ArrayList<String> newNameList = new ArrayList<>();
        newNameList.addAll(names);
        System.out.println(newNameList); // 중복 가능 꺼내기 가능
        newNameList.sort(new Comparator<String>() { // 순서정렬
            @Override
            public int compare(String o1, String o2) {
                return Objects.hash(o1) - Objects.hash(o2);
            }
        });
        System.out.println(newNameList);

        String findName = null;

        for (String name : names) {
            if (name.equals("사동윤")) {
                findName = name;
                break;
            }

        }

        System.out.println(findName);
    }

}
