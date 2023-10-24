public class Pelicula {
    /*15. Crea una clase Película con atributos como título, director y duración en minutos. Implementa un método para mostrar la información de la película.*/
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void infoPeli(){
        System.out.println("Titulo: " + getTitulo() + "\nDirector: " + getDirector() + "\nDuracion: " + getDuracion() + " minutos");
    }
}
