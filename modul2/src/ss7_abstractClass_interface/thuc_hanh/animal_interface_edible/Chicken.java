package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Chicken extends Animal implements Edible{

    @Override
    String animalName() {
        return "Chicken ";
    }

    @Override
    public String makeSound() {
        return "ò ó o o o.... ";
    }

    @Override
    public String howToEat() {
        return "ăn gạo";
    }
}
