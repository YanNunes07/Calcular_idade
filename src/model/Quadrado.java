package model;

public class Quadrado {
    public int lado1;



    public double areaDoQuadrado(){
        return this.lado1*lado1;
    }

    public String mostrarDados(){
        return"\nArea do quadrado: "+areaDoQuadrado();
    }

}
