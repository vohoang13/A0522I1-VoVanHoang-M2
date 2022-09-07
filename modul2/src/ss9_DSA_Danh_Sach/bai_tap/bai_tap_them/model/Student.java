package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model;

public class Student extends MainPerson {
    private String code;
    private String nameClass;
    private Double score;

    public Student() {
    }

    public Student(String code, String name, String dayOfBirth, String gender, String nameClass, Double score) {
        super(name, dayOfBirth, gender);
        this.code = code;
        this.nameClass = nameClass;
        this.score = score;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", nameClass='" + nameClass + '\'' +
                ", score=" + score +
                '}' + super.toString();
    }
}
