package com.dtreesoft.grammer.Inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        memberVariableHidingTest();

        methodOverridingTest();

        System.out.println();
    }

    private static void methodOverridingTest() {
        System.out.println("-----------------------------------");
        System.out.println("----------- latte test ------------");

        /**
         *  메서드는 Hiding 이 아니라 override 되어 어느 상황에서도 override 된 메서드 존재시 자식 메서드를 호출한다.
         */
        Coffee coffee = new Latte(200);
        System.out.println("---- coffee = " + coffee.name);
        coffee.taste();

        Latte latte = (Latte) coffee;
        System.out.println("---- latte = " + latte.name);
        latte.taste();  // Latte 클래스의 taste() 메서드에서 super.taste() 도 호출하고 있다.
    }

    private static void memberVariableHidingTest() {
        System.out.println("-----------------------------------");
        System.out.println("----------- coffee test -----------");

        /**
         *  Americano 로 인스턴스를 생성후 부모 클래스 형의 변수로 접근시 부모와 자식 클래스에 동일한 이름의 변수가 있으면 :
         *      1. 멤버변수로 직접 접근시 해당 변수의 이름이 출력된다.
         *      2. override 되지 않은 멤버 함수 호출시 그 멤버 함수가 선언된 부모 클래스의 멤버변수에 접근된다.
         *
         *      결과. 즉 멤버변수는 오버라이드 되는 것이 아니라 Hiding 되는 것이고 상황에 맞게 LookUp 해서 접근한다.
         *          이 때 멤버변수는 private 이건 public 이건 관계없이 적용된다.
         */
        Coffee coffee = new Americano(100);
        System.out.println("---- coffee name = " + coffee.name);            // americano 가 아니라 coffee 가 출력된다.
        System.out.println("---- coffee price = " + coffee.getPrice());     // 0 이 출력된다.
        coffee.taste(); // 자식 클래스에서 override 되었으므로 당연히 americano 의 taste() 가 호출된다.

        Americano americano = (Americano) coffee;
        System.out.println("---- americano name = " + americano.name);          // americano 가 출력된다.
        System.out.println("---- americano price = " + coffee.getPrice());      // 100 이 아니라 0 이 출력된다.
        americano.taste();  // 당연히 americano 의 taste() 가 호출된다.
    }
}
