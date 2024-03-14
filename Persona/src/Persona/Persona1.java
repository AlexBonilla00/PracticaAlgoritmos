package Persona;

import java.util.*;

/**
 * 
 */
public class Persona1 {


    public Persona1() {
    }

    private String DNI ;


    private String nombre ;


    private String apellidos ;

    private int edad ;

    /**
     * Crea una persona a partir de su dni, nombre, apellidos y edad.
     * @param DNI 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public void Persona(String DNI, String nombre, String apellidos, int edad) {

    }

    /**
     * establece el dni
     * @param DNI
     */
    public void setDNI(String DNI) {
    	this.DNI=DNI;
    }

    /**
     * obtiene el dni
     * @return
     */
    public String getDNI() {
        return this.DNI;
    }

    /**
     * Establece el nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }

    /**
     * Obtiene el nombre
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece apellido
     * @return
     */
    public String getApellido() {
        return this.apellidos;
    }

    /**
     * Obtiene apellido
     * @param apellido:String
     */
    public void setApellido(String apellido) {
    this.apellidos=apellido;
    }

    /**
     * establece edad
     * @return
     */
    public void setEdad(int edad) {
    this.edad=edad;
    }


    /**
     * obtiene edad
     * @param edad
     */
    public int getEdad() {
    	return this.edad;
}

}