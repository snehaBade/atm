package com.bades.atm.logic;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class UserTest extends TestCase {
    private User user;
    @Before
    private void UserTest() {
        user = new User(1, "123456789", "1234", 800, 200);
    }

    @Test
    public void getID() {
        assertEquals(1, user.getID());
    }

    @Test
    public void getAccNo() {
        assertEquals("123456789", user.getAccNo());
    }

    @Test
    public void getBalance() {
        assertEquals(800, user.getBalance());
    }

    @Test
    public void setID() {
        user.setID(2);
        assertEquals(2, user.getID());
    }

    @Test
    public void setAccNo() {
        user.setAccNo("987654321");
        assertEquals("987654321", user.getAccNo());
    }

    @Test
    public void setBalance() {
        user.setBalance(1500);
        assertEquals(1500, user.getBalance());
    }


}