package c09_exceptions;

import java.awt.font.TextMeasurer;
import java.util.ArrayList;

public class ExceptionsExercises {
    public static void main(String[] args) {
        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        System.out.println("Ejercicio 1:");
        var num1 = 10;
        var num2 = 0;
        try{
            System.out.println("Resultado : " + num1 / num2);
        }catch (ArithmeticException e){
            System.out.println("Error al dividir entre cero: " + e.getMessage());
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        System.out.println("\nEjercicio 2:");
        String[] names = {"Eduardo", "Lalo", "Kevin"};
        try{
            System.out.println("El primer elemento es: " + names[0]);
            System.out.println("El elemento en el índice 5 es: " + names[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error en el índexado del array: " + e.getMessage());
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        System.out.println("\nEjercicio 3:");
        String name = null;
        try{
            System.out.println("La longitud del nombre es: " + name.length());
        }catch (NullPointerException e){
            System.out.println("Error en string nulo: " + e.getMessage());
        }

        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
        System.out.println("\nEjercicio 4:");
        try{
            System.out.println("El primer texto a número es " + textToNumber("15"));
            System.out.println("El segundo texto a número es " + textToNumber("a"));
        }catch (NumberFormatException e){
            System.out.println("Formato de entrada inválido: " + e.getMessage());
        }

        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.
        System.out.println("\nEjercicio 5:");
        int[] numbers = {1, 2, 3, 4, 5};
        try{
            System.out.println("El dato en el índice 5 es: " + numbers[5]);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Error en el indexado: " + e.getMessage());
        }finally {
            System.out.println("Fin del ejercicio 5");
        }

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
        System.out.println("\nEjercicio 6:");
        try{
            System.out.println("El número es: " + checkIfNegative(9));
        }catch (IllegalArgumentException e){
            System.out.println("Números negativos no admitidos: " + e.getMessage());
        }
        try{
            System.out.println("El número es: " + checkIfNegative(-9));
        }catch (IllegalArgumentException e){
            System.out.println("Números negativos no admitidos: " + e.getMessage());
        }

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        System.out.println("\nEjercicio 7:");
        TemperatureChecker temp = new TemperatureChecker();
        try{
            temp.checkTemperature(35.02);
        }catch (InvalidTemperature e){
            System.out.println("Temperatura no válida: " + e.getMessage());
        }
        try{
            temp.checkTemperature(50.02);
        }catch (InvalidTemperature e){
            System.out.println("Temperatura no válida: " + e.getMessage());
        }

        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        System.out.println("\nEjercicio 8:");
       int[] numb = {10, 5};
        try{
            var result = numb[0] + numb[2];
            System.out.println("El resultado de la suma es: " + result);
        }catch (ArithmeticException e){
            System.out.println("Error aritmético: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error de indexado: " + e.getMessage());
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        System.out.println("\nEjercicio 9:");
        try{
            checkPassword("ThisIsAPassword");
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            checkPassword("Test");
        }catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }

        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        System.out.println("\nEjercicio 10:");
        LoginSystem user = new LoginSystem();
        try{
            user.checkCredentials("test@gmail.com", "test");

        }catch(LoginFailedException e){
            System.out.println("Error en login: " + e.getMessage());
        }
        try{
            user.checkCredentials("teseet@gmail.com", "test");

        }catch(LoginFailedException e){
            System.out.println("Error en login: " + e.getMessage());
        }

    }

    //Función de ejercicio 4.
    public static int textToNumber(String number){
        return Integer.parseInt(number);
    }

    //Función de ejercicio 6
    public static int checkIfNegative(int number) throws IllegalArgumentException{
        if (number < 0){
            throw new IllegalArgumentException("No se permiten números negativos");
        }else {
            return number;
        }
    }

    //Clase y excepción personalizada de ejercicio 7
    public static class TemperatureChecker{
        public void checkTemperature(double temperature) throws InvalidTemperature{
            if(temperature < -50 || temperature > 50){
                throw new InvalidTemperature("La temperatura debe estár entre -50 y 50");
            }else{
                System.out.println("Temperatura válida: " + temperature);
            }
        }
    }
    public static class InvalidTemperature extends Exception{
        public InvalidTemperature(String message){
            super(message);
        }
    }

    //Función de ejercicio 9
    public static void checkPassword(String pass) throws IllegalArgumentException{
        if(pass.length() < 8){
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 carácteres");
        }else{
            System.out.println("Contraseña válida");
        }
    }

    //Clase y excepción personalizada de ejercicio 10
    public static class LoginSystem{
        private final String email = "test@gmail.com";
        private final String pass = "test";
        public void checkCredentials(String email, String pass) throws LoginFailedException{
            if(email.equals(this.email) && pass.equals(this.pass)){
                System.out.println("Acceso válido");
            }else {
                throw new LoginFailedException("Credenciales inválidas");
            }
        }
    }
    public static class LoginFailedException extends Exception{
        public LoginFailedException(String message){
            super(message);
        }
    }
}
