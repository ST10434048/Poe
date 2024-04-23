package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {
    @Test
    void returnLoginStatusTrue() {
        Users.counter = 1;
        Users.usersArr[0] = new Users("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");

        boolean value = Login.returnLoginStatus("kyl_1", "Ch&&sec@ke99!");
        assertTrue(value, "Login Status should be true");
    }

    @Test
    void returnLoginStatusFalse() {
        Users.counter = 1;
        Users.usersArr[0] = new Users("kyl_1", "Ch&&sec@ke99!", "Kyle", "Smith");

        boolean value = Login.returnLoginStatus("kyl12", "Password");
        assertFalse(value, "Login Status should be false");
    }

}
