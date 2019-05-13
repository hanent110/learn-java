package com.dtreesoft.grammer.NestedClass;

import java.util.ArrayList;

public class Invoice {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Static Nested Class
    //  public 선언시에는 외부에서 클래스를 생성할 수 있다.
    public static class Item {
        String description;
        int quantity;
        double unitPrice;

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        public double price() {
            return quantity * unitPrice;
        }

        public void showItems() {

            // static Nested Class 의 경우 외부 클래스에 접근할 수 없다.
//            for (Item item : items) {
//                ...
//            }
        }
    }
}
