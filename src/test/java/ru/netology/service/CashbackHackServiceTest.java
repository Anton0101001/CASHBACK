package ru.netology.service;

//import org.junit.jupiter.api.Test;
import org.testng.annotations.Test;

//import static org.junit.jupiter.api.Assertions.*;
  import static org.testng.Assert.*;

class CashbackHackServiceTest {

    @Test
    void Cashback1() {
        int amount = 700;
        int expected = 300;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    void Cashback2() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

}
