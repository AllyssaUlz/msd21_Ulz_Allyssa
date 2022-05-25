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

    /**
     * prints the result of two numbers added to eachother
     *
     * @param number1   is the first number that gets added
     * @param number2   is the secound number
     *
     * @return the result of the equation
     * */
    public double add(double number1, double number2){
        double result = number1 + number2;
        logger.debug("The parameters are: " + number1 + "plus " + number2);
        return result;
    }

    /**
     * prints the result of two numbers substracted with eachother
     *
     * @param number1   is the first number
     * @param number2   is the secound number
     *
     * @return the result of the equation
     * */
    public double minus(double number1, double number2){
        double result = number1 - number2;
        logger.debug("The parameters are: " + number1 + "minus " + number2);
        return result;
    }

    /**
     * prints the result of two numbers multiplied with eachother
     *
     * @param number1   is the first number
     * @param number2   is the secound number
     *
     * @return the result of the equation
     * */
    public double multiply(double number1, double number2){
        double result = number1 * number2;
        logger.debug("The parameters are: " + number1 + "multiplied with " + number2);
        return result;
    }

    /**
     * prints the result of two numbers divided with eachother
     *
     * @param number1 is the first number
     * @param number2 is the secound number and is not allowed to be 0
     *
     * @return the result of the equation
     * */
    public double divide(double number1, double number2){
        double result = number1 / number2;
        logger.debug("The parameters are: " + number1 + "divided by " + number2);
        if (number2 == 0){
            logger.error(number2 + " is not allowed to be 0");
            throw new ArithmeticException();
        }
        return result;
    }

    /**
     * prints the faculty of the number
     *
     * @param num   is the number that is used for the faculty
     *              if the num is smaller than one then it returns 0
     *              else it returns the faculty
     *
     * @return the faculty of the number or 0
     * */
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


