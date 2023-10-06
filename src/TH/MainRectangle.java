package TH;

import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài :");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều rộng :");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật \n" +rectangle.display());
        System.out.println("Chu vi hình chữ nhật :" + rectangle.getPerimeter());
        System.out.println("Diện tích hình chữ nhật :" + rectangle.getArea());
    }
}
