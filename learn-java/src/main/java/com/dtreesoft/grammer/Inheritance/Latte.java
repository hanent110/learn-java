package com.dtreesoft.grammer.Inheritance;

public class Latte extends Coffee {
    public String name = "Latte";

    public Latte(int price) {
//        System.out.println("latte create");   // 생성자에서 super 는 제일 처음으로 호출되어야 한다.
        super(price);

        System.out.println("latte create");
    }

    @Override
    public void doTaste() {
        super.doTaste();
        System.out.println("Latte doTaste()");
    }
}
