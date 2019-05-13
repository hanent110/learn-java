package com.dtreesoft.grammer.NestedClass;

public class NestedTest {

    public void staticNestedClass() {
        // static nested class 일 경우 제어자를 붙인 이름으로 Item 객체를 생성할 수 있다.
        Invoice.Item item = new Invoice.Item("book", 1, 10000);

    }

    public void innerClass() {
        Network myFace = new Network();
        Network.Member fred = myFace.enroll("fred");
        fred.leave();

        // static nested class 가 아닌 inner class 이므로 외부에서 생성 불가.
//        Network.Member inner = new Network.Member();    // Compile Error

        // 외부 클래스의 인스턴스로는 생성이 가능하다.
        Network.Member william = myFace.new Member("william");
    }
}
