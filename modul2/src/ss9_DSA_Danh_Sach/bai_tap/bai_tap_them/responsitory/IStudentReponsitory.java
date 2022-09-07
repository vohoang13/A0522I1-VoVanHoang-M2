package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.responsitory;

import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.controller.StudentController;
import ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model.Student;

import java.util.List;

public interface IStudentReponsitory {
    void addStudent(Student student);

    void removeStudent(int index);

    List<Student> getAll();
}
