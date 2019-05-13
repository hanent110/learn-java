package com.dtreesoft.refactoring.NullObject;

import static org.junit.Assert.*;

public class LabelTest {

    @org.junit.Test
    public void display() {
        Label label = Label.newNull();
        label.display();
    }
}