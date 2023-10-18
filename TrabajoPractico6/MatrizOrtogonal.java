public class MatrizOrtogonal {
    public static void main(String[] args) {
        /*16.	Implementar una función que verifique si una matriz es ortogonal (su transpuesta es igual a su inversa).*/

        double[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean esOrtogonal = esMatrizOrtogonal(matriz);

        if (esOrtogonal) {
            System.out.println("La matriz es ortogonal.");
        } else {
            System.out.println("La matriz no es ortogonal.");
        }
    }

    public static boolean esMatrizOrtogonal(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Paso 1: Calcular la transpuesta de la matriz
        double[][] transpuesta = new double[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Paso 2: Calcular la inversa de la matriz
        double[][] inversa = invertirMatriz(matriz);

        // Paso 3: Verificar si la transpuesta es igual a la inversa
        return sonMatricesIguales(transpuesta, inversa);
    }

    // Función para verificar si dos matrices son iguales
    private static boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        if (filas != matriz2.length || columnas != matriz2[0].length) {
            return false;
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // Función para calcular la inversa de una matriz 3x3 (puede extenderse para matrices de mayor orden)
    private static double[][] invertirMatriz(double[][] matriz) {
        double determinante = calcularDeterminante(matriz);

        if (determinante == 0) {
            // La matriz no tiene inversa si el determinante es cero
            throw new ArithmeticException("La matriz no tiene inversa.");
        }

        double[][] adjunta = calcularMatrizAdjunta(matriz);
        double[][] inversa = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                inversa[i][j] = adjunta[i][j] / determinante;
            }
        }

        return inversa;
    }

    // Función para calcular la matriz adjunta de una matriz 3x3 (puede extenderse para matrices de mayor orden)
    private static double[][] calcularMatrizAdjunta(double[][] matriz) {
        double[][] adjunta = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                double cofactor = calcularCofactor(matriz, i, j);
                adjunta[i][j] = cofactor * Math.pow(-1, i + j);
            }
        }

        return transponerMatriz(adjunta);
    }

    // Función para calcular el cofactor de un elemento en una matriz 3x3 (puede extenderse para matrices de mayor orden)
    private static double calcularCofactor(double[][] matriz, int fila, int columna) {
        double[][] submatriz = new double[matriz.length - 1][matriz[0].length - 1];

        for (int i = 0, k = 0; i < matriz.length; i++) {
            if (i == fila) {
                continue;
            }
            for (int j = 0, l = 0; j < matriz[0].length; j++) {
                if (j == columna) {
                    continue;
                }
                submatriz[k][l] = matriz[i][j];
                l++;
            }
            k++;
        }

        return Math.pow(-1, fila + columna) * calcularDeterminante(submatriz);
    }

    // Función para calcular el determinante de una matriz 3x3 (puede extenderse para matrices de mayor orden)
    private static double calcularDeterminante(double[][] matriz) {
        if (matriz.length == 2 && matriz[0].length == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        double determinante = 0;

        for (int i = 0; i < matriz.length; i++) {
            double cofactor = calcularCofactor(matriz, 0, i);
            determinante += matriz[0][i] * cofactor;
        }

        return determinante;
    }

    // Función para transponer una matriz
    private static double[][] transponerMatriz(double[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        double[][] transpuesta = new double[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }
}

