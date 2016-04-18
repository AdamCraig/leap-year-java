import org.junit.*;
import static org.junit.Assert.*;

public class LeapYearTest {

  @Test
    public void isLeapYear_forNumberDivisibleByFour_true() {
      LeapYear testLeapYear = new LeapYear();
      assertEquals(true, testLeapYear.isLeapYear(2012));
    }

  @Test
    public void isLeapYear_forNumbersNotDivisibleByFour_false() {
      LeapYear testLeapYear = new LeapYear();
      assertEquals(false, testLeapYear.isLeapYear(1999));
    }

  @Test
    public void isLeapYear_forMultiplesOfOneHundred_false() {
      LeapYear testLeapYear = new LeapYear();
      assertEquals(false, testLeapYear.isLeapYear(1900));
    }

  @Test
    public void isLeapYear_forMultiplesOfFourHundred_true() {
      LeapYear testLeapYear = new LeapYear();
      assertEquals(true, testLeapYear.isLeapYear(2000));
    }

}
