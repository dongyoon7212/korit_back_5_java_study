package com.study.ch16;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
    private static ArrayList<Member> members = new ArrayList<>(); // 전체 영역에서 공유하도록

    public static String inputSearchName(String label) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(label + " >> ");
        return scanner.nextLine();
    }

    public static Member findMemberByName(String name) {
        for (Member member : members) { // members.indexOf는 사용불가, 주소가 아닌 값으로 찾는 것
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return  null;
    }

    public static void menuPrint() {
        System.out.println("회원 관리 프로그램");
        System.out.println("1. 회원 등록");
        System.out.println("2. 회원 이름 수정");
        System.out.println("3. 회원 주소 수정");
        System.out.println("4. 회원 이름으로 조회");
        System.out.println("5. 회원 전체 조회");
        System.out.println("6. 회원 삭제");
        System.out.println("q. 프로그램 종료");
        System.out.print("메뉴 선택 >> ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedMenu = null;
        // 메소드 안에 있는 변수들은 초기화가 일어나야함 하지만 String 같은 경우는 자동으로 null이 지정됨(생략가능), int는 값 초기화 해야함

        while(true) {
            menuPrint();
            selectedMenu = scanner.nextLine();

            if("q".equalsIgnoreCase(selectedMenu)) {
                break;
            } else if("1".equals(selectedMenu)) {
                /**
                 * [ 회원 등록하기 ]
                 * 이름 >> 김준일
                 * 주소 >> 부산 동래구
                 * << 등록이 완료되었습니다. >>
                 */
                String name = null;
                String address = null;
                System.out.println("[ 회원 등록하기 ]");
                System.out.print("이름 >> ");
                name = scanner.nextLine();
                System.out.print("주소 >> ");
                address = scanner.nextLine();

                Member member = new Member(name, address); // Member 객체 생성 (값 주입)
                members.add(member); // members에 추가
                System.out.println("<< 등록이 완료되었습니다. >>");

            } else if("2".equals(selectedMenu)) {
                /**
                 * [ 회원 이름 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요 >> 김준일
                 * 이름 >> 김준이
                 * << 수정이 완료되었습니다. >>
                 */
                System.out.println("[ 회원 이름 수정하기 ]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세요");
                Member findMember = findMemberByName(searchName);

                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("이름 >> ");
                String updateName = scanner.nextLine();
                findMember.setName(updateName);
                System.out.println("<< 수정이 완료되었습니다. >>");

            } else if("3".equals(selectedMenu)) {
                /**
                 * [ 회원 주소 수정하기 ]
                 * 수정 할 회원의 이름을 입력하세요 >> 김준이
                 * 해당 이름의 회원이 존재하지 않습니다.
                 * 주소 >> 부산 동래구 사직동
                 * << 수정이 완료되었습니다. >>
                 */
                System.out.println("[ 회원 주소 수정하기 ]");
                String searchName = inputSearchName("수정 할 회원의 이름을 입력하세요");
                Member findMember = findMemberByName(searchName);

                if (findMember == null) {
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue;
                }
                System.out.print("주소 >> ");
                String updateAddress = scanner.nextLine();
                findMember.setName(updateAddress);
                System.out.println("<< 수정이 완료되었습니다. >>");

            } else if("4".equals(selectedMenu)) {
                /**
                 * [ 회원 이름으로 조회하기 ]
                 * 조회 할 회원의 이름을 입력하세요 >> 김준이
                 * Member 객체 toString();
                 * << 조회가 완료되었습니다. >>
                 */
                String searchName = null;
                System.out.println("[ 회원 이름으로 조회하기 ]");
                searchName = inputSearchName("조회 할 회원의 이름을 입력하세요");
//                System.out.print("조회 할 회원의 이름을 입력하세요 >> ");
//                searchName = scanner.nextLine();

                Member findMember = findMemberByName(searchName);
                if (findMember == null) { // null이 아니면 if문 실행 안함
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue; // 다시 while문으로
                }
                System.out.println(findMember);
                System.out.println("<< 조회가 완료되었습니다. >>");

            } else if("5".equals(selectedMenu)) {
                /**
                 * [ 회원 전체 조회하기 ]
                 * MemberList 전체 반복 toString();
                 * << 조회가 완료되었습니다. >>
                 */
                System.out.println("[ 회원 전체 조회하기 ]");
                for (Member member : members) {
                    System.out.println(member);
                }
                System.out.println("<< 조회가 완료되었습니다. >>");

            } else if("6".equals(selectedMenu)) {
                /**
                 * [ 회원 이름으로 삭제하기 ]
                 * 삭제 할 회원의 이름을 입력하세요 >> 김준이
                 * 삭제 된 Member 객체 toString();
                 * << 삭제가 완료되었습니다. >>
                 */
                String searchName = null;
                System.out.println("[ 회원 이름으로 삭제하기 ]");
                System.out.print("삭제 할 회원의 이름을 입력하세요 >> ");
                searchName = scanner.nextLine();

                Member findMember = null;
                for (Member member : members) { // members.indexOf는 사용불가, 주소가 아닌 값으로 찾는 것
                    if (member.getName().equals(searchName)) {
                        findMember = member;
                        break; // for문 break
                    }
                }
                if (findMember == null) { // null이 아니면 if문 실행 안함
                    System.out.println("해당 이름의 회원이 존재하지 않습니다.");
                    continue; // 다시 while문으로
                }
                members.remove(findMember); // findMember에 이미 찾은 주소가 있음
//                members.remove(members.indexOf(findMember)); // findMember의 인덱스 번호를 찾아 지움
                System.out.println(findMember);
                System.out.println("<< 삭제가 완료되었습니다. >>");

            } else {
                System.out.println("다시 선택하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료.");

    }

}