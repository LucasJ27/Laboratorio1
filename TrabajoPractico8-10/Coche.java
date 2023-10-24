public class Coche {
    /*13. Crea una clase Coche con atributos como marca, modelo y año de fabricación.*/
    private String marca;
    private int modelo;
    private int anio_Fabricacion;
    private int velocidad;
    public Coche(String marca, int modelo, int anio_Fabricacion, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio_Fabricacion = anio_Fabricacion;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getAnio_Fabricacion() {
        return anio_Fabricacion;
    }

    public void setAnio_Fabricacion(int anio_Fabricacion) {
        this.anio_Fabricacion = anio_Fabricacion;
    }
    /*14. Define un método en la clase Coche que permita acelerar el coche y otro para frenar.*/
    public void acelerar(int incrementoDeVelocidad) {
        velocidad += incrementoDeVelocidad;
        System.out.println("El coche ha acelerado a " + velocidad + " km/h.");
    }
    public void frenar(int decrementoDeVelocidad) {
        if (velocidad >= decrementoDeVelocidad) {
            velocidad -= decrementoDeVelocidad;
            System.out.println("El coche ha frenado a " + velocidad + " km/h.");
        } else {
            System.out.println("El coche ya está detenido.");
        }
    }


}
