/* Exercise04_Konfig
 * Calculates 2 numbers with each other + faculty method
 * Author:      Allyssa Ulz 11929029
 * Last Change: 04.05.2022
 */
package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        double result = number1 + number2;
        return result;
    }

    public double minus(double number1, double number2){
        double result = number1 - number2;
        return result;
    }


    public double multiply(double number1, double number2){
        double result = number1 * number2;
        return result;
    }

    public double divide(double number1, double number2){
        double result = number1 / number2;
        return result;
    }


    public int fac(int num){
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


