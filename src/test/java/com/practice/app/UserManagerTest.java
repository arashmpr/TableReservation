package com.practice.app;

import com.practice.app.Exceptions.UserExceptions.AddUserDuplicateEmailError;
import com.practice.app.Exceptions.UserExceptions.AddUserDuplicateUsernameError;
import com.practice.app.Exceptions.UserExceptions.AddUserEmailFormatIsWrongError;
import com.practice.app.Exceptions.UserExceptions.AddUserRoleIsInvalidError;
import com.practice.app.Managers.UserManager;
import com.practice.app.Models.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserManagerTest {
    private static final int SIZE_ONE=1;
    @Test
    public void testAddUserSuccess() throws Exception {
        UserManager userManager = new UserManager();

        User user = new User("manager", "user1", "1234", "use12@gmail.com", "city and country");
        userManager.addUser(user);

        assertEquals(userManager.getUsers().size(), SIZE_ONE);
    }
    @Test(expected = AddUserDuplicateUsernameError.class)
    public void testAddUserDuplicateUsernameError() throws Exception {
        UserManager userManager = new UserManager();

        User user = new User("manager", "user1", "1234", "use12@gmail.com", "city and country");
        User userWithDupUsername = new User("client", "user1", "123", "u12@yahoo.com", "city and country");

        userManager.addUser(user);
        userManager.addUser(userWithDupUsername);
    }
    @Test(expected = AddUserDuplicateEmailError.class)
    public void testAddUserDuplicateEmailError() throws Exception {
        UserManager userManager = new UserManager();

        User user = new User("manager", "user1", "1234", "use12@gmail.com", "city and country");
        User userWithDupEmail = new User("client", "user2", "123", "use12@gmail.com", "city and country");

        userManager.addUser(user);
        userManager.addUser(userWithDupEmail);
    }
    @Test(expected = AddUserRoleIsInvalidError.class)
    public void testAddUserRoleIsInvalid() throws Exception {
        UserManager userManager = new UserManager();

        User user = new User("asd", "user1", "1234", "use12@gmail.com", "city and country");
        userManager.addUser(user);
    }
    @Test(expected = AddUserEmailFormatIsWrongError.class)
    public void testAddUserEmailFormatIsWrongError() throws Exception {
        UserManager userManager = new UserManager();

        User user = new User("manager", "user1", "1234", "use12gmail.om", "city and country");
        userManager.addUser(user);
    }
}
