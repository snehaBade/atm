package com.bades.atm.logic;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ATMTest extends TestCase {
    private ATM atm;
    @Before
    private void AtmTest() {
        atm = ATM.getInstance();
    }

    @Test
    public void testGetUsers() {
        assertEquals(2, atm.getUsers().size());
    }

    @Test
    public void testGetAmountInATM() {
        assertEquals(1500, atm.getAmountInATM().getTotalAmount());
    }

    @Test
    public void testValidateAccount() {
        assertTrue(atm.validateAccount("123456789", "1234"));
    }
    @Test
    public void testCanWithdrawMoney() {
        assertEquals(1, atm.canWithdrawMoney("123456789", 5));
    }
    @Test
    public void testGetBalance() {
        assertEquals(800, atm.getBalance("123456789"));
    }
    @Test
    public void testGetMaximumWithdrawAmount() {
        assertEquals(1000, atm.getMaximumWithdrawAmount("123456789"));
    }

}