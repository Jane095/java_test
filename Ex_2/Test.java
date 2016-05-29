package Ex_2;

/**
 * Created by Евгения on 28.05.2016.
 */
public class Test {
    public static void main(String[] args)  {
        Triangle triangle = new Triangle(2,5,2);
        triangle.Perimeter();
        triangle.Square();
        Rectangle rec = new Rectangle(2,7);
        rec.Perimeter();
        rec.Square();
        Square square = new Square(2);
        square.Perimeter();
        square.Square();
    }
}
