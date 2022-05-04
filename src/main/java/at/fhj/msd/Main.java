/* Exercise04_Konfig
 * Calculator output
 * Author:      Allyssa Ulz 11929029
 * Last Change: 04.05.2022
 */

package at.fhj.msd;

public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println(cal.add(1.7,2.9));
        System.out.println(cal.divide(4,2));
        System.out.println(cal.minus(5.6,1));
        System.out.println(cal.multiply(3.5, 2.9));
        System.out.println(cal.fac(0));
        System.out.println(cal.fac(-4));
        System.out.println(cal.fac(6));

    }
}
