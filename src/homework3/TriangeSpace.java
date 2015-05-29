package homework3;

import java.util.Scanner;

/**
 Дан треугольник координаты вершин А(0,0), В(4,4), С(6,1). Пользователь
 вводит с клавиатуры координаты точки x и y. Написать программу которая
 определит лежит ли эта точка внутри треугольника или нет.
 */
public class TriangeSpace {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double p = 0;
        System.out.println("Input x: ");
        double x = sc.nextDouble();
        System.out.println("Input y: ");
        double y = sc.nextDouble();



        if (x==y){
            System.out.println("Spot"+ x + ":"  + y + " is in the circle");
        } else
            System.out.println("Spot"+ x + ":" + y + " is not in the circle");
        sc.close();
    }
}
