import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

  FizzBuzz fizzBuzz = new FizzBuzz(3, 7);

  @Test
  public void getFizzBuzzGameResults() {
    int[] nums = {11, 3} ;
    Assert.assertEquals("11\nFizz\n", fizzBuzz.getFizzBuzzGameResults(nums));
  }

  @Test
  public void covertFizzBuzzNum() {
    Assert.assertEquals("11", fizzBuzz.covertFizzBuzzNum(11));
    Assert.assertEquals("Fizz", fizzBuzz.covertFizzBuzzNum(3));
    Assert.assertEquals("Buzz", fizzBuzz.covertFizzBuzzNum(7));
    Assert.assertEquals("FizzBuzz", fizzBuzz.covertFizzBuzzNum(21));
    Assert.assertEquals("FizzBuzz", fizzBuzz.covertFizzBuzzNum(73));
  }
}