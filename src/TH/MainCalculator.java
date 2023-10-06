package TH;

import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Nhập giá trị a : ");
        double a = scanner.nextDouble();
        System.out.println("Nhập giá trị b : ");
        double b = scanner.nextDouble();
        calculator.setA(a);
        calculator.setB(b);
        System.out.println("Tổng của " + a + " và " + b + " là : " + calculator.add());
        System.out.println("Hiệu của " + a + " và " + b + " là : " + calculator.sub());
        System.out.println("Tích của " + a + " và " + b + " là : " + calculator.nulti());
        System.out.println("Thương của " + a + " và " + b + " là : " + calculator.div());
    }
}
