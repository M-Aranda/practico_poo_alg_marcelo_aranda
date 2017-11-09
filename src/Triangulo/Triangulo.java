
package Triangulo;


import Figura.Figura;

public class Triangulo implements Figura {
    
    
    int a,b,c;
    @Override
    public double calcularPerimetro() {
        return (a+b+c);
    }



    
}
