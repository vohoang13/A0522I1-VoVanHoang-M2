package ss7_abstractClass_interface.thuc_hanh.animal_interface_edible;

public class TestFruit {
    public static void main(String[] args) {
        Fruit fruit[] = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit fruit1 : fruit) {
            System.out.println(fruit1.fruitName() + ": ");
            System.out.println(fruit1.howToEat());
        }
    }
}
