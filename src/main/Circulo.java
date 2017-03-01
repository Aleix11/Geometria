package main;

public class Circulo implements Figura {
    double r;

    public Circulo(double c1) {
        this.r = c1;

    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double area(){
        return Math.PI * Math.pow(r,2);
    }
}
