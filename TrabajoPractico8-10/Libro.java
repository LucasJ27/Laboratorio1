public class Libro {
    /*8. Crea una clase Libro con atributos como título, autor y año de publicación.*/
    private String titulo;

    public Libro(String titulo, String autor, int anio_Publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio_Publicacion = anio_Publicacion;
    }

    private String autor;
    private int anio_Publicacion;
    /*9. Implementa un método en la clase Libro que permita mostrar la información del libro en la consola.*/

    public void info(){
        System.out.println("Titulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nAño de Publicacion: " + getAnio_Publicacion());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio_Publicacion() {
        return anio_Publicacion;
    }

    public void setAnio_Publicacion(int anio_Publicacion) {
        this.anio_Publicacion = anio_Publicacion;
    }

}
