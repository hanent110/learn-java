package com.dtreesoft.grammer.annotation;

import javax.validation.constraints.NotNull;

public class AnnotationTest {
    public static void main(String[] args) {
        AnnotationTest annotationTest = new AnnotationTest();
        annotationTest.mainTest();
    }

    private void mainTest() {
        String name = null;
        callNotNullMethod(name);
    }

    private void callNotNullMethod(@NotNull String name) {
        System.out.println("name : " + name);
    }

}
