package ss5_access_modifier_static.bai_tap.access_modifier_2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Hoàng");
        student.setClasses("A05");
        System.out.printf(student.display());
    }
}
