package com.study.ch16;

import java.util.ArrayList;

public class StudentListMain {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("이동윤", 26));
        students.add(new Student("삼동윤", 27));
        students.add(new Student("사동윤", 28));
        students.add(new Student("오동윤", 29));

        System.out.println(students);

        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            student.setAge(student.getAge() + 1);
//            students.get(i).setAge(students.get(i).getAge() + 1); // 위와 같다.
        }

        //향상된 for
        for (Student student : students) { // students에서 꺼내 student에 대입 처음부터 끝까지, 중간에 멈출 수 없음.
            student.setAge(student.getAge() + 1);
        } // 배열, ArrayList에서도 사용가능

        System.out.println(students);

        Student[] studentArray = new Student[4];
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student("이동", 26);
        }

    }

}
