package com.dtreesoft.refactoring.NullObject;

import org.junit.Test;

public class LabelTest {

    @Test
    public void display() {
        Label label = Label.newNull();
        label.display();
    }
}