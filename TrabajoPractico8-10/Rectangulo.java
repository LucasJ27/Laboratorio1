public class Rectangulo {

    /*12. Crea una clase Rectángulo con atributos de ancho y alto y métodos para calcular su área y perímetro*/
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double calcuarArea(){
        return getAncho() * getAlto();
    }
    public double calcularPerimetro(){
        return (2*getAncho()) + (2*getAlto());
    }
}
