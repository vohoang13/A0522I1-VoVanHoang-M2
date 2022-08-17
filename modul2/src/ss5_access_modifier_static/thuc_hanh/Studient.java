package ss5_access_modifier_static.thuc_hanh;

public class Studient {
    private int id;
    private String name;
    private static String college = "BBDIT";
    public Studient(int id, String name){
        this.id = id;
        this.name=name;
    }
    //static method
    static void change(){
        college = "CodeGym";
    }
    void display(){
        System.out.printf("id : " + id +", name: " + name + ", college: " + college);
    }

    public static void main(String[] args) {
        Studient.change();
        Studient studient = new Studient(111,"Hoàng");
        Studient studient1 = new Studient(112,"Vỹ");
        studient1.display();
        System.out.printf("\n");
        studient.display();
//        Studient.college="Code";
//        studient1.display();
//        System.out.printf("\n");
//        studient.display();
    }
}
