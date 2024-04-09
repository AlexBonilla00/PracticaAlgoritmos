package modelo;

/**
 *  Clase Rectangulo. Permite crear rectangulos y calcular su area y perimetro.
 */
public class Rectangulo extends Figura{
	
	/**
	 *  Constructor por defecto. Crea un rectangulo con base y altura en 1, en metros
	 */
    public Rectangulo() {
        this.base =1;
        this.altura = 1;
    }

    private int base;

    private int altura;

    /**
     * Constructor que recibe la base y la altura del rectangulo en metros
     * @param base  	La base del rectangulo, en metros
     * @param altura	La altura del rectangulo, en metros
     */
    public  Rectangulo(int base, int altura) {
     this.base=base;
     this.altura=altura;
    }

    /**
     * constructor rectangulo por defecto a 1
     * @param base  
     * @param altura
     */
    public void Rectangulo1() {
        this.base=1;
        this.altura=1;
    }

    public void setBase(int base) {
        this.base=base;
    }

    public int getBase() {
        // TODO implement here
        return this.base;
    }

    public void setAltura(int altura) {
        this.altura=altura;
    }

    public int getAltura() {
        return this.altura;
    }

    /**
     * @see modelo.Figura#area()
     */
	@Override
	public double area() {
    	int area=base*altura;
    	return area;
    }
 /**
     * @see modelo.Figura#perimetro()
     */

	@Override
	public double perimetro() {

	       int perimetro= 2*base+altura*2;
	        return perimetro;
	    }


}