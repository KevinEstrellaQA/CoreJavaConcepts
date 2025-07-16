package c07_functions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class FunctionsExercises {
    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        welcome();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        welcome("Eduardo");

        // 3. Haz un méto-do que reciba dos números enteros y devuelva su resta.
        var num1 = 40;
        var num2 = 14;
        var sub = substraction(num1, num2);
        System.out.println("El resultado de la resta de " + num1 + " menos " + num2 + " es: " +  + sub);

        // 4. Crea un méto-do que calcule el cuadrado de un número (n * n).
        var number = 5;
        var squaredNumber= squareNumber(number);
        System.out.println("El cuadrado del número " + number + " es: " + squaredNumber);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        var checkIfEven = isEven(40);
        System.out.println("¿El número es par? " + checkIfEven);

        // 6. Crea un méto-do que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        var age = 20;
        System.out.println("¿La persona es mayor de edad?: " + isAdult(age));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        var text = "This is a text to validate the length of the String";
        System.out.println("La longitud del String es: " + lengthOfString(text));

        // 8. Crea un méto-do que reciba un array de enteros, calcula su media y lo retorna.
        int[] numbers = {1, 2, 3, 4, 5};
        var average = average(numbers);
        System.out.println("La media del arreglo de números es: " + average);

        // 9. Escribe un méto-do que reciba un número y retorna su factorial.
        var num = 4;
        var factorial = factorial(num);
        System.out.println("El factorial del número " + num + " es " + factorial);

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        ArrayList<String> elements= new ArrayList<>();
        elements.add("Enchilada");
        elements.add("Eduardo");
        elements.add("Rhyno");
        elementsOfArray(elements);

    }

    public static void welcome(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void welcome(String name){
        System.out.println("!Hola, " + name + "!");
    }

    public static int substraction(int num1, int num2){
        return num1 - num2;
    }

    public static int squareNumber(int num){
        return num * num;
    }

    public static boolean isEven(int num){
        boolean isEven = true;
        if (num % 2 == 0){
            return isEven;
        }
        return !isEven;
    }

    public static boolean isAdult(int edad){
        return edad >= 18;
    }

    public static int lengthOfString(String text){
        return text.length();
    }

    public static int average(int[] numbers){
        var result = 0;
        for (int number : numbers){
            result += number;
        }
        return result / numbers.length;
    }

    public static int factorial(int number){
        var factorial = 1;
        for (var index = number; index >= 1; index--){
            factorial *= index;
        }
        return factorial;
    }

    public static void elementsOfArray(ArrayList<String> elements){
        for (String element : elements){
            System.out.println(element);
        }
    }

}