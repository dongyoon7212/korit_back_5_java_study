package com.study.ch19;

public class BuilderMain {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = Car.builder();
                                    // Car에서 CarBuilder 생성자호출
        Car car2 = carBuilder.build();
        // 아래 한줄로
        Car car = Car.builder()
                .model("아반떼")
                .color("블랙")
                .build();

//        Car car = Car.builder() //builder() 스태틱
//                .color("블랙")
//                .model("아반떼")
//                .build();

        System.out.println(car);

        Member member = Member.builder()
                .phone("01094027212")
                .build();

        Book book = Book.builder()
                .code("1234")
                .name("어린왕자")
                .build();

        System.out.println(book);

        MacBook macBook = MacBook.builder()
                .cpu("M1")
                .ram("8GB")
                .build();

        System.out.println(macBook);

        Phone phone = Phone.builder()
                .companyName("애플")
                .modelName("아이폰12Pro")
                .build();

        System.out.println(phone);

        Music music = Music.builder()
                .type("팝송")
                .musicTitle("CPR")
                .build();

        System.out.println(music);

        Cafe cafe = Cafe.builder()
                .cafeName("투썸플레이스")
                .menuCount(16)
                .location("다대포")
                .build();

        System.out.println(cafe);

        Cafe cafe2 = Cafe.builder()
                .cafeName("셀렉토 커피")
                .location("낫개역")
                .menuCount(10)
                .build();

        System.out.println(cafe2);

        Book2 book2 = Book2.builder()
                .name("어린왕자")
                .code("1234")
                .build();

        System.out.println(book2);
    }



}
