package main;

public abstract class FiguraBasica implements Figura{
    Comparable<Figura>{
            public int compareTo(Figura a)
        {
                    int resultado = 0;
                   if (this.area()<a.area()){resultado=-1;}
                   else if (this.area()>a.area()){resultado=1;}
            else {resultado=0;}
                   return resultado;
               }
        }
}
