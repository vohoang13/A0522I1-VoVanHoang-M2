package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Orange extends  Fruit{
    @Override
    public String fruitName() {
        return "Orange";
    }

    @Override
    public String howToEat() {
        return "Cam được vắt rồi uống";
    }
}
