package Alumno;
public class Alumno {
   int Id;
   String Nombre;
   String Apellido;
   int Edad;
    public Alumno() {
    }

    public Alumno(int Id, String Nombre, String Apellido, int Edad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    } 
}
