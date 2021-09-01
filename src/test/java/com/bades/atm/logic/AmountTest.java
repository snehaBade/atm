package com.bades.atm.logic;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


class AmountTest extends TestCase {
    private Amount amt;
    @Before
    private void AmountTest()
    {
        amt = new Amount(1500, 10, 30, 30, 20);
    }

    @Test
    void getFiftyNotes() {
        assertEquals(10, amt.getFiftyNotes());
    }

    @Test
    void getFiveNotes() {
        assertEquals(20, amt.getFiveNotes());
    }

    @Test
    void getTenNotes() {
        assertEquals(30, amt.getTenNotes());
    }


    @Test
    void getTotalAmount() {
        assertEquals(10, amt.getFiftyNotes());
    }

    @Test
    void getTwentyNotes() {
        assertEquals(10, amt.getTwentyNotes());
    }

    @Test
    void setFiftyNotes() {
        amt.setFiftyNotes(50);
        assertEquals(50, amt.getFiftyNotes());
    }

    @Test
    void setFiveNotes() {
        amt.setFiveNotes(5);
        assertEquals(5, amt.getFiveNotes());
    }

    @Test
    void setTenNotes() {
        amt.setTenNotes(10);
        assertEquals(10, amt.getTenNotes());
    }

    @Test
    void setTotalAmount() {
        amt.setTotalAmount(5);
        assertEquals(5, amt.getTotalAmount());
    }

    @Test
    void setTwentyNotes() {
        amt.setTwentyNotes(5);
        assertEquals(5, amt.getTwentyNotes());
    }
}