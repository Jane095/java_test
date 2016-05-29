package Ex_2;

/**
 * Created by Евгения on 28.05.2016.
 */
public class Rectangle extends Figure implements Figure_fanc{
    public double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b=b;
    }

    public void Perimeter() {
        double P = 2*(a+b);
        System.out.println("Perimetr rectangle: " + P);
    }

    public void Square() {
        double S =a*b;
        System.out.println("Square rectangle: " + S);
    }
}
