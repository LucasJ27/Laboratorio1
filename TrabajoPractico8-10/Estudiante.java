public class Estudiante {
    /*6. Crea una clase Estudiante con atributos como nombre, edad y número de identificación.*/
    private String nombre;
    private int edad;
    private int ID;

    /*7. Define un constructor para la clase Estudiante que permita inicializar sus atributos al crear un objeto.*/
    public Estudiante(String nombre, int edad, int ID){
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
