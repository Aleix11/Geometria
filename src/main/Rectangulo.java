package main;

/**
 * Created by aleix on 28/2/2017.
 */
public class Rectangulo {

    double c1, c2;

    public Rectangulo (double c1, double c2)
    {
        this.c1 = c1;
        this.c2 = c2;
    }

    public double area()
    {
        return (this.c1*this.c2);
    }
}
