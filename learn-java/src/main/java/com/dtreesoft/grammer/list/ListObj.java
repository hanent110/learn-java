package com.dtreesoft.grammer.list;

public class ListObj {
    private int mInt;
    private long mLong;
    private String mString;

    public int getmInt() {
        return mInt;
    }

    public void setmInt(int mInt) {
        this.mInt = mInt;
    }

    public long getmLong() {
        return mLong;
    }

    public void setmLong(long mLong) {
        this.mLong = mLong;
    }

    public String getmString() {
        return mString;
    }

    public void setmString(String mString) {
        this.mString = mString;
    }

    public ListObj(int mInt, long mLong, String mString) {
        this.mInt = mInt;
        this.mLong = mLong;
        this.mString = mString;
    }

    @Override
    public String toString() {
        return "{" +
                "\"mInt\":" + mInt +
                ", \"mLong\":" + mLong +
                ", \"mString\":\"" + mString + '\"' +
                '}';
    }
}
