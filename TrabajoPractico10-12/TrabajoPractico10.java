import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Scanner;
public class TrabajoPractico10 {
    public static void main(String[] args) {
        /* Crea un conjunto de datos ficticio que contenga información variada, como direcciones de correo electrónico, números de teléfono, fechas, códigos postales, etc.*/
        ArrayList<String> conjuntoDatos = new ArrayList<>();

        conjuntoDatos.add("usuario1@example.com"); // Direcciones de correo electrónico
        conjuntoDatos.add("123-456-7890"); // Números de teléfono
        conjuntoDatos.add("2023-11-20"); // Fechas
        conjuntoDatos.add("ABCDE12345"); // Códigos postales

        System.out.println("Conjunto de datos ficticios:");
        for (String dato : conjuntoDatos) {
            System.out.println(dato);
        }


        /* Diseña un programa en un lenguaje de programación (Java) que utilice expresiones regulares para validar y verificar los datos en tu conjunto de datos.
         Por ejemplo, puedes verificar si una dirección de correo electrónico es válida o si un número de teléfono sigue un formato específico.*/


        String correoEjemplo = "usuario1@example.com";
        String telefonoEjemplo = "123-456-7890";
        String regexCorreo = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        String regexTelefono = "^\\d{3}-\\d{3}-\\d{4}$";

        Pattern patronCorreo = Pattern.compile(regexCorreo);
        Pattern patronTelefono = Pattern.compile(regexTelefono);

        Matcher matcherCorreo = patronCorreo.matcher(correoEjemplo);
        if (matcherCorreo.matches()) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }

        Matcher matcherTelefono = patronTelefono.matcher(telefonoEjemplo);
        if (matcherTelefono.matches()) {
            System.out.println("El número de teléfono es válido.");
        } else {
            System.out.println("El número de teléfono no es válido.");
        }

        /* Validar entrada de datos en un arraylist y aplicarlo. */

        ArrayList<String> correosElectronicos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese direcciones de correo electrónico (o escriba 'salir' para terminar):");

        String entrada;
        do {
            entrada = scanner.nextLine();
            if (entrada.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                correosElectronicos.add(entrada);
            } else if (!entrada.equals("salir")) {
                System.out.println("La dirección de correo electrónico no es válida. Intente de nuevo.");
            }
        } while (!entrada.equals("salir"));

        System.out.println("Direcciones de correo electrónico válidas almacenadas en el ArrayList:");
        for (String correos : correosElectronicos) {
            System.out.println(correos);
        }

        // Comprobar si el String cadena no acaba con un dígito.
        String cadena = "Ejemplo123";

        String expresionRegular2 = ".*[^0-9]$";

        Pattern patron2 = Pattern.compile(expresionRegular2);

        Matcher matcher2 = patron2.matcher(cadena);

        if (matcher2.matches()) {
            System.out.println("La cadena no termina con un dígito.");
        } else {
            System.out.println("La cadena termina con un dígito o está vacía.");
        }

        // Comprobar si el String cadena no empieza por un dígito.

        String expresionRegular3 = "^[^0-9].*";

        Pattern patron3 = Pattern.compile(expresionRegular3);

        Matcher matcher3 = patron3.matcher(cadena);

        if (matcher3.matches()) {
            System.out.println("La cadena no empieza con un dígito.");
        } else {
            System.out.println("La cadena empieza con un dígito o está vacía.");
        }

        //Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10
        String expresionRegular4 = "^[a-zA-Z]{5,10}$";

        Pattern patron4 = Pattern.compile(expresionRegular4);

        Matcher matcher4 = patron4.matcher(cadena);

        if (matcher4.matches()) {
            System.out.println("La cadena cumple con la condición de 5 a 10 letras.");
        } else {
            System.out.println("La cadena no cumple con la cantidad de letras especificada.");
        }

        // Validar el ingreso de un DNI (xx-xxx-xxx).
        String dni = "12-345-678";
        String expresionRegular5 = "^\\d{2}-\\d{3}-\\d{3}$";

        Pattern patron5 = Pattern.compile(expresionRegular5);

        Matcher matcher5 = patron5.matcher(dni);

        if (matcher5.matches()) {
            System.out.println("El formato del DNI es válido.");
        } else {
            System.out.println("El formato del DNI no es válido.");
        }

        // Guardar en un arraylist una serie de mails, pero antes de ser guardados deben cumplir con las condiciones de las expresiones regulares.
        ArrayList<String> correosElectronicos2 = new ArrayList<>();

        System.out.println("Ingrese direcciones de correo electrónico (o escriba 'salir' para terminar):");

        String entrada2;
        do {
            entrada2 = scanner.nextLine();
            if (entrada2.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
                correosElectronicos2.add(entrada2);
            } else if (!entrada2.equals("salir")) {
                System.out.println("La dirección de correo electrónico no es válida. Intente de nuevo.");
            }
        } while (!entrada2.equals("salir"));

        System.out.println("Direcciones de correo electrónico válidas almacenadas en el ArrayList:");
        for (String correos2 : correosElectronicos2) {
            System.out.println(correos2);
        }

        // Comprobar si el String cadena contiene “abc”.
        Pattern patron6 = Pattern.compile("abc", Pattern.CASE_INSENSITIVE);
        Matcher matcher6 = patron6.matcher(cadena);

        if (matcher6.find()) {
            System.out.println("La cadena contiene la subcadena 'abc'.");
        } else {
            System.out.println("La cadena no contiene la subcadena 'abc'.");
        }

    }
}
