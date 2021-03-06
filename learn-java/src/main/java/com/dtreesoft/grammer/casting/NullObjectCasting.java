package com.dtreesoft.grammer.casting;

import java.util.HashMap;
import java.util.Map;

public class NullObjectCasting {
    Map<String, Item> items = new HashMap<>();

    public static void main(String[] args) {
        NullObjectCasting test = new NullObjectCasting();
        test.runTest();
        test.castingNullInteger();
    }

    private void castingNullInteger() {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("ItemA", 100);

        Integer itemA = (Integer) objectMap.get("ItemA");
        System.out.println("itemA = " + itemA);

        /**
         *  Null Object 캐스팅은 Exception 을 던지지 않는다.
         *  그냥 Null object 로 대입될 뿐이다.
         */
        Integer itemB = (Integer) objectMap.get("ItemB");
        System.out.println("itemB = " + itemB);

        /**
         *  primitive type 으로 캐스팅 시에는 null object 일 경우 Null Exception 발생.
         */
        try {
            Integer itemC = (int) objectMap.get("ItemC");
            System.out.println("itemC = " + itemC);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }

    private void runTest() {
        items.put("default", new BigItem());

        // "AA" Key 값은 없으므로 null 이 넘어온다.
        // 하지만 null 을 BigItem 형으로 캐스팅 할때는 NullPointerException 이 발생하지 않는다.
        BigItem bigItem = (BigItem) items.get("AA");

        // null 오브젝트에 접근하려고 하는 이 때 NullPointerException 이 발생한다.
        try {
            System.out.println(bigItem.getLongValue());

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());    // output: null
            System.out.println(e);                 // output: java.lang.NullPointerException
        }
    }

    class Item {
        private int intVal;

        public int getIntVal() {
            return intVal;
        }

        public void setIntVal(int intVal) {
            this.intVal = intVal;
        }
    }

    class BigItem  extends Item {
        private long longValue;

        public long getLongValue() {
            return longValue;
        }

        public void setLongValue(long longValue) {
            this.longValue = longValue;
        }
    }
}
