package com.study.ch07;

public class Computer {
   String type;
   String cpu;
   String ram;
   String disk;

   //클래스 안에 정의된 함수는 메소드

   // 생성자
   // 1. 클래스의 이름과 동일하다.
   // 2. 메소드의 형태이다.
   Computer() {
      type = "컴퓨터";
   }
   // void없는 이유 => 주소값을 반환함

   // 오버로딩 가능
   Computer(String type) {
      this.type = type;
   }

   /*
   * this
   * 자기자신의 주소값
   * */

   //void 리턴 자료형
   void showInfo() {
      System.out.println("type " + type);
      System.out.println("cpu: " + cpu);
      System.out.println("ram: " + ram);
      System.out.println("disk: " + disk);
   }
}
