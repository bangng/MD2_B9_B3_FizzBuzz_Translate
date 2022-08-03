import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    @Test
    public void translate(){
        int number = 0;
        String expected = "Out of coverage";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected,result);
    }
    @Test
    public void translate100() {
        int number = 100;
        String expected = "Out of coverage";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate15() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate13() {
        int number = 13;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate25() {
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

    @Test
    public void translate14() {
        int number = 14;
        String expected = "Fourteen";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }
    @Test
    public void translate6() {
        int number = 6;
        String expected = "Six";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }
    @Test
    public void translate11() {
        int number = 11;
        String expected = "Eleven";
        String result = FizzBuzzTranslate.translate(number);

        assertEquals(expected, result);
    }

}