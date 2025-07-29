package c10_extras;

import c08_oop.Classes;
import c08_oop.Person;

import java.util.Scanner;

public class Extras {
    static String globalName = "Lalo";

    public static void main(String[] args) {

        // Extras

        // null

        String name = "EDUARDO";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new Person("Eduardo", 18, "1");
        new Classes();

        // Scanner

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales

        test();

        // static

        scanner.close(); // Se cierra el scanner como buena práctica
    }

    public static void test() {
        System.out.println(globalName);
    }
}
