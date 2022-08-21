package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class Tiger extends Animal implements Edible{
    @Override
    String animalName() {
        return "Tiger ";
    }

    @Override
    public String makeSound() {
        return "Gầm....Gừ";
    }

    @Override
    public String howToEat() {
        return "Ăn thịt";
    }
}
