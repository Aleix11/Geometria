package main;

public class Circulo {

    private double r1;

    public Circulo(double r1)
    {
        this.r1 = r1;
    }

    public double area()
    {
        return (this.r1*this.r1*(Math.PI));
    }
}
