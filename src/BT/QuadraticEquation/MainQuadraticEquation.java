package BT.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        System.out.println("Nhập a :");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập b :");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập c :");
        double c = Double.parseDouble(scanner.nextLine());
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println(quadraticEquation.toString());
        System.out.println(quadraticEquation.delta());
        System.out.println(quadraticEquation.solve());
    }
}
