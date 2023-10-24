    /*1. Crea una clase Perro con atributos como nombre, raza y edad.*/
    public class Perro {
    private String nombre;
    private String raza;
    private int edad;

    public Perro(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    /*3. Crea un método en la clase Perro llamado ladrar que imprima "Guau, guau" en la consola.*/
    public void guau(){
        System.out.println("Guau, guau");
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getRaza() {return raza;}
    public void setRaza(String raza){this.raza = raza;}

    public int getEdad(){return edad;}
    public void setEdad(int edad){this.edad = edad;}


}
