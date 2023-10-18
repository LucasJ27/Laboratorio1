import java.util.Scanner;
import java.util.Arrays;

public class TrabajoPractico6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

/*
        //1. Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
        System.out.println("Ingrese el numero de filas de la matriz A: ");
        int filasA = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A: ");
        int columnasA = teclado.nextInt();
        System.out.println("Ingrese el numero de filas de la matriz B: ");
        int filasB = teclado.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A: ");
        int columnasB = teclado.nextInt();

        int [][] matrizA = new int[filasA][columnasA];
        int [][] matrizB = new int[filasB][columnasB];

        System.out.println("matriz A:");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                matrizA[i][j] = teclado.nextInt();
            }
        }
        System.out.println("matriz B:");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print("Elemento[" + i + "][" + j + "] = ");
                matrizB[i][j] = teclado.nextInt();
            }
        }
        int [][] matrizC = sumarMatrices(matrizA,matrizB);
        System.out.println("La suma de las matrices da como resultado: ") ;
        for (int i = 0; i < matrizC.length; i++) {
            for(int j = 0; j < matrizC[i].length; j++){
                System.out.printf("%3d", matrizC[i][j]);
            }
            System.out.println();
        }
*/

        //2. Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.

        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matriz2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] resultado = multiplicarMatrices(matriz1, matriz2);

        System.out.println("El resultado de la multiplicacion de las matrices es: ");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //3. Crear una función que calcule la transpuesta de una matriz.

        int[][] matrizT = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizTr = matrizTranspuesta(matrizT);
        System.out.println("La matriz transpuesta es: ");
        for (int i = 0; i < matrizTr.length; i++) {
            for (int j = 0; j < matrizTr[i].length; j++) {
                System.out.printf("%3d", matrizTr[i][j]);
            }
            System.out.println();
        }


        //4. Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).

        int[][] matrizD = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 6}
        };
        int[][] matrizE = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 7}
        };

        System.out.println("Matriz 1 es simétrica: " + esMatrizSimetrica(matrizD));
        System.out.println("Matriz 2 es simétrica: " + esMatrizSimetrica(matrizE));

        //5. Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.

        int[] vector = {1, 2, 3, 4, 5};
        int escalar = 2;

        int[] resultado2 = productoEscalar(vector, escalar);

        // Imprimir el resultado
        System.out.print("Resultado del producto escalar: ");
        System.out.println();
        for (int i = 0; i < resultado2.length; i++) {
            System.out.print(resultado2[i] + " ");
        }
        System.out.println();

        //6. Implementar una función que calcule la suma de todos los elementos de una matriz.
        int[][] matrizF = {
                {6, 7, 5},
                {3, 8, 4},
                {1, 0, 2},
                {9, 5, 2}
        };

        int resultado3 = sumarElementos(matrizF);

        System.out.print("Resultado de la suma de los elementos de la matriz F: " + resultado3);
        System.out.println();

        //7. Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.

        int[][] matrizG = {
                {6, 7, 5},
                {3, 8, 4},
                {1, 0, 2},
                {9, 5, 2}
        };
        int[] resultado4 = elementoMax(matrizG);
        System.out.println("El elemento maximo de la matriz G es: " + resultado4[0]);
        System.out.println("El elemento maxima de la matriz G se encuentra en la Fila: " + resultado4[1] + ", Columna " + resultado4[2]);


        //8. Crear una función que devuelva la suma de una fila específica de una matriz

        int[][] matrizH = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int numeroFila = 0; //Fila que queremos sumar

        int suma = sumaFila(matrizH, numeroFila);

        System.out.println("La suma de la fila " + (numeroFila + 1) + " es: " + suma);

        /*9. Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).
        Matriz Diagonal:
        Una matriz diagonal es una matriz cuadrada en la que todos los elementos fuera de la diagonal principal son iguales a 0.
        Los elementos en la diagonal principal pueden ser cualquier número, no necesariamente 1.
        Por ejemplo, una matriz diagonal 3x3 podría ser:
        D =  | 2  0  0 |
             | 0  5  0 |
             | 0  0  9 |*/
        int[][] matrizDiagonal = {
                {2, 0, 0},
                {0, 5, 0},
                {0, 0, 9}
        };
        int[][] matrizNoDiagonal = {
                {1, 0, 0},
                {0, 4, 2},
                {0, 1, 3}
        };

        System.out.println("Es diagonal: " + esMatrizDiagonal(matrizDiagonal));
        System.out.println("Es diagonal: " + esMatrizDiagonal(matrizNoDiagonal));


        //10. Crear una función que genere una matriz identidad de tamaño n.

        int[][] matrizI_n = matrizIdentidad(4);
        System.out.println("La matriz Identidad es: ");
        for (int i = 0; i < matrizI_n.length; i++) {
            for (int j = 0; j < matrizI_n[i].length; j++) {
                System.out.printf("%3d", matrizI_n[i][j]);
            }
            System.out.println();
        }

        //11. Escribir un método para contar la cantidad de elementos pares e impares en una matriz.

        int[][] paresImpares = {
                {2, 3, 2},
                {3, 2, 3},
                {2, 3, 2}
        };
        int[] resultado5 = parImpar(paresImpares);
        System.out.println("La cantidad de numeros pares en la matriz es: " + resultado5[0]);
        System.out.println("La cantidad de numeros impares en la matriz es: " + resultado5[1]);

        //12. Implementar una función que rote una matriz 90 grados en sentido horario.

        int[][] matrizOriginal = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizRotada = rotarMatriz(matrizOriginal);
        System.out.println("La matriz rotada en 90 grados en sentido horario quedaria de la siguiente forma: ");
        for (int i = 0; i < matrizRotada.length; i++) {
            for (int j = 0; j < matrizRotada[0].length; j++) {
                System.out.print(matrizRotada[i][j] + " ");
            }
            System.out.println();
        }

        //13. Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.

        int[][] matrizEspecifico = {
                {1, 2, 3},
                {4, 1, 6},
                {7, 8, 1}
        };
        int[] resultado6 = valorEspecifico(matrizEspecifico, 1);
        System.out.println("El numero de veces que aparece el numero " + resultado6[1] + " en la matriz es: " + resultado6[0]);

        //14. Crear una función que invierta el orden de las filas en una matriz.
        int[][] matrizOriginal2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrizInvert = invertirFilas(matrizOriginal2);
        System.out.println("La matriz con sus filas invertidas queda de la siguiene forma:  ");
        for (int i = 0; i < matrizInvert.length; i++) {
            for (int j = 0; j < matrizInvert[0].length; j++) {
                System.out.print(matrizInvert[i][j] + " ");
            }
            System.out.println();
        }

        //15. Escribir un método para sumar todas las diagonales de una matriz cuadrada.
        int[][] sumDiagonales = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("La suma de las diagonales de la matriz da como resultado: " + sumarDiagonales(sumDiagonales));

        //17. Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] minimosPorFila = minimoPorFila(matriz);

        for (int i = 0; i < minimosPorFila.length; i++) {
            System.out.println("Mínimo en la fila " + (i + 1) + ": " + minimosPorFila[i]);
        }

        //18. Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario, devolver una matriz nula.

        int[][] multMatriz = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] multMatriz2 = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        int[][] matrizNoCompatible = {
                {1, 2},
                {3, 4}
        };

        int[][] resultado7 = multiplicarMatrices2(multMatriz, multMatriz2);

        if (resultado7 != null) {
            System.out.println("Resultado de la multiplicación:");
            for(int i= 0; i<resultado7.length;i++){
                for(int j=0; j<resultado7[0].length;j++){
                    System.out.print(resultado7[i][j] + " ");
                }
            }
        } else {
            System.out.println("Las matrices no son compatibles para la multiplicación.");
        }

    }

    //1. Escribir un método para sumar dos matrices de enteros y devolver la matriz resultante.
    public static int[][] sumarMatrices(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    //2. Implementar un método para multiplicar dos matrices de enteros y devolver el resultado.
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        // Verificar si las matrices se pueden multiplicar
        if (matriz1[0].length != matriz2.length) {
            throw new IllegalArgumentException("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
        }
        // Inicializar la matriz resultante
        int[][] resultado = new int[matriz1.length][matriz2[0].length];

        // Realizar la multiplicación
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;
    }

    //3. Crear una función que calcule la transpuesta de una matriz.
    public static int[][] matrizTranspuesta(int[][] a) {
        //creamos la matriz transpuesta
        //el número de filas será igual al número de columnas de la matriz original
        //el número de columnnas será igual al número de filas de la matriz original
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    //4. Desarrollar un método para verificar si una matriz es simétrica (igual a su transpuesta).
    public static boolean esMatrizSimetrica(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Verificar si la matriz es cuadrada
        if (filas != columnas) {
            return false;
        }

        // Verificar si la matriz es simétrica
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                // Comparar cada elemento con su correspondiente en la transpuesta
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }

        // Si no se encontraron diferencias, la matriz es simétrica
        return true;
    }

    //5. Escribir un método que calcule el producto escalar de un vector (matriz unidimensional) por un número.
    public static int[] productoEscalar(int[] vector, int escalar) {
        int[] resultado = new int[vector.length];

        for (int i = 0; i < vector.length; i++) {
            resultado[i] = vector[i] * escalar;
        }

        return resultado;
    }

    //6. Implementar una función que calcule la suma de todos los elementos de una matriz.
    public static int sumarElementos(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }

        return suma;
    }

    //7. Desarrollar un método para encontrar el elemento máximo en una matriz y su posición.
    public static int[] elementoMax(int[][] matriz) {
        int max = matriz[0][0];
        int fila = 0;
        int columna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    fila = i + 1;
                    columna = j + 1;
                }
            }
        }

        return new int[]{max, fila, columna};
    }

    //8. Crear una función que devuelva la suma de una fila específica de una matriz
    public static int sumaFila(int[][] matriz, int numeroFila) {
        // Verificar que el número de fila sea válido
        if (numeroFila < 0 || numeroFila >= matriz.length) {
            throw new IllegalArgumentException("Número de fila no válido");
        }
        int suma = 0;
        // Sumar los elementos de la fila especificada
        for (int j = 0; j < matriz[numeroFila].length; j++) {
            suma += matriz[numeroFila][j];
        }
        return suma;
    }

    /*9. Implementar una función que determine si una matriz es diagonal (todos los elementos fuera de la diagonal principal son cero).
    Matriz Diagonal:
    Una matriz diagonal es una matriz cuadrada en la que todos los elementos fuera de la diagonal principal son iguales a 0.
    Los elementos en la diagonal principal pueden ser cualquier número, no necesariamente 1.
    Por ejemplo, una matriz diagonal 3x3 podría ser:
    D =  | 2  0  0 |
         | 0  5  0 |
         | 0  0  9 |
*/
    public static boolean esMatrizDiagonal(int[][] matriz) {
        // Verificar si la matriz es cuadrada
        if (matriz.length != matriz[0].length) {
            return false;
        }
        // Verificar si todos los elementos fuera de la diagonal principal son cero
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /*10. Crear una función que genere una matriz identidad de tamaño n.
    Matriz Identidad (o Matriz Unitaria):
    La matriz identidad, denotada generalmente como "I" o "I_n" (donde "n" representa el tamaño de la matriz cuadrada), es una matriz cuadrada especial en la que todos los elementos de la diagonal principal
    son iguales a 1 y todos los demás elementos son iguales a 0.
    Por ejemplo, la matriz identidad 3x3 sería:
    I_3 = | 1  0  0 |
          | 0  1  0 |
          | 0  0  1 |*/
    public static int[][] matrizIdentidad(int n) {
        //creamos la matriz
        //el número de filas será igual al número de columnas de la matriz original
        //el número de columnnas será igual al número de filas de la matriz original
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matriz[i][j] = 1; // Establecemos 1 en la diagonal principal
                } else {
                    matriz[i][j] = 0; // Establecemos 0 en el resto de la matriz
                }
            }
        }
        return matriz;
    }

    //11. Escribir un método para contar la cantidad de elementos pares e impares en una matriz.
    public static int[] parImpar(int matriz[][]) {
        int Pares = 0;
        int Impares = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    Pares++;
                } else if (matriz[i][j] % 2 != 0) {
                    Impares++; // Establecemos 0 en el resto de la matriz
                }
            }
        }
        return new int[]{Pares, Impares};
    }

    //12. Implementar una función que rote una matriz 90 grados en sentido horario.
    public static int[][] rotarMatriz(int[][] matriz) {
        int[][] matrizRotada = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizRotada[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }
        return matrizRotada;
    }

    //13. Desarrollar un método para encontrar el número de veces que aparece un valor específico en una matriz.
    public static int[] valorEspecifico(int[][] matriz, int n) {
        int numVeces = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == n) {
                    numVeces++;
                }
            }
        }
        return new int[]{numVeces, n};
    }

    //14. Crear una función que invierta el orden de las filas en una matriz.
    public static int[][] invertirFilas(int[][] matriz) {

        int[][] matrizInvertida = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizInvertida[matriz.length - 1 - i][j] = matriz[i][j];
            }
        }
        return matrizInvertida;
    }

    //15. Escribir un método para sumar todas las diagonales de una matriz cuadrada.
    public static int sumarDiagonales(int[][] matriz) {
        int suma = 0;

        // Sumar la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }

        // Sumar la diagonal secundaria
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }
    //17. Desarrollar un método para encontrar el valor mínimo en cada fila de una matriz y devolverlos en un arreglo.
    public static int[] minimoPorFila(int[][] matriz) {
        int[] minimosPorFila = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int minFila = matriz[i][0]; // Inicializamos con el primer elemento de la fila

            for (int j = 1; j < matriz[0].length; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                }
            }

            minimosPorFila[i] = minFila;
        }
        return minimosPorFila;
    }

    //18. Crear una función que calcule el producto de matrices de diferentes tamaños, si es posible; de lo contrario, devolver una matriz nula.
    public static int[][] multiplicarMatrices2(int[][] matriz1, int[][] matriz2) {
        // Verificar si las matrices son compatibles para la multiplicación
        if (matriz1[0].length != matriz2.length) {
            return null; // No se puede realizar la multiplicación
        }
        int[][] resultado = new int[matriz1.length][matriz2[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return resultado;
    }

}

