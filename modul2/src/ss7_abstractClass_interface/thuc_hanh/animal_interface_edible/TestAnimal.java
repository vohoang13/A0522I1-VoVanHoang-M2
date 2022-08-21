package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal[] = new Animal[2];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal animal1 : animal) {
            System.out.println(animal1.animalName() + ": ");
            System.out.print(animal1.makeSound() + ", ");
            System.out.println(animal1.howToEat());
        }
    }
}
