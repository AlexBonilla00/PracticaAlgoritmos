package modelo;
import java.util.*;

/**
 * Creacion del circulo  en 1 los parametros
 */
public class Circulo {

  private double radio;

    private double diametro;

    private double pi;
 /**
     * constructor del circulo
     * @param radio 
     * @param diametro 
     * @param pi
     */
    public Circulo(double radio, double diametro, double pi) {
    	this.radio=radio;
    	this.diametro=diametro;
    	this.pi=3.14;
    }    
    /**
     * rectangulo por defecto a 1
     * @param radio 
     * @param diametro 
     * @param pi
     */
    public void Circulo1() {
    	this.radio=1;
    	this.diametro=1;
    	this.pi=3.14;
    }

    /**
     * establecer radio
     * @param radio
     */
    public void setRadio(double radio) {
       this.radio=radio;
    }

    /**
     * mirar la base
     * @return
     */
    public double getRadio() {
        // TODO implement here
        return this.radio;
    }

    /**
     * establecer  diametro
     * @param diametro
     */
    public void setDiametro(double diametro) {
        this.diametro=diametro;
    }

    /**
     * recoger diametro
     * @return
     */
    public double getDiametro() {
        return this.diametro;
    }

    /**
     * calcular perímetro π x d.
     * @return
     */
    public double calcularPerimetro() {
        double perimetro= this.pi*this.diametro;
        return perimetro;
    }

    /**
     * calcular area del rectangulo, π r²
     * @return
     */
    public double calcularArea() {
       double area= this.pi*this.radio*this.radio;
        return area;
    }

}