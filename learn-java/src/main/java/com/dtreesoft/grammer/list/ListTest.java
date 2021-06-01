package com.dtreesoft.grammer.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        ListTest test = new ListTest();

        test.containsTest();
        test.nullListForIterateTest();
        test.iteratorRemoveTest();
        test.foreachRemoveTest();
        test.copyAndRemoveTest();
    }

    /**
     *  contains 의 equals 검사 테스트
     *  Boxing 형태와 raw 형태의 비교 테스트
     */
    private void containsTest() {
        List<Integer> objs = new ArrayList<>();
        objs.add(new Integer(1));
        objs.add(new Integer(10));
        objs.add(new Integer(1978));
        objs.add(new Integer(9));
        objs.add(new Integer(14));

        if (objs.contains(9)) {
            System.out.println("containsTest, has 9");
        } else {
            System.out.println("containsTest, not has 9");
        }
    }

    private void nullListForIterateTest() {
        /**
         *  List 가 Null 일 경우 for 문을 돌릴 경우 NullPointerException 이 발생한다.
         */
        try {
            List<ListObj> objs = null;

            int index = 0;

            // objs 가 null 일 경우 NullPointerException 이 발생한다.
            for (ListObj obj : objs) {
                System.out.printf("index = " + index + ", obj = " + obj.toString());
                index++;
            }

        } catch (Exception e) {
            System.out.println("nullListIteratorTest Exception Occurred, " + e.toString());
        }
    }

    private void iteratorRemoveTest() {
        /**
         *  List 를 이터레이터로 돌릴 경우 :
         *      1. 요소 하나를 삭제해도 iterator 가 무효 되지 않는다.
         *      2. it.remove() 는 마지막 it.next() 로 얻어온 요소를 삭제한다.
         *      3. objs.remove(...) 처럼 리스트에서 바로 지워주고 for 문을 바로 빠져나가지 않으면 ConcurrentModificationException 이 발생한다.
         *      3. 한번도 it.next() 를 호출하지 않은 상태에서 it.remove() 호출시 IllegalStateException 이 발생한다.
         *      4. 아직 멀티쓰레드 테스트는 안해본 상태.
         */
        try {
            List<ListObj> objs = prepareTestListData();

            for (Iterator<ListObj> it = objs.iterator(); it.hasNext(); ) {
//                it.remove();  // 한번도 it.next() 를 호출하지 않은 상태에서 it.remove() 호출시 IllegalStateException 이 발생.

                ListObj obj = it.next();

                System.out.println(obj);

                if (obj.getmString().equals("Third")) {
                    it.remove();
//                    objs.remove(obj); // 리스트에서 바로 지워주고 for 문을 바로 빠져나가지 않으면 ConcurrentModificationException 이 발생한다.
//                    break;            // Iterator 사용 시 여기서 break 를 안 해주어도 문제 되지는 않는다.
                }
            }

        } catch (Exception e) {
            System.out.println("IteratorRemoveTest() Exception occurred, " + e.toString());
        }
    }

    private void foreachRemoveTest() {
        System.out.println("---------------------------------------------");
        System.out.println("--------------------------- ForeachRemoveTest");

        try {
            List<ListObj> objs = prepareTestListData();

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

    private void copyAndRemoveTest() {
        /**
         *  리스트 A 를 리스트 B 에 복사
         *  리스트 B 를 돌면서 리스트 A 에서 삭제해도 아무런 예외가 발생하지 않는다.
         */
        try {
            List<ListObj> objs = prepareTestListData();
            List<ListObj> copyObjs = new ArrayList<>(objs);

            for (ListObj obj : copyObjs) {
                System.out.println("before" + obj);

                if (obj.getmString().equals("Third")) {
                    objs.remove(obj);
                }

                System.out.println("after" + obj);
            }

            copyObjs.clear();

            for (ListObj obj : objs) {
                System.out.println(obj);
            }

        } catch (Exception e) {
            System.out.println("ForeachRemoveTest() Exception occurred, " + e.getMessage() + e);
        }
    }

    private List<ListObj> prepareTestListData() {
        List<ListObj> objs = new ArrayList<>();

        objs.add(new ListObj(1, 1, "First"));
        objs.add(new ListObj(2, 2, "Second"));
        objs.add(new ListObj(3, 3, "Third"));
        objs.add(new ListObj(4, 4, "Fourth"));
        objs.add(new ListObj(5, 5, "Fifth"));

        return objs;
    }
}
