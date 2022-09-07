package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model;

public class Teacher extends MainPerson{
    private String code;
    private String specialize;

    public Teacher(){}

    public Teacher(String code, String specialize) {
        this.code = code;
        this.specialize = specialize;
    }

    public Teacher(String name, String dayOfBirth, String gender, String code, String specialize) {
        super(name, dayOfBirth, gender);
        this.code = code;
        this.specialize = specialize;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "code='" + code + '\'' +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
