package main;

public class Triangulo {

    double base, altura;

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (this.base*this.altura/2);
    }
}
//