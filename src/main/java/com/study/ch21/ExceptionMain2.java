package com.study.ch21;

import java.util.ArrayList;
import java.util.List;

public class ExceptionMain2 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("이동윤");
        nameList.add("삼동윤");
        nameList.add(null);
        nameList.add("오동윤");

        try { // try범위도 잘 생각해서 넣어야한다.
            for (int i = 0; i < 5; i++) {
                String name = nameList.get(i);
                if (name.equals("오동윤")) {
                    System.out.println("오동윤을 찾음!!!");

                }
            }
        } catch (NullPointerException e) {
            e.printStackTrace(); // 예외처리가 된 것이 무엇인지 출력해주는 역할
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) { // 마지막엔 Exception을 걸어준다. 예상하지 못하는 경우
            e.printStackTrace();
        } finally { // 예외가 안터져도 터져도 실행되는 부분, 엑셀이 꺼졌지만 저장되어있는 부분...
            System.out.println("이거는 무조건 실행됨");
        }


        System.out.println("프로그램 정상 종료");
    }

}

// 실행 전 과 후의 오류가 있다.
// 실행 중 일어나는 오류는 전부 RuntimeException
// input output 연결이 안되면 IOException
// DB와 연결이 안되면 SQLException