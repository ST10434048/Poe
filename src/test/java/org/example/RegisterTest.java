package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void checkPasswordComplexityTrue() {
        boolean value=Register.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(true, value);
        System.out.println(value);
        assertTrue(value);
        System.out.println("Password successfully captured.");
    }
    @Test
    void checkPasswordComplexityFalse() {
        boolean value=Register.checkPasswordComplexity("password");
        assertEquals(false, value);
        System.out.println(value);
        assertFalse(value);
        System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
    }

    @Test
    void checkUserNameTrue() {
        boolean value = Register.checkUserName("kyl_1");
        assertEquals(true,value);
        System.out.println(value);
        assertTrue(value);
        System.out.println("Username successfully captured");

    }
    @Test
    void checkUserNameFalse() {
        boolean value = Register.checkUserName("kyle!!!!!");
        assertEquals(false,value);
        System.out.println(value);
        assertFalse(value);
        System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");

    }

}