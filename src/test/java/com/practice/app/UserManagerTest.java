package com.practice.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserManagerTest {
    private static final int SIZE_ONE=1;
    @Test
    public void testAddUser() {
        UserManager userManager = new UserManager();

        User user = new User("manager", "user1", "1234", "use12@gmail.com", "city and country");
        userManager.addUser(user);

        assertEquals(userManager.getUsers().size(), SIZE_ONE);
    }
}
