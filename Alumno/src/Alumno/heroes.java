package Alumno;
public class heroes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Alumno alu1 = new Alumno (1,"Alex", "Bonilla Martín", 22);
         Alumno alu2 = new Alumno (5, "Luisina", "de Paula",6);
        System.out.println(alu1.getId());
        System.out.println(alu1.getNombre());
        System.out.println(alu1.getApellido());
        System.out.println(alu1.getEdad()); 
       
        System.out.println(alu2.getId());
        System.out.println(alu2.getNombre());
        System.out.println(alu2.getApellido());
        System.out.println(alu2.getEdad()); 
    }
    
}
