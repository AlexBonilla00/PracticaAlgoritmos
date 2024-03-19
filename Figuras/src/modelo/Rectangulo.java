package modelo;
import java.util.*;

/**
 * 
 */
public class Rectangulo {


    public Rectangulo() {
    }

    private int base;

    private int altura;

    /**
     * constructor de rectangulo
     * @param base 
     * @param altura
     */
    public void rectangulo(int base, int altura) {
     this.base=base;
     this.altura=altura;
    }

    /**
     * constructor rectangulo por defecto a 1
     * @param base  
     * @param altura
     */
    public void rectangulo1(int base , int altura) {
        this.base=base=1;
        this.altura=altura=1;
    }

    /**
     * establecer base
     */
    public void setBase(int base) {
        this.base=base;
    }

    /**
     * mirar la base
     * @return
     */
    public int getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * establecer altura
     * @param altura
     */
    public void setAltura(int altura) {
        this.altura=altura;
    }

    /**
     * recoger altura
     * @return
     */
    public int getAltura() {
        return this.altura;
    }

    /**
     * calcular perímetro , base*2+altura*2
     */
    public int calcularPerimetro(int perimetro) {
        perimetro= 2*base+altura*2;
        return perimetro;
    }

    /**
     * calcular area del rectangulo,base *altura
     */
    public int calcularArea(int area) {
    	area=base*altura;
    	return area;
    }

}