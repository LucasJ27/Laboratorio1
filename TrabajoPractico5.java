import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class TrabajoPractico5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*1. Ordenar un array de números enteros de menor a mayor.*/

        int [] arrayOrden = {90,40,30,50,10,3,4,5,6,25};
        Arrays.sort(arrayOrden);
        System.out.println("El array de numeros enteros ordenado de menor a mayor queda de la siguiente forma: ");
        for(int orden : arrayOrden)
            System.out.println(orden);


        /*2. Ordenar un array de números enteros de mayor a menor.*/

        Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println("El array de numeros enteros ordenado de mayor a menor queda de la siguiente forma: ");
        for (int n : numeros) {
            System.out.println(n);
        }

        /*3. Ordenar un array de números flotantes de menor a mayor.*/

        float [] arrayFlotantes = {3.14f,2.718f,0.5f,123.456f,7.0f,9.8f,6.66f,55.5f,1.234f,0.001f};
        Arrays.sort(arrayFlotantes);
        System.out.println("El array de numeros flotantes ordenado de menor a mayor queda de la siguiente forma: ");
        for(float orden : arrayFlotantes)
            System.out.println(orden);

        /*4. Ordenar un array de números flotantes de mayor a menor*/

        Float [] Flotantes = {3.14f,2.718f,0.5f,123.456f,7.0f,9.8f,6.66f,55.5f,1.234f,0.001f};
        Arrays.sort(Flotantes, Collections.reverseOrder());
        System.out.println("El array de numeros flotantes ordenado de mayor a menor queda de la siguiente forma: ");
        for (float n : Flotantes) {
            System.out.println(n);
        }

        /*5. Ordenar un array de cadenas de texto en orden alfabético*/

        String [] nombres = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo","cristina","ruben","walter"};
        Arrays.sort(nombres);
        System.out.println("El array de cadenas ordenado alfabeticamente queda de la siguiente forma: ");
        for(String nombre : nombres){
            System.out.println(nombre + " ");
        }

        /*6. Ordenar un array de cadenas de texto en orden inverso*/

        String [] cadenas = {"juan", "pedro", "ana", "maria", "felipe", "luis", "eduardo","cristina","ruben","walter"};
        Arrays.sort(cadenas, Collections.reverseOrder());
        System.out.println("El array de cadenas en orden inverso queda de la siguiente forma: ");
        for(String cadena : cadenas){
            System.out.println(cadena + " ");
        }

        /*9. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento burbuja.*/

        int [] ordenBurbuja = {90,40,30,50,10,3,4,5,6,25};
        int aux;
        for (int i = 0; i < ordenBurbuja.length - 1; i++) {
            for (int j = 0; j < ordenBurbuja.length - i - 1; j++) {
                if (ordenBurbuja[j + 1] < ordenBurbuja[j]) {
                    aux = ordenBurbuja[j + 1];
                    ordenBurbuja[j + 1] = ordenBurbuja[j];
                    ordenBurbuja[j] = aux;
                }
            }
        }
        System.out.println("El array de numeros enteros ordenado usando el algoritmo ordenamiento burbuja queda de la siguiente forma: ");
        for(int burbujas : ordenBurbuja){
            System.out.println(burbujas);
        }

        /*10. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por selección.*/
        int [] ordenSeleccion = {5, 12, -3, 8, 0, -15, 7, 2, -8, 10};
        int menor, pos, tmp;
        for (int i = 0; i < ordenSeleccion.length - 1; i++) {
            menor = ordenSeleccion[i];
            pos = i;
            for (int j = i + 1; j < ordenSeleccion.length; j++){
                if (ordenSeleccion[j] < menor) {
                    menor = ordenSeleccion[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = ordenSeleccion[i];
                ordenSeleccion[i] = ordenSeleccion[pos];
                ordenSeleccion[pos] = tmp;
            }
        }
        System.out.println("El array de numeros enteros ordenado usando el algoritmo ordenamiento por seleccion queda de la siguiente forma: ");
        for(int seleccion : ordenSeleccion){
            System.out.println(seleccion);
        }

        /*11. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por inserción.*/

        int [] ordenInsercion = {5, 12, -3, 8, 0, -15, 7, 2, -8, 10};
        int p, j;
        for (p = 1; p < ordenInsercion.length; p++){
            aux = ordenInsercion[p];
            j = p - 1;
            while ((j >= 0) && (aux < ordenInsercion[j])){

                ordenInsercion[j + 1] = ordenInsercion[j];
                j--;
            }
            ordenInsercion[j + 1] = aux;
        }
        System.out.println("El array de numeros enteros ordenado usando el algoritmo ordenamiento por insercion queda de la siguiente forma: ");
        for(int insercion : ordenInsercion){
            System.out.println(insercion);
        }

        /*12. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento por mezcla.*/

        int [] ordenMergeSort = {5, 12, -3, 8, 0, -15, 7, 2, -8, 10};

        mergesort(ordenMergeSort,0, ordenMergeSort.length - 1);
        System.out.println("El array de numeros enteros ordenado usando el algoritmo ordenamiento por mezcla queda de la siguiente forma: ");
        for(int mezcla : ordenMergeSort){
            System.out.println(mezcla);
        }

        /*13. Ordenar un array de números enteros utilizando el algoritmo de ordenamiento shell.*/
        int [] ordenShell = {5, 12, -3, 8, 0, -15, 7, 2, -8, 10};
        int salto;
        boolean cambios;

        for (salto = ordenShell.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (int i = salto; i < ordenShell.length; i++){
                    if (ordenShell[i - salto] > ordenShell[i]) {
                        aux = ordenShell[i];
                        ordenShell[i] = ordenShell[i - salto];
                        ordenShell[i - salto] = aux;
                        cambios = true;
                    }
                }
            }
        }
        System.out.println("El array de numeros enteros ordenado usando el algoritmo ordenamiento shell queda de la siguiente forma: ");
        for(int shell : ordenShell){
            System.out.println(shell);
        }


        /*14. Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
         Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el array ASCENDENTE O DESCENDENTE y que método de ordenamiento aplicar
         (inserción, burbuja, selección), según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
         Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.*/

        int [] arrayVeinte = new int [20];
        int options,orden;
        System.out.println("Ingrese los 20 numeros enteros del array: ");
        for(int i=0; i<arrayVeinte.length; i++){
            System.out.println("Numero " + (i+1) + ": ");
            arrayVeinte[i] = teclado.nextInt();
        }
        for(int i=0; i<arrayVeinte.length; i++){
            System.out.println("El " + (i+1) + "ª numero ingresado es: " + arrayVeinte[i]);
        }

        do{

            System.out.println("Como desea organizar el array?(Ingrese 1, 2 o 3 segun corresponda)\n1- De forma Ascendente\n2- De forma Descendente\n3- Salir ");
            options = teclado.nextInt();

            if (options == 3) {
                System.out.println("Saliendo del programa.");
                break;
            }

            System.out.println("Que metodo de ordenamiento desea utilizar?\n1-Metodo de Insercion\n2-Metodo de Burbuja\n3-Metodo de seleccion");
            orden = teclado.nextInt();

        switch(orden){
             case 1:
                    if(options == 1){
                         System.out.println("Elegiste ordenar el array de forma ascendente utilizando el Metodo de Insercion");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                                System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         insercionDirecta(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                 }else if (options == 2){
                         System.out.println("Elegiste ordenar el array de forma descendente utilizando el Metodo de Insercion");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                                System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         insercionDirectaDescendente(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();
                 }
                 break;
             case 2:
                    if(options == 1){
                         System.out.println("Elegiste ordenar el array de forma ascendente utilizando el Metodo de Burbuja");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                            System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         burbuja(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                 }else if (options == 2){
                         System.out.println("Elegiste ordenar el array de forma descendente utilizando el Metodo de Burbuja");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                                System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         burbujaDescendente(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();
                 }
                 break;
             case 3:
                    if(options == 1){
                         System.out.println("Elegiste ordenar el array de forma ascendente utilizando el Metodo de Seleccion");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                                System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         seleccion(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();
                 }else if (options == 2){
                         System.out.println("Elegiste ordenar el array de forma descendente utilizando el Metodo de Seleccion");
                         System.out.println("El array original es:");
                         for (int i = 0; i < arrayVeinte.length; i++) {
                                System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();

                         System.out.println("El array ordenado queda de la siguiente forma: ");
                         seleccionDescendente(arrayVeinte);
                         for (int i = 0; i < arrayVeinte.length; i++) {
                             System.out.print(arrayVeinte[i] + " ");
                         }
                         System.out.println();
                 }
                 break;

         }

        }while(true);

    }

    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length];
        for (i=izq; i<=der; i++)
            B[i]=A[i];

        i=izq; j=m+1; k=izq;

        while (i<=m && j<=der)
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];

        while (i<=m)
            A[k++]=B[i++];
    }

    public static void mergesort(int A[],int izq, int der){
        if (izq < der){
            int m=(izq+der)/2;
            mergesort(A,izq, m);
            mergesort(A,m+1, der);
            merge(A,izq, m, der);
        }
    }

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    public static void burbujaDescendente(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] > A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }



    public static void seleccion(int A[]) {
        int i, j, menor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            menor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] < menor) {
                    menor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void seleccionDescendente(int A[]) {
        int i, j, mayor, pos, tmp;
        for (i = 0; i < A.length - 1; i++) {
            mayor = A[i];
            pos = i;
            for (j = i + 1; j < A.length; j++){
                if (A[j] > mayor) {
                    mayor = A[j];
                    pos = j;
                }
            }
            if (pos != i){
                tmp = A[i];
                A[i] = A[pos];
                A[pos] = tmp;
            }
        }
    }

    public static void insercionDirecta(int A[]){
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux < A[j])){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }

    public static void insercionDirectaDescendente(int A[]){
        int p, j;
        int aux;
        for (p = 1; p < A.length; p++){
            aux = A[p];
            j = p - 1;
            while ((j >= 0) && (aux > A[j])){
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = aux;
        }
    }


}
