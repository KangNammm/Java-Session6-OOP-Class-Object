package BT.ListStudent;

import java.util.Scanner;

public class MainListStudent {
    static ListStudent[] students = new ListStudent[100];
    static int currentIndex = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println(" ----- MENU -----");
            System.out.println(" 1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println(" 3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xoá học sinh");
            System.out.println("  5. Thoát");
            System.out.println(" Nhập lựa chọn của bạn :");

            int choice = Integer.parseInt(scanner.nextLine());
            handleSelect(choice);
        }
    }
    public static void handleSelect(int choice){
        switch (choice) {
            case 1:
                    displayAllStudent();
                break;
            case 2:
                    addNewStudent();
                break;
            case 3:
                    editStudent();
                break;
            case 4:
                    deleteStudent();
                break;
            case 5:
                System.out.println("Đã thoát chương trình.");
                System.exit(1);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
    }

    private static void editStudent() {
        System.out.println("Hãy nhập Id sinh viên cần sửa : ");
        int editedId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == editedId){
                System.out.println("Thông tin của sinh viên mà bạn muốn sửa : ");
                students[i].displayStudent();
                students[i].inputData(scanner);
                System.out.println("Cập nhật thông tin sinh viên thành công !");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với Id vừa nhập ");
    }

    private static void deleteStudent() {
        System.out.println("Hãy nhập Id của sinh viên cần xóa : ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < currentIndex; i++) {
            if (students[i].getStudentId() == deleteId){
                for (int j = i; j < currentIndex; j++) {
                    students[j] = students[j+1];
                }
                currentIndex--;
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với Id vừa nhập");
    }

    private static void displayAllStudent() {
        System.out.println("Danh sách tất cả sinh viên : ");
        for (int i = 0; i < currentIndex; i++) {
            students[i].displayStudent();
        }
        System.out.println("-------------------");
    }

    private static void  addNewStudent() {
        ListStudent student = new ListStudent();
        student.inputData(scanner);

        students[currentIndex++] = student;

    }}
