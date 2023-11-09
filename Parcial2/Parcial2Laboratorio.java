import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Parcial2Laboratorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int options;
        System.out.println();
        System.out.println("BIENVENIDO AL DETECTOR DE MUTANTES");
        System.out.println();
        ArrayList<String> DNA = get_DNA();
        while (true) {
            System.out.println("Que desea hacer? (seleccione ingresando el numero de la opcion):\n1- Analizar ADN introducido\n2- Ver ADN\n3- Salir");
            options = scanner.nextInt();
            if (options == 1) {
                if (is_mutant(DNA)){
                    System.out.println("RESULTADO DEL ANALISIS: " + is_mutant(DNA));
                    System.out.println("El ADN analizado corresponde a un MUTANTE. ");
                    System.out.println();}
                else if (!is_mutant(DNA)){
                    System.out.println("RESULTADO DEL ANALISIS: " + is_mutant(DNA));
                    System.out.println("El ADN analizado corresponde a un HUMANO. ");
                    System.out.println();
                }
            } else if (options == 2) {
                System.out.println("GRAFICO DEL ADN INTRODUCIDO: ");
                System.out.println();
                for (String fila : DNA) {
                    System.out.println(fila);
                }
                System.out.println();
            } else if (options == 3) {
                System.out.println("GRACIAS POR UTILIZAR NUESTRO DETECTOR DE MUTANTES");
                break;
            }
        }
        /*CASOS DE PRUEBA:
        ArrayList<String> prueba_Mutante = new ArrayList<String>();
        prueba_Mutante.add("atccag");
        prueba_Mutante.add("cctttt");
        prueba_Mutante.add("atggac");
        prueba_Mutante.add("aactgt");
        prueba_Mutante.add("cgagta");
        prueba_Mutante.add("actaag");

        ArrayList<String> prueba_NoMutante = new ArrayList<String>();
        prueba_NoMutante.add("atatat");
        prueba_NoMutante.add("cgcgcg");
        prueba_NoMutante.add("aaaaaa");
        prueba_NoMutante.add("cgcgcg");
        prueba_NoMutante.add("atatat");
        prueba_NoMutante.add("cgcgcg");

        ArrayList<String> prueba_Erronea = new ArrayList<String>();
        prueba_Erronea.add("123456");
        prueba_Erronea.add("actgvbn");
        prueba_Erronea.add("qqs");
        prueba_Erronea.add("acacac");
        prueba_Erronea.add("tgtgtg");
        prueba_Erronea.add("aaaaaa");*/
    }
public static ArrayList<String> get_DNA(){
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> DNA = new ArrayList<>(); // Creamos una lista vacia en donde vamos a guardar las secuencias ingresadas por el usuario para formar el ADN del humano o mutante
    System.out.println("Vamos a ingresar el ADN del humano o mutante.");
    System.out.println("El ADN de un humano o mutante se forma a partir de 6 secuencias de 6 acrónimos de bases nitrogenadas cada una.");
    System.out.println("Las bases nitrogenadas se representan con los acrónimos A, T, C y G.");

    for (int i = 0; i < 6; i++) {
        System.out.print("Ingrese la " + (i+1) + "º secuencia de 6 bases nitrogenadas (A, T, C, G) del ADN: "); // Pedimos por teclado las 6 secuencias de letras para formar la "matriz" 6x6 que representa el ADN
        String input = scanner.nextLine();
        if (input.matches(".*\\d.*")) { // Validamos que no se ingresen numeros
            System.out.println("No puedes ingresar numeros");
            i--; // Repetir la iteración para la misma fila
            continue;
        } else if ( !input.matches("[ACGTacgt]+")) { // Validamos que las letras ingresadas sean las permitidas (A,C,G,T)
            System.out.println("Secuencia invalida");
            i--;
        } else if (input.length() != 6){ // Verificamos que la entrada tenga exactamente 6 letras
            System.out.println("Por favor, ingresa una secuencia de exactamente 6 bases nitrogenadas (A, C, G o T).");
        }
        DNA.add(input.toUpperCase()); // Guardamos la secuencia ingresada en la lista "adn"
    }
    return DNA;
}
    public static boolean is_mutant(ArrayList<String>DNA) {
        int totalSequences=0; // En esta variable vamos a guardar la suma total de secuencias que encontremos en el ADN del individuo

//////////////////////////////////////////////////// BUCLE PARA RECORRER LAS FILAS DEL ADN ////////////////////////////////////////////////////

        int sequences = 0; // En la variable secuencias guardamos cuantas secuencias encontramos en cada uno de los recorridos, ya sea recorrido de filas, columnas, diagonales..
        // Por ejemplo si recorremos las filas y encontramos 2 secuencias, esas 2 secuencias las guardamos en esta variable
        for (String row : DNA) { // Con este for-each itero por cada secuencia del "ADN"
            for (int i = 0; i < row.length() - 3; i++) { // Con este for itero hasta los ultimos 4 elementos de la secuencia actual(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
                if (row.charAt(i) == row.charAt(i + 1) && row.charAt(i + 1) == row.charAt(i + 2) && row.charAt(i + 2) == row.charAt(i + 3)) { // # Comprobamos si en alguna de las secuencias/filas se cumple la condicion de 4 elementos iguales
                    if (i == 0 || row.charAt(i) != row.charAt(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la misma fila. Asi evito contar secuencias que se superpongan en la fila
                        sequences++; // Si se cumple la condicion, aumentamos el contador de secuencias en 1
                    }
                }
            }
        }
        totalSequences += sequences; // Sumamos las secuencias encontradas al contador de secuencias totales encontradas

//////////////////////////////////////////////////// BUCLE PARA RECORRER LAS COLUMNAS DEL ADN ////////////////////////////////////////////////////

        List<List<Character>> columns = new ArrayList<>(); // Creamos una lista vacia en donde vamos a almacenar las columnas para luego poder verificar si existe alguna secuencia de 4 letras iguales

        int sequences2 = 0;
        // Con este for creamos las columnas
        for (int i = 0; i < DNA.get(0).length(); i++) {
            List<Character> column = new ArrayList<>(); // En esta lista vamos a almacenar cada elemento de la columna
            for (String row : DNA) { // Con este for-each recorremos cada fila del "ADN" o "matriz"
                column.add(row.charAt(i)); // Agregamos el elemento en la posicion "i" de la fila a la lista columna
            }
            columns.add(column); // Una vez que tenemos la columna completa, la agregamos a la lista de columnas
        }
        // Recorremos cada columna para verificar en que columnas se encuenta una secuencia de 4 letras iguales consecutivas
        for (List<Character> column : columns) {
            for (int i = 0; i < column.size() - 3; i++) { // Con este for itero hasta los ultimos 4 elementos de la columna(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
                if (column.get(i) == column.get(i + 1) && column.get(i + 1) == column.get(i + 2) && column.get(i + 2) == column.get(i + 3)) { // Comprobamos si en alguna columna se cumple la condicion de 4 elementos iguales
                    if (i == 0 || column.get(i) != column.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la misma columna. Asi evito contar secuencias que se superpongan en la columna
                        sequences2++; // Si se cumple la condicion, aumentamos el contador de secuencias en 1
                    }
                }
            }
        }
        totalSequences += sequences2;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL PRINCIPAL DEL ADN ////////////////////////////////////////////////////

        List<Character> mainDiag = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal principal
        int sequences3 = 0;

        // Recorremos la DIAGONAL PRINCIPAL
        for (int i = 0; i < 6; i++) {
            mainDiag.add(DNA.get(i).charAt(i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < mainDiag.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (mainDiag.get(i) == mainDiag.get(i + 1) && mainDiag.get(i + 1) == mainDiag.get(i + 2) && mainDiag.get(i + 2) == mainDiag.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || mainDiag.get(i) != mainDiag.get(i - 1)) { // # Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences3++; //Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences3;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL SUPERIOR ////////////////////////////////////////////////////

        List<Character> upper_Diag = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal superior, la diagonal superior se encuentra por encima de la diagonal pricipal (contiene 5 letras).
        int sequences4 = 0;

        // Recorremos la DIAGONAL SUPERIOR
        for (int i = 0; i < 5; i++) {
            upper_Diag.add(DNA.get(i).charAt(i+1)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < upper_Diag.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (upper_Diag.get(i) == upper_Diag.get(i + 1) && upper_Diag.get(i + 1) == upper_Diag.get(i + 2) && upper_Diag.get(i + 2) == upper_Diag.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || upper_Diag.get(i) != upper_Diag.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences4++; // Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences4;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL POSTERIOR SUPERIOR ////////////////////////////////////////////////////

        List<Character> post_Diag = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal posterior superior, esta diagonal se encuentra por encima de la diagonal superior (contiene 4 letras)
        int sequences5 = 0;

        // Recorremos la DIAGONAL POSTERIOR SUPERIOR
        for (int i = 0; i < 4; i++) {
            post_Diag.add(DNA.get(i).charAt(i+2)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < post_Diag.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (post_Diag.get(i) == post_Diag.get(i + 1) && post_Diag.get(i + 1) == post_Diag.get(i + 2) && post_Diag.get(i + 2) == post_Diag.get(i + 3)) { // Si encontramos una secuencia de 4 elementos iguales en la diagonal, aumentamos en uno la variable secuencia
                sequences5++; // En este caso al ser una diagonal que solo contiene 4 letras, no hace falta que verifiquemos que no se superpongan secuencias
            }
        }
        totalSequences += sequences5;

//////////////////////////////////////////////////// ESTE BUCLE PARA RECORRER LA DIAGONAL INFERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> lower_Diag = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inferior, esta diagonal se encuentra por debajo de la diagonal principal (contiene 5 letras)
        int sequences6 = 0;

        // Recorremos la DIAGONAL INFERIOR
        for (int i = 0; i < 5; i++) {
            lower_Diag.add(DNA.get(i+1).charAt(i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < lower_Diag.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (lower_Diag.get(i) == lower_Diag.get(i + 1) && lower_Diag.get(i + 1) == lower_Diag.get(i + 2) && lower_Diag.get(i + 2) == lower_Diag.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || lower_Diag.get(i) != lower_Diag.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences6++; //Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences6;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL POSTERIOR INFERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> lower_Post = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal posterior inferior, esta diagonal se encuentra por debajo de la diagonal inferior (contiene 4 letras)
        int sequences7 = 0;

        // Recorremos la DIAGONAL POSTERIOR INFERIOR
        for (int i = 0; i < 4; i++) {
            lower_Post.add(DNA.get(i+2).charAt(i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < lower_Post.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (lower_Post.get(i) == lower_Post.get(i + 1) && lower_Post.get(i + 1) == lower_Post.get(i + 2) && lower_Post.get(i + 2) == lower_Post.get(i + 3)) { // Si encontramos una secuencia de 4 elementos iguales en la diagonal, aumentamos en uno la variable secuencia
                sequences7++; // En este caso al ser una diagonal que solo contiene 4 letras, no hace falta que verifiquemos que no se superpongan secuencias
            }
        }
        totalSequences += sequences7;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL INVERSA DEL ADN ////////////////////////////////////////////////////

        List<Character> reverse_Diag = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inversa
        int sequences8 = 0;

        // Recorremos la DIAGONAL INVERSA
        for (int i = 0; i < 6; i++) {
            reverse_Diag.add(DNA.get(i).charAt(5-i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < reverse_Diag.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (reverse_Diag.get(i) == reverse_Diag.get(i + 1) && reverse_Diag.get(i + 1) == reverse_Diag.get(i + 2) && reverse_Diag.get(i + 2) == reverse_Diag.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || reverse_Diag.get(i) != reverse_Diag.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences8++; //Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences8;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL INVERSA SUPERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> upper_Reverse = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inversa superior, esta diagonal se encuentra encima de la diagonal inversa (contiene 5 letras)
        int sequences9 = 0;

        // Recorremos la DIAGONAL INVERSA SUPERIOR
        for (int i = 0; i < 5; i++) {
            upper_Reverse.add(DNA.get(i).charAt(4-i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < upper_Reverse.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (upper_Reverse.get(i) == upper_Reverse.get(i + 1) && upper_Reverse.get(i + 1) == upper_Reverse.get(i + 2) && upper_Reverse.get(i + 2) == upper_Reverse.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || upper_Reverse.get(i) != upper_Reverse.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences9++; //Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences9;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL INVERSA POSTERIOR SUPERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> post_Reverse = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inversa posterior superior, esta diagonal se encuentra por encima de la diagonal inversa superior (contiene 4 letras)
        int sequences10 = 0;

        // Recorremos la DIAGONAL INVERSA POSTERIOR SUPERIOR
        for (int i = 0; i < 4; i++) {
            post_Reverse.add(DNA.get(i).charAt(3-i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < post_Reverse.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (post_Reverse.get(i) == post_Reverse.get(i + 1) && post_Reverse.get(i + 1) == post_Reverse.get(i + 2) && post_Reverse.get(i + 2) == post_Reverse.get(i + 3)) { // Si encontramos una secuencia de 4 elementos iguales en la diagonal, aumentamos en uno la variable secuencia
                sequences10++; // En este caso al ser una diagonal que solo contiene 4 letras, no hace falta que verifiquemos que no se superpongan secuencias
            }
        }
        totalSequences += sequences10;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL INVERSA INFERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> lower_Reverse = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inversa inferior, esta diagonal se encuentra por debajo de la diagonal inversa (contiene 5 letras)
        int sequences11 = 0;

        // Recorremos la DIAGONAL INVERSA INFERIOR
        for (int i = 0; i < 5; i++) {
            lower_Reverse.add(DNA.get(i+1).charAt(5-i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < lower_Reverse.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (lower_Reverse.get(i) == lower_Reverse.get(i + 1) && lower_Reverse.get(i + 1) == lower_Reverse.get(i + 2) && lower_Reverse.get(i + 2) == lower_Reverse.get(i + 3)) { // Comprobamos si en la diagonal se cumple la condicion de 4 elementos iguales
                if (i == 0 || lower_Reverse.get(i) != lower_Reverse.get(i - 1)) { // Verificamos que la secuencia actual no empiece justo despues de otra secuencia identica en la diagonal. Asi evito contar secuencias que se superpongan en la diagonal
                    sequences11++; //Si se cumple la condicion, aumentamos el contador de secuencias en 1
                }
            }
        }
        totalSequences += sequences11;

//////////////////////////////////////////////////// BUCLE PARA RECORRER LA DIAGONAL INVERSA POSTERIOR INFERIOR DEL ADN ////////////////////////////////////////////////////

        List<Character> lower_PostReverse = new ArrayList<>(); // En esta lista vamos a almacenar los elementos de la diagonal inversa posterior inferior, esta diagonal se encuentra por debajo de la diagonal inversa inferior (contiene 4 letras)
        int sequences12 = 0;

        // Recorremos la DIAGONAL INVERSA POSTERIOR INFERIOR
        for (int i = 0; i < 4; i++) {
            lower_PostReverse.add(DNA.get(i+2).charAt(5-i)); // Agregamos los elementos de la diagonal a la lista creada anteriormente
        }

        for (int i = 0; i < lower_PostReverse.size() - 3; i++) { // Con este ciclo itero hasta los ultimos 4 elementos de la diagonal(para no pasarnos del rango). Indico un limite "-3" para asegurarme que siempre queden por lo menos 4 elementos restantes por recorrer
            if (lower_PostReverse.get(i) == lower_PostReverse.get(i + 1) && lower_PostReverse.get(i + 1) == lower_PostReverse.get(i + 2) && lower_PostReverse.get(i + 2) == lower_PostReverse.get(i + 3)) { // Si encontramos una secuencia de 4 elementos iguales en la diagonal, aumentamos en uno la variable secuencia
                sequences12++; // En este caso al ser una diagonal que solo contiene 4 letras, no hace falta que verifiquemos que no se superpongan secuencias
            }
        }
        totalSequences += sequences12;

        if (totalSequences > 1) { // Si el total de secuencias encontradas es mayor a 1
            return true; // Significa que el adn analizado corresponde a un Mutante, retornamos True
        }else {
            return false; // #Si no se encontraron mas de una secuencia en el adn, retornamos False
        }
    }
}

