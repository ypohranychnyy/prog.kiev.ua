package homework3;

import java.util.Scanner;

/**
 * Написать программу которая считывает 4 числа и выводит на экран
 самое большое из них.
 */
public class Fourtop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Input #1: ");
        int a = sc.nextInt();
        System.out.println("Input #2: ");
        int b = sc.nextInt();
        System.out.println("Input #3: ");
        int c = sc.nextInt();
        System.out.println("Input #4: ");
        int d = sc.nextInt();

        if (a >= b) {
            b = a;
        } else a = b;

        if (b >= c) {
            c = b;
        } else b = c;

        if (c >= d) {
            d = c;
            System.out.println(c + " Is the largest number");
        } else System.out.println(d + " Is the largest number");
*/

        int num;
        int max = 0;

        Scanner cs = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Input number #: ");
            num = cs.nextInt();
            if (max <= num) {
                max = num;
            }
        }
        System.out.println();
        System.out.println(max + "Is the largest number");

        sc.close();
    }
}
