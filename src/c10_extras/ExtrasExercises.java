package c10_extras;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ExtrasExercises {

    static String globalMessage = "Este es un mensaje global";
    static String userName = "Future QA Developer";

    public static void main(String[] args) {
        // 1. Crea una variable de tipo String inicializada como null y verifica que no está vacía antes de usarla.
        System.out.println("Ejercicio 1.");
        String customName = null;
        if(customName != null){
            System.out.println("Hola, mi nombre es " + customName);
        }else{
            System.out.println("¡La variable es nula!");
        }
        customName = "Eduardo";
        if(customName != null){
            System.out.println("Hola, mi nombre es " + customName);
        }else{
            System.out.println("¡La variable es nula!");
        }

        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner.
        System.out.println("\nEjercicio 2.");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingresa tu nombre:");
            var name = scanner.nextLine();
            System.out.println("Ingresa tu edad:");
            var age = scanner.nextInt();
            System.out.println("Bienvenido, " + name + ", tienes " + age + " años.");
        }catch (InputMismatchException e){
            System.out.println("Entrada no válida: " + e.getMessage());
        }

        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala.
        System.out.println("\nEjercicio 3.");
        final int MAX_SCORE = 100;
        System.out.println("El puntaje es: " + MAX_SCORE);

        // 4. Crea una variable global message y otra local message dentro del méto-do main(). Muestra ambas.
        System.out.println("\nEjercicio 4.");
        String localMessage = "Este es un mensaje local";
        System.out.println("La variable global contiene: " + globalMessage);
        System.out.println("La variable local contiene: " + localMessage);

        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo.
        System.out.println("\nEjercicio 5.");
        System.out.println("Ingresa un número");
        try {
            var number = scanner.nextInt();
            if (number < 0) {
                System.out.println("El número es negativo");
            }else if(number > 0) {
                System.out.println("El número es positivo");
            }else{
                System.out.println("El número es cero");
            }
        }catch(InputMismatchException e){
            System.out.println("Entrada no válida: " + e.getMessage());
        }

        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        System.out.println("\nEjercicio 6.");
        System.out.println(Message.staticMessage);

        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        System.out.println("\nEjercicio 7.");
        Random random = new Random();
        var randomNumber = random.nextInt(1, 10);
        System.out.println("El número generado es: " + randomNumber);

        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        System.out.println("\nEjercicio 8.");
        DocumentedClass doc = new DocumentedClass();
        doc.showInfo();

        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        System.out.println("\nEjercicio 9.");
        User user = new User();
        user.printInfo();

        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.
        System.out.println("\nEjercicio 10.");
        Numbers numbers = new Numbers(10, 5);
        numbers.displayNumbers();
        numbers.addition();

    }

    //Clase de ejercicio 6
    public static class Message{
        static String staticMessage = "Este mensaje pertenece a la clase del ejercicio 6";
    }

    //Clase de ejercicio 8
    public static class DocumentedClass{
        private final String infoMessage;
        public DocumentedClass(){
            this.infoMessage = "Este mensaje es informativo";
        }
        public void showInfo(){
            System.out.println("El mensaje documentado es: " + infoMessage);
        }
    }

    //Clase de ejercicio 9
    public static class User{
        final String APP_NAME = "Aplicación Java";
        public void printInfo(){
            System.out.println("El nombre del usuario es: " + userName + ", y el nombre de la app es: " + APP_NAME);
        }
    }

    //Clase para debug de ejercicio 10
    public static class Numbers {
        private final int num1;
        private final int num2;
        public Numbers(int num1, int num2){
            this.num1 = num1;
            this.num2 = num2;
        }
        public void displayNumbers(){
            System.out.println("El valor del primer número es: " + num1);
            System.out.println("El valor del segundo número es: " + num2);
        }
        public void addition(){
            System.out.println("La suma de los valores es: " + (num1 + num2));
        }
    }
}
