package main;

public class Circulo {
    double c1;

    public Circulo(double c1) {
        this.c1 = c1;

    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double area(){
        return Math.PI * Math.pow(c1,2);
    }
}
