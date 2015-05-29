package homework3;

import java.util.Scanner;

/**
 Есть круг с центром в начале координат и радиусом 4. Пользователь
 вводит с клавиатуры координаты точки x и y. Написать программу которая
 определит лежит ли эта точка внутри круга или нет
 */
public class Circlespots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = 4;
        System.out.println("Input x: ");
        double x = sc.nextDouble();
        System.out.println("Input y: ");
        double y = sc.nextDouble();

        if ((x*x+y*y)<=(r*r)){
            System.out.println("Spot"+ x + ":"  + y + " is in the circle");
        } else
            System.out.println("Spot"+ x + ":" + y + " is not in the circle");
        sc.close();
    }
}
