package ru.netology.service;

public class CashbackHackServiceTest {

    private CashbackHackService service;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        service = new CashbackHackService();
    }

    @org.junit.jupiter.api.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int expected = 500;

        int actual = service.remain(amount);


        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainEqualToBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void testRemainGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        org.junit.jupiter.api.Assertions.assertEquals(expected, actual);
    }
}