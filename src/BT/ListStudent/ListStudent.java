package BT.ListStudent;

import java.util.Scanner;

public class ListStudent {
    private int studentId;
    private String studentName;
    private int age;
    private boolean gender;
    private String address;
    private String phone;
    private static int count = 1;

    public ListStudent(){
        this.studentId = ListStudent.count++;
    }
    public void inputData(Scanner scanner){
        System.out.println("Hãy nhập thông tin sinh viên");

        System.out.println("Nhập tên sinh viên :");
        this.studentName = scanner.nextLine();

        System.out.println("Nhập tuổi sinh viên :");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập giới tính sinh viên :");
        this.gender = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Nhập địa chỉ sinh viên :");
        this.address = scanner.nextLine();

        System.out.println("Nhập số điện thoại sinh viên :");
        this.phone = scanner.nextLine();
    }
    public void displayStudent(){
        System.out.println(
                "Id : " + studentId + "\n" +
                "Tên :" + studentName + "\n" +
                "Tuổi : " + age + "\n" +
                "Giới tính : " + gender + "\n" +
                "Địa chỉ : " + address + "\n" +
                "Số điện thoại :" + phone + "\n"
        );
    }
    public int getStudentId(){
        return studentId;
    }
}
