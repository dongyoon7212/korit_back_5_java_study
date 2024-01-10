package com.study.ch15;

public class SendMain {

    public static void main(String[] args) {
        SendData<String> sendData1 = new SendData<>(200, "이동윤");
        // <>안에 String을 주면 String자료형으로 받는다, 앞에서 자료형을 정의하고 있으면 뒤에는 생략 가능!!, 꺽쇠까지 생략가능(자료형은 Object로 된다.)
//        send(sendData1);
        SendData<Member> sendData2 = new SendData<>(200, new Member("이동윤" , "01094027212"));
        // Member자료형으로 받는다.
        send(sendData2);
        SendData<VipMember> sendData3 = new SendData<>(200, new VipMember("장현원", "0104298424"));
        send(sendData3);
    }
    // 제네릭이 어떤게 들어갈지 모르겠다. => ? 와일드카드
    public static void send(SendData<? extends Member> sendData) { // Member이거나 Member를 상속받은것만 들어간다.(상위에서 하위) 제한
    // public static void send(SendData<? super VipMember> sendData) {
    // VipMember이거나 VipMember의 부모까지만 들어간다.(하위에서 상위) 제한
        sendData.send();
    }

}
