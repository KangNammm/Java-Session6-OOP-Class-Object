package BT.Circle;

import BT.Circle.Circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        System.out.println("Nhập r :");
        double r = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu :");
        String color = scanner.nextLine();
        circle.setR(r);
        circle.setColor(color);
        System.out.println("Hình tròn \n" + circle.toString());
        System.out.println("Chu vi hình tròn :" + circle.area());
        System.out.println("Diện tích hình tròn :" + circle.parameter());
    }
}
