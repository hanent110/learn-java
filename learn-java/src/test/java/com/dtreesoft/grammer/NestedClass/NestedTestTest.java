package com.dtreesoft.grammer.NestedClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class NestedTestTest {
    @Test
    public void classTest() {
        NestedTest test = new NestedTest();
        test.innerClass();
        test.staticNestedClass();
    }
}