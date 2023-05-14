package ru.netology.service;

public class CashbackHackServiceJUnit4Test {
    @org.junit.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;

        int actual = service.remain(amount);


        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        org.junit.Assert.assertEquals(expected, actual);
    }
}
