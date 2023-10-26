import java.util.ArrayList;
import java.util.Scanner;
public class TrabajoPractio9 {
    public static void main(String[] args) {
        /*1. Diseñar un programa que lea y guarde marcas de Autos en un ArrayList de tipo
        String. El programa pedirá una marca de Auto en un bucle, el mismo se guardará
        en la lista y después se le preguntará al usuario si quiere guardar otro Auto o si
        quiere salir. Si decide salir, se mostrará todos los autos guardados en el ArrayList.*/
        Scanner teclado = new Scanner(System.in);
        String marca;
        int options;
        ArrayList<String> marcasAuto = new ArrayList<>();
        do {
            System.out.println("Ingrese la marca de auto que desee: ");
            marca = teclado.nextLine();
            marcasAuto.add(marca);

            System.out.println("¿Qué desea hacer?");
            System.out.println("1 - Agregar otra marca");
            System.out.println("2 - Salir");
            options = teclado.nextInt();
            teclado.nextLine(); // Limpia el buffer del teclado

        } while (options != 2);

        System.out.println("Marcas de autos guardadas:");

        for (String marcas : marcasAuto) {
            System.out.println(marcas);
        }

        /*2. Define una clase EquipoDeFútbol que utiliza un ArrayList para mantener una lista de jugadores. La clase debe permitir agregar nuevos jugadores, eliminar jugadores y listar la plantilla.*/
        EquipoDeFutbol RiverPlate = new EquipoDeFutbol();
        RiverPlate.agregarJugador("Pity Martinez");
        RiverPlate.agregarJugador("De la Cruz");
        RiverPlate.agregarJugador("Armani");
        System.out.println("Plantilla actual del equipo:");
        for (String jugador : RiverPlate.listarPlantilla()) {
            System.out.println(jugador);
        }
        RiverPlate.eliminarJugador("Armani");
        System.out.println("Plantilla después de eliminar a Neymar:");
        for (String jugador : RiverPlate.listarPlantilla()) {
            System.out.println(jugador);
        }
        /*3. Crear una clase llamada Factura que represente una factura comercial. La clase debe tener los siguientes atributos:
        •	Número de factura: Un número único para identificar la factura.
        •	Fecha de emisión: La fecha en la que se emitió la factura.
        •	Cliente: El cliente al que se le emite la factura.
        •	Artículos: Una lista de artículos vendidos en la factura.
        •	Precio unitario: El precio unitario de cada artículo.
        •	Cantidad: La cantidad de cada artículo vendido.
        •	Subtotal: El subtotal de la factura sin impuestos.
        •	IVA: El impuesto sobre el valor añadido (IVA) de la factura.
        •	Total: El total de la factura, incluyendo el IVA.
        •
        La clase debe tener los siguientes métodos:

        •	Constructor: Un constructor que inicializa los atributos de la factura.
        •	Agregar artículo: Un método que agrega un artículo a la factura.
        •	Calcular subtotal: Un método que calcula el subtotal de la factura.
        •	Calcular IVA: Un método que calcula el IVA de la factura.
        •	Calcular total: Un método que calcula el total de la factura */

        Factura factura1 = new Factura("123", "26/10/2023","Lucas Cabrera");
        factura1.AgregarArticulo("Computadora",100000,2);
        factura1.imprimirFactura();
    }
}
