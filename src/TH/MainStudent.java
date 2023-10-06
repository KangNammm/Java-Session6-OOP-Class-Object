package TH;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Phò Thị Phạch", false, "JAV-001", 19, "Khâm Thiên");
        Student student2 = new Student(2,"Giàng A Phủ", true, "JAV-004", 21, "Long Biên");
        Student student3 = new Student(3,"Ra Xa Nhé", true, "JAV-003", 20, "Lào");
        // hiển thị
        System.out.println("------------ Thông tin học sinh 1 --------------");
        student1.display();
        System.out.println("------------ Thông tin học sinh 2 --------------");
        student2.display();
        System.out.println("------------ Thông tin học sinh 3 --------------");
        student3.display();
    }
}
