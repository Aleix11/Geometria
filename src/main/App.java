package main;

import javax.print.DocFlavor;



public class App {

    public static void main (String[] args)
    {
        Controlador figuras = new Controlador();

        //añadimos figuras

        figuras.añadirFigura(new Circulo(2));
        figuras.añadirFigura(new Cuadrado(3));
        figuras.añadirFigura(new Rectangulo(4, 5));
        figuras.añadirFigura(new Triangulo(4, 2));

        //Sumamos el total de las àreas
        System.out.println("Suma total de las areas: " + figuras.suma() + "\n");

        //Printamos la lista
        int i = 0;
        for(i=0; i <figuras.getFiguras().size(); i++)
        {
            System.out.println("Nombre figura: " + figuras.getFiguras().get(i).getClass().getSimpleName() + ", Y su àrea es: " + figuras.getFiguras().get(i).area()+"\n");
        }
    }
}
