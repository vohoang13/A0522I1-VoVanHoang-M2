package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.service;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.controller.StudentController;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model.Student;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.responsitory.IStudentReponsitory;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.responsitory.StudentReponsitory;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudent{
    private static Scanner scanner = new Scanner(System.in);
    private static IStudentReponsitory iStudentReponsitory = new StudentReponsitory();
    @Override
    public void addStudent() {
        Student student = this.inForStudent();
        iStudentReponsitory.addStudent(student);
    }

    @Override
    public void display() {
        List<Student> studentList = iStudentReponsitory.getAll();
        for(Student student: studentList){
            System.out.println(student);
        }
    }

    @Override
    public void remove() {
        int index=0;
        System.out.println("Nhập vào code sinh viên:");
        String code = scanner.nextLine();
        List<Student> studentList = iStudentReponsitory.getAll();
        for( int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getCode().equals(code)){
                index = i;
            }else {
                return;
            }
        }
        System.out.println("Yes or No ?");
        String yesNo = scanner.nextLine();
        if(yesNo.equals("Yes")) {
            iStudentReponsitory.removeStudent(index);
        }else {
            return;
        }
    }

    public Student inForStudent(){
        System.out.println("Nhập vào mã sinh viên:");
        String code = scanner.nextLine();
        System.out.println("Nhập vào họ tên sinh viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh:");
        String dayOfBirth = scanner.nextLine();
        System.out.println("Nhập vào giới tính:");
        String gender = scanner.nextLine();
        System.out.println("Nhập vào lớp học:");
        String nameClass = scanner.nextLine();
        System.out.println("Nhập vào điểm số:");
        Double score = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code,name,dayOfBirth,gender,nameClass,score);
        return student;
    }
}


// xóa theo id ( indexOf, equal)
// xếp implement Comparator