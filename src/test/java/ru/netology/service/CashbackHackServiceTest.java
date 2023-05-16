package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();
    @Test
    public void testPurchaseIs0() {
        int expected = service.remain(0);
        int actual = 1_000;
        assertEquals(actual, expected);
    }
    @Test
    public void testPurchaseLessThan1000() {
        int expected = service.remain(1);
        int actual = 999;
        assertEquals(actual, expected);
    }
    @Test
    public void testPurchaseIs1000() {
        int expected = service.remain(1000);
        int actual = 0;
        assertEquals(actual, expected);
    }
    @Test
    public void testPurchaseOver1000() {
        int expected = service.remain(1001);
        int actual = 999;
        assertEquals(actual, expected);
    }
}