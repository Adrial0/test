import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {
    LeapYear leapYear = new LeapYear();

    @Test
    void TestisYearDivisibleByFourButNotOneHundred() {
        assert leapYear.isLeapYear(120);
    }

    @Test
    void TestisYearDivisibleByFourHundred() {
        assert leapYear.isLeapYear(400);
    }

    @Test
    void TestisYearNotDivisibleByFour() {
        assert !leapYear.isLeapYear(1999);
    }

    @Test
    void TestIsYearDivisibleByOneHundredButNotFourHundred() {
        assert !leapYear.isLeapYear(1900);
    }

}