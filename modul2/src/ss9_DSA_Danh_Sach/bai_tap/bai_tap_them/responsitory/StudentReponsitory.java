package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.responsitory;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.controller.StudentController;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentReponsitory implements IStudentReponsitory{
    private  static List<Student> studentList = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(int index) {
        studentList.remove(index);
    }

    @Override
    public List<Student> getAll() {
        return studentList;
    }
}
