/* Exercise04_Konfig
 * Testcases for Class Calculator
 * Author:      Allyssa Ulz 11929029
 * Last Change: 18.05.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    /**
     * creates the object of the class calculator
     */
    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    double result;

    /**
     * Tests if the method add in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcAdd1(){
        Assertions.assertEquals(5, result = 3 + 2);
    }

    /**
     * Tests if the method add in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcAdd2(){
        Assertions.assertEquals(3+2, calc.add(3,2));
    }

    /**
     * Tests if the method minus in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcMinus1(){
        Assertions.assertEquals(6, result = 8 - 2);
    }

    /**
     * Tests if the method minus in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcMinus2(){
        Assertions.assertEquals(8-2, calc.minus(8,2));
    }
    /**
     * Tests if the method multiply in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcMulti1(){
        Assertions.assertEquals(20, result = 5 * 4);
    }

    /**
     * Tests if the method multiply in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcMulti2(){
        Assertions.assertEquals(5 * 4, calc.multiply(5,4));
    }
    /**
     * Tests if the method divide in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcDiv1(){
        Assertions.assertEquals(4, result = 12 / 3);
    }

    /**
     * Tests if the method divide in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void calcDiv2() {
        Assertions.assertEquals(12 / 3, calc.divide(12, 3));
    }

    /**
     * Tests if the method divide in the class calculator works correctly when the secound input is 0
     *
     * @throws  ArithmeticException when secound input is 0
     */
    @Test
    void exceptionTest() {
        Assertions.assertThrows(ArithmeticException.class,() -> calc.divide(2,0));
    }

    /**
     * Tests if the method faculty in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     *
     * if the number is negativ or zero then the expected output is 0
     */
    @Test
    public void faculty1(){
        Assertions.assertEquals(0, calc.fac(-5));
    }

    /**
     * Tests if the method add in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void faculty2(){
        Assertions.assertEquals(720, calc.fac(6));
    }

    /**
     * Tests if the method add in class calculator works correctly by giving the pointer an
     * expected output and an actual output
     */
    @Test
    public void faculty3(){
        Assertions.assertEquals(40320, calc.fac(8));
    }



}


