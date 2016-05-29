package Ex_2;

import static java.lang.Math.sqrt;

/**
 * Created by Евгения on 28.05.2016.
 */
public class Triangle extends Figure implements Figure_fanc {
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        super(a);
        this.b=b;
        this.c=c;
    }

    public void Perimeter() {
        double P = a+b+c;
        System.out.println("Perimetr triangle: " + P);
    }

    public void Square() {
        double p = (a+b+c)/2;
        double S =sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Square triangle: " + S);
    }
}
