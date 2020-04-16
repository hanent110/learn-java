package com.dtreesoft.grammer.NestedClass;

public class NestedTest {

    public void staticNestedClass() {
        // static nested class 일 경우 제어자(아웃터클래스)를 붙인 이름으로 Item 객체를 생성할 수 있다.
        Invoice.Item item = new Invoice.Item("book", 1, 10000);
        item.showInfo();

        // static nested class 일 경우 인스턴스로 Item 객체를 생성할 수 없다.
        Invoice invoice = new Invoice();
//        Invoice.Item invoiceItem = invoice.new Item("instance book", 1, 10000);   // Compile Error
    }

    public void innerClass() {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("fred");
        fred.showInfo();
        fred.leave();

        //-----------------------------------------------------------------------
        // static nested class 가 아닌 inner class 이므로 외부에서 생성 불가.
//        Network.Member inner = new Network.Member();    // Compile Error

        //-----------------------------------------------------------------------
        // 이너클래스가 public 으로 선언된 경우 외부 클래스의 인스턴스로는 생성이 가능하다.
        Network.Member william = myFace.new Member("william");
        william.showInfo();

        // 이너클래스가 default 로 선언된 경우 '같은 패키지 내에서' 외부 클래스의 인스턴스로는 생성이 가능하다.
        Network.DefaultMember defaultMember = myFace.new DefaultMember("default");
        defaultMember.showInfo();

        // 이너클래스가 private 으로 선언된 경우 아예 Network.PrivateMember 선언 조차 할 수 없다.
//        Network.PrivateMember privateMember = myFace.new PrivateMember("default");
        // 따라서 아래와 같이 public 이너클래스를 상속받아서 public 이너클래스 타입으로 받아서 사용하는 방법으로는 가능하다.
        Network.Member privateMember = myFace.enrollPrivateMember("private");
        privateMember.showInfo();
    }
}
