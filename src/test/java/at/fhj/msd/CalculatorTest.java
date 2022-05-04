/* Exercise04_Konfig
 * Testcases for Class Calculator
 * Author:      Allyssa Ulz 11929029
 * Last Change: 04.05.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setup(){
        calc = new Calculator();
    }

    double result;

    @Test
    public void calcAdd1(){
        Assertions.assertEquals(5, result = 3 + 2);
    }

    @Test
    public void calcAdd2(){
        Assertions.assertEquals(5, calc.add(3,2));
    }


    @Test
    public void calcMinus1(){
        Assertions.assertEquals(6, result = 8 - 2);
    }


    @Test
    public void calcMinus2(){
        Assertions.assertEquals(6, calc.minus(8,2));
    }

    @Test
    public void calcMulti1(){
        Assertions.assertEquals(20, result = 5 * 4);
    }


    @Test
    public void calcMulti2(){
        Assertions.assertEquals(20, calc.multiply(5,4));
    }

    @Test
    public void calcDiv1(){
        Assertions.assertEquals(4, result = 12 / 3);
    }


    @Test
    public void calcDiv2(){
        Assertions.assertEquals(4, calc.divide(12,3));
    }


    @Test
    public void faculty1(){
        Assertions.assertEquals(0, calc.fac(-5));
    }


    @Test
    public void faculty2(){
        Assertions.assertEquals(720, calc.fac(6));
    }

    @Test
    public void faculty3(){
        Assertions.assertEquals(40320, calc.fac(8));
    }



}


