package com.dtreesoft.grammer.optional;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        OptionalTest optionalTest = new OptionalTest();
        optionalTest.mainTest();
    }

    private void mainTest() {
        UserManager.getInstance().addUser(1L, new User(1L, "aaa"));
        UserManager.getInstance().addUser(2L, new User(2L, "bbb"));
        UserManager.getInstance().addUser(3L, new User(3L, "ccc"));

        long existUserId = 1;
        long notExistUserId = 10L;

        callOfExceptionOccured(notExistUserId);
        callOfNullableExceptionNotOccured(notExistUserId);
        getNullObject(notExistUserId);
    }

    private void callOfExceptionOccured(Long userId) {
        try {
            // Optional.of 인자로 null 값이 들어가게 되면 NullPointerException 발생.
            Optional<User> user = Optional.of(UserManager.getInstance().getUser(userId));
        } catch (Exception e) {
            System.out.println("e = " + e); // "java.lang.NullPointerException"
            System.out.println("exceptionOccured, e.getMessage = " + e.getMessage()); // "null"
            System.out.println("exceptionOccured, e.getLocalizedMessage = " + e.getLocalizedMessage()); // "null"
        }
    }

    private void callOfNullableExceptionNotOccured(Long userId) {
        try {
            Optional<User> user = Optional.ofNullable(UserManager.getInstance().getUser(userId));
            System.out.println("user name : " + user.map(User::getName)); // "Optional.empty"
        } catch (Exception e) {
            // Exception 이 발생하지 않음.
            System.out.println("exceptionNotOccured, e = " + e);
        }
    }

    private void getNullObject(Long userId) {
        try {
            Optional<User> user = Optional.ofNullable(UserManager.getInstance().getUser(userId));
            System.out.println("user name : " + user.get().getName());  // user.get() 에서 Exception 발생.
        } catch (Exception e) {
            System.out.println("e = " + e); // "java.util.NoSuchElementException: No value present"
            System.out.println("exceptionOccured, e.getMessage = " + e.getMessage()); // "No value present"
            System.out.println("exceptionOccured, e.getLocalizedMessage = " + e.getLocalizedMessage()); // "No value present"
        }
    }
}
