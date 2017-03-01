package main;

import java.util.*;


public class Controlador {

    private List<Figura> figuras;
    double resultado=0;

    public Controlador()
    {
        figuras = new ArrayList<Figura>();
    }

    public List<Figura> getFiguras()
    {
        return figuras;
    }

    public void añadirFigura(Figura a)
    {
        figuras.add(a);
    }

    public double suma()
    {
        for (Figura a : figuras)
        {
            resultado += a.area();
        }
        return resultado;
    }
}
