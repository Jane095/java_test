package Ex_2;

/**
 * Created by Евгения on 28.05.2016.
 */
public abstract class Figure implements Figure_fanc{
    public double a;


    public Figure(double a){
        this.a=a;

    }

    public void Perimeter() {
        System.out.println("Perimetr: ");
    }

    public void Square() {
        System.out.println("Square: ");
    }
}
