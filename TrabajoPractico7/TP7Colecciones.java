import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TP7Colecciones {
    public static void main(String[] args) {

        /*1. Crea un ArrayList de números enteros y agrega 5 números a la lista.*/

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        /*2. Crea un ArrayList de cadenas y agrega 3 nombres a la lista.*/

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Lucas");
        nombres.add("Lucia");
        nombres.add("Valentino");

        /*3. Imprime todos los elementos de un ArrayList de enteros.*/
        for (int numero : numeros) {
            System.out.println(numero);
        }

        /*4. Encuentra la longitud (número de elementos) de un ArrayList de caracteres.*/

        ArrayList<Character> caracteres = new ArrayList<>();
        caracteres.add('a');
        caracteres.add('b');
        caracteres.add('c');
        caracteres.add('d');
        caracteres.add('e');
        System.out.println("El tamaño de lista de caracateres es: " + caracteres.size());

        /*5. Elimina un elemento específico de un ArrayList de cadenas.*/
        System.out.println("Eliminamos el primer nombre de la lista nombres: ");
        nombres.remove(0);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        /*6. Comprueba si un ArrayList de números enteros está vacío.*/

        System.out.println("El array de numeros esta vacio? " + numeros.isEmpty());

        /*7. Encuentra el elemento más grande en un ArrayList de números.*/

        System.out.println("El valor más grande en el ArrayList de numeros es: " + Collections.max(numeros));

        /*8. Copia todos los elementos de un ArrayList en otro ArrayList nuevo.*/
        ArrayList<Integer> numerosOriginal = new ArrayList<>();
        numerosOriginal.add(5);
        numerosOriginal.add(10);
        numerosOriginal.add(15);
        ArrayList<Integer> numerosCopia = new ArrayList<>(numerosOriginal);
        for (int numero : numerosCopia) {
            System.out.println(numero);
        }

        /*9. Invierte un ArrayList de enteros (el primer elemento se convierte en el último y viceversa).*/
        Collections.reverse(numeros);
        System.out.println("El array de enteros invertido queda de la siguiente forma: ");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        /*10. Combina dos ArrayLists de enteros en uno solo.*/
        ArrayList<Integer> listaUno = new ArrayList<>();
        listaUno.add(10);
        listaUno.add(20);
        ArrayList<Integer> listaDos = new ArrayList<>();
        listaDos.add(30);
        listaDos.add(40);
        listaUno.addAll(listaDos);
        System.out.println("Los arrays listaUno y listaDos combinados quedan de la siguiente forma: ");
        for (int numero : listaUno) {
            System.out.println(numero);
        }

        /*11. Crea un ArrayList de números enteros y elimina todos los elementos pares.*/
        ArrayList<Integer> numerosEnteros = new ArrayList<>();
        numerosEnteros.add(1);
        numerosEnteros.add(2);
        numerosEnteros.add(3);
        numerosEnteros.add(4);
        numerosEnteros.add(5);
        numerosEnteros.add(6);

        System.out.println("Eliminamos elementos pares: ");
        // Utilizamos removeIf() para eliminar elementos pares
        numerosEnteros.removeIf(numero -> numero % 2 == 0);
        // Imprimir la lista actualizada
        for (int numero : numerosEnteros) {
            System.out.println(numero);
        }

        /*12. Busca un elemento específico en un ArrayList de cadenas y devuelve su índice.*/

        ArrayList<String> words = new ArrayList<>();
        words.add("Hola");
        words.add("Mundo");
        words.add("Java");
        System.out.println("El indice el elemento Java es: " + words.indexOf("Java"));

        /*13. Comprueba si dos ArrayLists son iguales (tienen los mismos elementos en el mismo orden).*/
        System.out.println("El array de enteros llamado numeros es igual al array de enteros llamado numerosOriginal? " + numeros.equals(numerosOriginal));

        /*14. Encuentra el elemento más pequeño en un ArrayList de números.*/
        System.out.println("El valor más pequeño en el ArrayList de numeros es: " + Collections.min(numeros));

        /*15. Crea un ArrayList de números enteros y suma todos los elementos*/
        ArrayList<Integer> numeros2 = new ArrayList<>();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);
        int suma = 0;
        for (int numero : numeros2) {
            suma += numero;
        }
        System.out.println("La suma de todos los elementos en el array numeros2 da como resultado: " + suma);

        /*16. Crea un ArrayList de cadenas y concatena todas las cadenas en una sola.*/
        ArrayList<String> cadenaSuma = new ArrayList<>();
        cadenaSuma.add("Hola ");
        cadenaSuma.add("como ");
        cadenaSuma.add("estas?");
        String sumaCadena = "";
        for (String cadena : cadenaSuma) {
            sumaCadena += cadena;
        }
        System.out.println("La concatenacion de las cadenas en el array cadenaSuma da como resultado: " + sumaCadena);

        /*17. Elimina todos los elementos duplicados de un ArrayList de cadenas*/
        ArrayList<String> duplicados = new ArrayList<>();
        duplicados.add("Duplicado");
        duplicados.add("DuplicadoUno");
        duplicados.add("DuplicadoUno");
        duplicados.add("DuplicadoDos");
        HashSet<String> eliminoDuplicados = new HashSet<>(duplicados);
        ArrayList<String> sinDuplicados = new ArrayList<>(eliminoDuplicados);
        System.out.println("ArrayList original: " + duplicados);
        System.out.println("ArrayList sin elementos duplicados: " + sinDuplicados);

        /*18. Crea un ArrayList de enteros y encuentra la suma de los elementos en índices pares.*/
        ArrayList<Integer> indicesPares = new ArrayList<>();
        indicesPares.add(1);
        indicesPares.add(2);
        indicesPares.add(3);
        indicesPares.add(4);
        indicesPares.add(5);
        indicesPares.add(6);
        int sumaIndices = 0;
        for (int i = 0; i < indicesPares.size(); i++) {
            if (i % 2 == 0) {
                System.out.println("El indice par " + i + " contiene el elemento: " + indicesPares.get(i));
                sumaIndices += indicesPares.get(i);
            }
        }
        System.out.println("La suma de los elementos en los indices pares de la lista da como resultado: " + sumaIndices);

        /*19. Comprueba si un ArrayList de enteros contiene un número específico.*/
        System.out.println("El ArrayList indicesPares contiene el numero 2? " + indicesPares.contains(2));
        /*20. Encuentra el elemento en un ArrayList de cadenas que tiene la longitud más larga.*/
        ArrayList<String> cadenaLongitud = new ArrayList<>();
        cadenaLongitud.add("Uno");
        cadenaLongitud.add("Dos");
        cadenaLongitud.add("Tres");

        String cadenaMasLarga = ""; // Inicializa una cadena vacía

        for (String cadena : cadenaLongitud) {
            if (cadena.length() > cadenaMasLarga.length()) {
                cadenaMasLarga = cadena;
            }
        }
        System.out.println("La cadena más larga es: " + cadenaMasLarga);

        /*21. Encuentra el promedio de todos los elementos en un ArrayList de números enteros.*/
        ArrayList<Integer> numeros3 = new ArrayList<>();
        numeros3.add(1);
        numeros3.add(2);
        numeros3.add(3);
        numeros3.add(4);
        numeros3.add(5);
        numeros3.add(6);
        double promedio = 0;
        double suma2 = 0;
        for (double numero : numeros3) {
            suma2+=numero;
        }
        promedio = suma2 / numeros3.size();
        System.out.println("El promedio de todos los elementos es: " + promedio);
        /*22. Crea un ArrayList de enteros y ordénalo de forma ascendente.*/
        ArrayList<Integer> numeros4 = new ArrayList<>();
        numeros4.add(10);
        numeros4.add(9);
        numeros4.add(8);
        numeros4.add(7);
        Collections.sort(numeros4);
        System.out.println("Lista ordenada en orden ascendente: " + numeros4);

        /*23. Crea un ArrayList de números enteros y elimina todos los elementos mayores que un valor específico.*/
        ArrayList<Integer> numeros5 = new ArrayList<>();
        numeros5.add(10);
        numeros5.add(9);
        numeros5.add(8);
        numeros5.add(7);
        numeros5.add(6);
        int valorEspecifico = 6;
        numeros5.removeIf(numero -> numero > valorEspecifico);
        System.out.println("Lista actualizada con elementos eliminados: ");
        for (int numero : numeros5) {
            System.out.println(numero);
        }
        /*24. Encuentra la cantidad de veces que un elemento específico aparece en un ArrayList de cadenas.*/
        ArrayList<String> cadenaCount = new ArrayList<>();
        cadenaCount.add("Uno");
        cadenaCount.add("Uno");
        cadenaCount.add("Uno");
        System.out.println("El elemento Uno se repite " + Collections.frequency(cadenaCount, "Uno") + " veces en la lista");

        /*25. Crea un ArrayList de cadenas y ordena las cadenas alfabéticamente.*/
        ArrayList<String> cadenaOrden = new ArrayList<>();
        cadenaOrden.add("Lucas");
        cadenaOrden.add("Lucia");
        cadenaOrden.add("Facundo");
        Collections.sort(cadenaOrden);
        System.out.println("Lista de cadenas ordenada alfabeticamente: " + cadenaOrden);


    }
}


