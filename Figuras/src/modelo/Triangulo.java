package modelo;

/**
 * crear triangulo
 */
public class Triangulo {

    private double base;

    private double altura;

    /**
     * constructor de rectangulo
     * @param base 
     * @param altura
     */
    public Triangulo(double base, double altura) {
       this.base=base;
       this.altura=altura;
    }

    /**
     * constructor rectangulo por defecto a 1
     * @param base  
     * @param altura
     */
    public void triangulo1(double base , double altura) {
        this.base=1;
        this.altura=1;
    }

    /**
     * establecer base
     * @param base
     */
    public void setBase(double base) {
        this.base=base;
    }

    /**
     * mirar la base
     * @return
     */
    public double getBase() {
        // TODO implement here
        return this.base;
    }

    /**
     * establecer altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura=altura;
    }

    /**
     * recoger altura
     * @return
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * area = base*altura/2
     */
    public double calcularArea() {
    	double area= base*altura/2;
    	return area;
    }

}