package ss7_abstractClass_interface.bai_tap.colorable;

public class TestColorable {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 3);
        Square square = new Square(4);
        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = square;
        for(int i=0; i< shapes.length;i++){
            System.out.println(shapes[i].getArea());
            if(shapes[i].equals(square)){
                System.out.println(square.howToColor());
            }
        }
    }
}
