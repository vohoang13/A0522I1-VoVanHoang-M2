package ss5_access_modifier_static.bai_tap.access_modifier_2;

public class Student {
    private String name;
    private String classes;
    public Student(){
        this.name = "Jonh";
        this.classes = "C02";
    }
    public void setName(String name){
        this.name = name;
    }
    public void setClasses(String classes){
        this.classes = classes;
    }
    public String display(){
        return "name: " + this.name + ", class: " + this.classes;
    }

}
