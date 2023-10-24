public class TrabajoPractico8 {
    public static void main(String[] args) {

        /*2. Define un objeto de la clase Perro y asigna valores a sus atributos*/
        Perro p1 = new Perro("Rocco", "Bulldog Ingles", 10);

        System.out.println("La edad de " + p1.getNombre() + " es: " + p1.getEdad() + " años y su raza es: " + p1.getRaza());
        p1.guau();
        /*5. Crea un objeto de la clase Círculo y calcula su área y circunferencia.*/
        Circulo c1 = new Circulo(5);
        System.out.println("El area del circulo es: " + c1.calcularArea());
        System.out.println("La circunferencia del circulo es: " + c1.calcularCirfcunferencia());
        Libro l1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967);
        l1.info();
        CuentaBancaria cuenta1 = new CuentaBancaria(0.0,"123456789");
        cuenta1.depositar(2000);
        cuenta1.retirar(1500);
        Rectangulo r1 = new Rectangulo(10,20);
        System.out.println("El area del rectangulo es: " + r1.calcuarArea() );
        System.out.println("El perimetro del rectangulo es: " + r1.calcularPerimetro());
        Coche coche1 = new Coche("Peugeot", 2014, 2014,0);
        coche1.acelerar(200);
        coche1.frenar(100);
        Pelicula peli1 = new Pelicula("Django sin cadenas", "Quentin Tarantino", 165);
        peli1.infoPeli();
    }
}
