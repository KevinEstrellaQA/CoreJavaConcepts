package c03_strings;

public class Strings {
    public static void main(String[] args) {

        String name = "Eduardo";
        //Al ser una clase, se pueden crear objetos desde String, pero es redundante
        var surname = new String ("Estrella");

        //Concatenación de Strings
        System.out.println(name + " " + surname); //De igual forma, se puede usar concat()

        //length() - Longitud de un String
        System.out.println(name.length());

        //charAt() - Obtener el caracter de un String en una posición específica
        System.out.println(surname.charAt(surname.length()-1));

        //substring() - Divide un String de acuerdo a los parámetros deseados en una subcadena
        System.out.println(surname.substring(2));
        System.out.println(surname.substring(1,4));

        //Mayúsculas y minúsculas
        System.out.println(surname.toUpperCase());
        System.out.println(surname.toLowerCase());

        //contains() - Valida si un String contiene un texto predefinido y regresa un boolean
        System.out.println("Hello, Java".contains("ava"));
        System.out.println("Hello, Java".toUpperCase().contains("AVA"));

        //equals() - Comparar Strings para validar si son iguales
        System.out.println(name.equals("Eduardo"));
        System.out.println(name.equals("eduardo"));
        System.out.println(name.equalsIgnoreCase("EdUaRdO"));

        //trim() - Procesa el String para eliminar espacios al inicio y al final del texto
        System.out.println(" Hola, mi nombre es Eduardo ".trim());

        //replace() - Reemplaza caracteres específicos por caracteres nuevos
        System.out.println(" Hola, mi nombre es Eduardo ".replace(" ", ""));

        //format() - Permite formatear textos para hacerlos más mantenibles, a comparación de la concatenación
        var age = 28;
        System.out.println(String.format("Hola, mi nombre es %s. Tengo %d años", name, age));

    }
}
