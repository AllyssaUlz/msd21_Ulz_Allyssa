/* Exercise04_Konfig
 * Calculates 2 numbers with each other + faculty method
 * Author:      Allyssa Ulz 11929029
 * Last Change: 18.05.2022
 */
package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        double result = number1 + number2;
        logger.debug("The parameters are: " + number1 + "plus " + number2);
        return result;
    }

    public double minus(double number1, double number2){
        double result = number1 - number2;
        logger.debug("The parameters are: " + number1 + "minus " + number2);
        return result;
    }


    public double multiply(double number1, double number2){
        double result = number1 * number2;
        logger.debug("The parameters are: " + number1 + "multiplied with " + number2);
        return result;
    }

    public double divide(double number1, double number2){
        double result = number1 / number2;
        logger.debug("The parameters are: " + number1 + "divided by " + number2);
        if (number2 == 0){
            logger.error(number2 + " is not allowed to be 0");
            throw new ArithmeticException();
        }
        return result;
    }


    public int fac(int num){
        logger.debug("Parameter is " + num + "!");
        if (num < 1) {
            return 0;
        }
        int value = 1;
        for (int i = 2; i <= num; i++) {
            value = value * i;
        }
        return value;
    }
}


