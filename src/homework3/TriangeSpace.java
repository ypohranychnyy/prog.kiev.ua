package homework3;

import java.util.Scanner;

/**
 ��� ����������� ���������� ������ �(0,0), �(4,4), �(6,1). ������������
 ������ � ���������� ���������� ����� x � y. �������� ��������� �������
 ��������� ����� �� ��� ����� ������ ������������ ��� ���.
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
