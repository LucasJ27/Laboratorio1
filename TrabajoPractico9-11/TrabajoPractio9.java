import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
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

        /*4. Escriba una aplicación que:
        a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un ArrayList.
        b) determine y muestre el mayor de los números en el arreglo
        c) determine y muestre el menor de los números del arreglo calcule y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
*/
        ArrayList<Double> veinteNum = new ArrayList<>();
        double numeros;
        for(int i=0; i<20; i++){
            System.out.println("Ingrese el " + (i+1) + "º" +  " numero decimal: ");
            numeros = teclado.nextDouble();
            veinteNum.add(numeros);
        }
        for (double numero : veinteNum) {
            System.out.println(numero);
        }
        System.out.println("El mayor numero en el arreglo es: " + Collections.max(veinteNum));
        System.out.println("El menor numero en el arreglo es: " + Collections.min(veinteNum));
        double rango = Collections.max(veinteNum) - Collections.min(veinteNum);
        System.out.println("El rango del Array es: " + rango);



        /*5. Escriba una aplicación para almacenar en un ArrayList<Integer>
        aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
        cuales se desea saber:
        a) su promedio aritmético
        b) cuántos de los números son iguales al promedio aritmético
        c) cuántos de los números son mayores que el promedio aritmético
        d) cuántos de los números son menores que el promedio aritmético*/

        ArrayList<Integer> numerosPares = new ArrayList<>();
        Random random = new Random();

        int contador = 0;
        while (contador < 20) {
            int numero = random.nextInt(50) * 2 + 2;
            if (!numerosPares.contains(numero)) {
                numerosPares.add(numero);
                contador++;
            }
        }

        System.out.println("Números enteros pares generados aleatoriamente y almacenados en el ArrayList:");
        for (int num : numerosPares) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        int suma = 0;
        for (int num2 : numerosPares) {
            suma+= num2;
        }
        double promedio = (double) suma / numerosPares.size();
        System.out.println("El promedio aritmetico de los 20 numeros pares es: " + promedio);
        System.out.println();
        int contador2 = 0;
        for (int num3: numerosPares) {
            if(num3 == promedio){
                contador2++;
            }
        }
        System.out.println("La cantidad de numeros iguales al promedio es: " + contador2);
        int contador3 = 0;
        for (int num3: numerosPares) {
            if(num3 > promedio){
                contador3++;
            }
        }
        System.out.println("La cantidad de numeros mayores al promedio es: " + contador3);

        int contador4 = 0;
        for (int num3: numerosPares) {
            if(num3 < promedio){
                contador4++;
            }
        }
        System.out.println("La cantidad de numeros menores al promedio es: " + contador4);
    }
}
