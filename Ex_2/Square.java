package Ex_2;

/**
 * Created by Евгения on 28.05.2016.
 */
public class Square extends Figure implements Figure_fanc {

    public Square(double a) {
        super(a);
    }

    public void Perimeter() {
        double P = 4*a;
        System.out.println("Perimetr square: " + P);
    }

    public void Square() {
        double S =a*a;
        System.out.println("Square square: " + S);
    }

}
