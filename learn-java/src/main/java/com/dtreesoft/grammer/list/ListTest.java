package com.dtreesoft.grammer.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        ListTest test = new ListTest();

        test.nullListIteratorTest();
        test.IteratorRemoveTest();
        test.ForeachRemoveTest();
    }

    private void nullListIteratorTest() {
        try {
            List<ListObj> objs = null;

            int index = 0;

            // objs 가 null 일 경우 NullPointerException 이 발생한다.
            for (ListObj obj : objs) {
                System.out.printf("index = " + index);
                index++;
            }

        } catch (Exception e) {
            System.out.println("nullListIteratorTest Exception Occurred, " + e.getMessage());
        }
    }

    private void IteratorRemoveTest() {
        System.out.println("----------------------------------------------");
        System.out.println("--------------------------- IteratorRemoveTest");

        try {
            List<ListObj> objs = new ArrayList<ListObj>();
            objs.add(new ListObj(1, 1, "First"));
            objs.add(new ListObj(2, 2, "Second"));
            objs.add(new ListObj(3, 3, "Third"));
            objs.add(new ListObj(4, 4, "Fourth"));
            objs.add(new ListObj(5, 5, "Fifth"));

            for (Iterator<ListObj> it = objs.iterator(); it.hasNext(); ) {
                ListObj obj = it.next();

                System.out.println(obj);

                if (obj.getmString().equals("Third")) {
                    it.remove();

                    // Iterator 사용 시 여기서 break를 안 해주어도 문제 되지는 않는다.
                    // break;
                }
            }

            System.out.println("------------------------- after remove");

            for (Iterator<ListObj> it = objs.iterator(); it.hasNext(); ) {
                ListObj obj = it.next();

                System.out.println(obj);
            }

        } catch (Exception e) {
            System.out.println("IteratorRemoveTest() Exception occurred, " + e.getMessage());
        }
    }

    private void ForeachRemoveTest() {
        System.out.println("---------------------------------------------");
        System.out.println("--------------------------- ForeachRemoveTest");

        try {
            List<ListObj> objs = new ArrayList<ListObj>();
            objs.add(new ListObj(1, 1, "First"));
            objs.add(new ListObj(2, 2, "Second"));
            objs.add(new ListObj(3, 3, "Third"));
            objs.add(new ListObj(4, 4, "Fourth"));
            objs.add(new ListObj(5, 5, "Fifth"));

            for (ListObj obj : objs) {
                System.out.println("before" + obj);
                if (obj.getmString().equals("Third")) {
                    objs.remove(obj);

                    // for 사용 시 여기서 break를 안 해주면 문제 발생. ConcurrentModificationException 발생
                    // break;
                }

                System.out.println("after" + obj);
            }

            for (ListObj obj : objs) {
                System.out.println(obj);
            }

        } catch (Exception e) {
            System.out.println("ForeachRemoveTest() Exception occurred, " + e.getMessage() + e);
        }
    }
}
