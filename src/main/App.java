package main;

import javax.print.DocFlavor;



public class App {

    public static void main (String[] args)
    {
        Controlador figuraas = new Controlador();

        //añadimos figuras

        figuraas.añadirFigura(new Circulo(2));
        figuraas.añadirFigura(new Cuadrado(3));
        figuraas.añadirFigura(new Rectangulo(4, 5));
        figuraas.añadirFigura(new Triangulo(4, 2));

        //Sumamos el total de las àreas
        System.out.println("Suma total de las areas: " + figuraas.suma() + "\n");

        //Printamos la lista
        int i = 0;
        for(i=0; i <figuraas.getFiguras().size(); i++)
        {
            System.out.println("Nombre figura: " + figuraas.getFiguras().get(i).getClass().getSimpleName() + " Y su àrea es: " + figuraas.getFiguras().get(i).area()+"\n");
        }
    }
}
