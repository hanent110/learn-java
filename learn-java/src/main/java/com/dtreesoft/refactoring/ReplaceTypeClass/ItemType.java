package com.dtreesoft.refactoring.ReplaceTypeClass;

public class ItemType {
    public static final ItemType BOOK = new ItemType(0);
    public static final ItemType DVD = new ItemType(1);
    public static final ItemType SOFTWARE = new ItemType(2);

    private final int _typecode;

    // private으로 선언하여 외부에서 잘못된 typecode 로 생성하지 못하게 함.
    // 필요한 타입은 ItemType 클래스 내부에서 미리 생성하여 사용.
    private ItemType(int typecode) {
        _typecode = typecode;
    }

    public int getTypecode() {
        return _typecode;
    }
}
