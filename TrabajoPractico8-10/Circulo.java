public class Circulo {
    /*4.Crea una clase Círculo con un atributo de radio y métodos para calcular su área y circunferencia.*/
    public double radio;
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio(){return radio;}
    public void setRadio(double radio){this.radio = radio;}
    public double calcularArea(){
        return Math.PI * Math.pow(getRadio(),2);
    }
    public double calcularCirfcunferencia(){
        return Math.PI * (2*getRadio());
    }


}
