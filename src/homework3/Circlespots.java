package homework3;

import java.util.Scanner;

/**
 ���� ���� � ������� � ������ ��������� � �������� 4. ������������
 ������ � ���������� ���������� ����� x � y. �������� ��������� �������
 ��������� ����� �� ��� ����� ������ ����� ��� ���
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
