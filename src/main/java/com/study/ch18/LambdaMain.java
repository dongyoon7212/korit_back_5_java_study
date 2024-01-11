package com.study.ch18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaMain {

    public static void main(String[] args) {
        // 함수 안에서 함수를 정의하고 있다. 이유는 람다식에서는 가능하다.
        Runnable start = () -> {
            System.out.println("프로그램을 실행합니다.");
            System.out.println("데이터를 초기화 합니다.");
            int a = 10;
            int b = 20;
            System.out.println("a + b = " + (a + b));
        };

        start.run();

        // Supplier
        // 매개변수가 없는데 리턴은 있음
        Supplier<Integer> supplier1 = () -> 10;

        int a = supplier1.get();

        Supplier<Scanner> scannerInstance = () -> new Scanner(System.in);
//        scannerInstance.get().nextLine();

        // Consumer
        // 매개변수가 있는데 리턴은 없음
        Consumer<String> setName = name -> { // 리턴이 없으면 중괄호 필요
            String newName = name + "님";
            System.out.println(newName);
        };

        setName.accept("이동윤");

        ArrayList<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");

        Consumer<String> action = str -> System.out.println(str);
        action.accept("이동윤");

//        strList.forEach(action);
        strList.forEach(str -> System.out.println(str)); // 같다.

        // Function
        // 매개변수 있고 리턴도 있다.
        Function<Integer, String> fx1 = num -> Integer.toString(num * num);

        String result = fx1.apply(10);
        System.out.println(result);

        String result2 = fx1.andThen(num -> {
            System.out.println("andThen에 넣은 함수" + num);
            return "문자열" + num;
        }).apply(10);

        System.out.println(result2);

        // Predicate
        // 조건식을 만들때 쓴다.
        Predicate<Integer> filterFx = num -> num % 2 == 0;

        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numList.add(i + 1);
        }
        System.out.println(numList);

        List<Integer> newList = numList.stream().filter(filterFx).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList2 = newList.stream().map(num -> num * 2).collect(Collectors.toList());
        System.out.println(newList2);
    }

}
