package c03_strings;

import java.sql.SQLOutput;

public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        System.out.println("*****CADENAS CONCATENADAS*****");
        System.out.println("Hola, mi nombre es " + "Eduardo \n");

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("*****LONGITUD DE UNA CADENA*****");
        String text = "Hola. Este es un texto de prueba";
        System.out.println("El texto es: " + text);
        System.out.println("El texto tiene una longitud de: " + text.length() + " carácteres" + "\n");

        // 3. Muestra el primer y último carácter de un string.
        System.out.println("*****PRIMER Y ÚLTIMO CARÁCTER DE UN STRING*****");
        System.out.println("El texto es: " + text);
        System.out.println("El primer carácter es: " + text.charAt(0));
        System.out.println("El último carácter es: " + text.charAt(text.length()-1) + "\n");

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println("*****TEXTO EN MAYÚSCULAS Y MINÚSCULAS*****");
        System.out.println("El texto es: " + text);
        System.out.println("Texto en mayúsculas: " + text.toUpperCase());
        System.out.println("Texto en minúsculas: " + text.toLowerCase() + "\n");

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("*****COMPROBACIÓN DE TEXTO*****");
        System.out.println("El texto es: " + text);
        var word = "texto";
        System.out.println("¿El texto contiene la palabra: " + word + "?: " + text.contains(word) + "\n");

        // 6. Formatea un string con un entero.
        System.out.println("*****FORMATO DE UN STRING CON ENTERO*****");
        var country = "México";
        var states = 32;
        System.out.println(String.format("El país %s tiene un total de %d estados", country, states) + "\n");

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("*****ELIMINAR ESPACIOS EN BLANCO DE UN STRING*****");
        System.out.println("     Este texto tiene espacios     ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guion (-).
        System.out.println("*****SUSTITUIR ESPACIOS POR GUION (-)*****");
        System.out.println("El texto es: " + text);
        System.out.println("El texto sustituido es: " + text.replace(" ", "-") + "\n");

        // 9. Comprueba si dos strings son iguales.
        System.out.println("*****COMPARANDO SI DOS STRINGS SON IGUALES*****");
        var string1 = "¿Cómo estás?";
        var string2 = "Cómo estás?";
        System.out.println("El string 1 es: " + string1);
        System.out.println("El string 2 es: " + string2);
        System.out.println("¿Los strings sin iguales?: " + string1.equals(string2) + "\n");

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println("*****COMPROBANDO LA LONGITUD DE DOS STRINGS*****");
        System.out.println("El string 1 es: " + string1);
        System.out.println("El string 2 es: " + string2);
        System.out.println("¿Los strings tienen la misma longitud?: " + (string1.length() == string2.length()));

    }
}
