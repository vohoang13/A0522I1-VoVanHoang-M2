package ss9_DSA_Danh_Sach.bai_tap.bai_tap_them.model;

public abstract class MainPerson {
    private String name;
    private String dayOfBirth;
    private String gender;

    public MainPerson(){}

    public MainPerson(String name, String dayOfBirth, String gender) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "MainPerson{" +
                "name='" + name + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
