package com.dtreesoft.grammer.optional;

import java.util.HashMap;
import java.util.Map;

public class UserManager {
    //------------------------------------------------------------------------------------------------------------------
    // singleton
    private UserManager() {
    }

    private static class Singleton {
        private static final UserManager instance = new UserManager();
    }

    public static UserManager getInstance() {
        return Singleton.instance;
    }

    //------------------------------------------------------------------------------------------------------------------
    private Map<Long, User> users = new HashMap<>();

    public User getUser(long userId) {
        return users.get(userId);
    }

    public void addUser(Long userId, User user) {
        users.put(userId, user);
    }
}
