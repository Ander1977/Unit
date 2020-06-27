package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    @Test
    public void shouldAmount900() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1000() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmount1500() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 500;
        int actual = service.remain(1500);
        assertEquals(expected, actual);
    }
}