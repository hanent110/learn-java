package com.dtreesoft.grammer.list;

import java.util.List;

public class ListTest {
    List<ListObj> objs;

    public static void main(String[] args) {
        ListTest test = new ListTest();

        test.test();
    }

    public void test() {
        int index = 0;

        // objs 가 null 일 경우 NullPointerException 이 발생한다.
        for (ListObj obj : objs) {
            System.out.printf("index = " + index);
            index++;
        }
    }
}
