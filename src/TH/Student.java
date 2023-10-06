package TH;

public class Student {
    int studentId;
    String studentName;
    boolean gender;
    String className;
    int age;
    String address;

    public Student(int studentId, String studentName, boolean gender, String className, int age, String address){
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.className = className;
        this.age = age;
        this.address = address;
    }


    public void display(){
        System.out.println("Id : " + studentId + "\n" +
                "Tên :" + studentName + "\n" +
                "Giới tính : " + (gender? "Nam" : "Nữ") + "\n" +
                "Lớp : " + className + "\n" +
                "Tuổi : " + age + "\n" +
                "Địa chỉ : " + address + "\n");
    }
}
