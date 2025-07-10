public class BeginnersExercises {

    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Eduardo";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 28;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.80;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean likeToProgram = true;
        System.out.println(likeToProgram);

        // 5. Declara una constante con tu email.
        final var EMAIL = "eduardo@gmail.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char initial = 'E';
        System.out.println(initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String local = "Coacalco";
        local = "Jaltenco";
        System.out.println(local);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 25;
        int b = 33;
        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(name.getClass().getSimpleName());
        System.out.println(((Object) height).getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int num;
        num = 100;
        System.out.println(num);

        // Otros tipos primitivos
        byte smallNumber = 127; // Rango: -128 a 127
        short mediumNumber = 30000; // Rango: -32,768 a 32,767
        long bigNumber = 1000000000L; // Para números muy grandes (añade la 'L')
        float decimalFloat = 3.14f; // Para decimales (añade la 'f')

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + decimalFloat);
    }
}
