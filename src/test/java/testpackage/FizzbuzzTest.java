package testpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FizzbuzzTest {

    Fizzbuzz fizzBuzz = new Fizzbuzz();

    @Test
    void 三の倍数のテスト() {
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
        assertEquals("Fizz", fizzBuzz.fizzBuzz(27));
    }

    @Test
    void 五の倍数のテスト() {
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(20));
        assertEquals("Buzz", fizzBuzz.fizzBuzz(35));
    }

    @Test
    void 十五の倍数のテスト() {
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(75));
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(90));
    }

    @Test
    void 数字() {
        assertEquals("2", fizzBuzz.fizzBuzz(2));
        assertEquals("7", fizzBuzz.fizzBuzz(7));
        assertEquals("13", fizzBuzz.fizzBuzz(13));
    }
}