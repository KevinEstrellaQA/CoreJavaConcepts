package c04_conditionals;

public class ConditionalsExercises {
    public static void main(String[] args) {

        System.out.println("1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).");
        var age = 20;
        System.out.println("La edad del usuario es: " + age);
        if (age >+ 18){
            System.out.println("El usuario puede votar");
        }else{
            System.out.println("El usuario no puede votar");
        }

        System.out.println("\n2. Declara dos números y muestra cuál es mayor, o si son iguales.");
        var firstNumber = 150;
        var secondNumber = 150;
        System.out.println("El primer número es: " + firstNumber + "\nEl segundo número es: " + secondNumber);
        if(firstNumber > secondNumber){
            System.out.println("El primer número es mayor que el segundo número");
        } else if (secondNumber > firstNumber){
            System.out.println("El segundo número es mayor que el primer número");
        }else{
            System.out.println("Ambos números son iguales");
        }

        System.out.println("\n3. Dado un número, verifica si es positivo, negativo o cero.");
        var number = 0;
        System.out.println("El número es: " + number);
        if (number < 0){
            System.out.println("El número es menor a cero");
        }else if (number > 0){
            System.out.println("El número es mayor a cero");
        }else{
            System.out.println("El número es cero");
        }

        System.out.println("\n4. Crea un programa que diga si un número es par o impar.");
        var oddNumber = 44;
        System.out.println("El número es: " + oddNumber);
        System.out.println((oddNumber % 2 == 0) ? "El número: " + oddNumber + " es par" : "El número: " + oddNumber + " es impar");

        System.out.println("\n5. Verifica si un número está en el rango de 1 a 100.");
        var numberInRange =100;
        System.out.println("El número es: " + numberInRange);
        if(numberInRange >= 1 && numberInRange <= 100){
            System.out.println("El número: " + numberInRange + " está en el rango de 1 a 100");
        }else{
            System.out.println("El número: " + numberInRange + " no está en el rango de 1 a 100");
        }

        System.out.println("\n6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.");
        var day = 5;
        System.out.println("El día es: " + day);
        switch (day){
            case 1:
                System.out.println("El día " + day + " corresponde a Lunes");
                break;
            case 2:
                System.out.println("El día " + day + " corresponde a Martes");
                break;
            case 3:
                System.out.println("El día " + day + " corresponde a Miércoles");
                break;
            case 4:
                System.out.println("El día " + day + " corresponde a Jueves");
                break;
            case 5:
                System.out.println("El día " + day + " corresponde a Viernes");
                break;
            case 6:
                System.out.println("El día " + day + " corresponde a Sábado");
                break;
            case 7:
                System.out.println("El día " + day + " corresponde a Domingo");
            default:
                System.out.println("No existe día que corresponda con: " + day);
        }

        System.out.println("\n7. Simula un sistema de notas: muestra 'Sobresaliente', 'Aprobado' o 'Suspenso' según la nota (0-100).");
        var grade = 85;
        System.out.println("La nota es: " + grade);
        if (grade >=0 && grade < 60){
            System.out.println("La nota " + " es suspensoria");
        }else if (grade >= 60 && grade < 90){
            System.out.println("La nota " + grade + " es aprobatoria");
        }else if (grade >= 90 && grade <= 100){
            System.out.println("La nota " + grade + " es sobresaliente");
        }else {
            System.out.println("Nota no válida");
        }

        System.out.println("\n8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.");
        var ageCinema = 17;
        boolean isAcompanied = false;
        System.out.println("La edad es: " + ageCinema + "\n¿Está acompañado? " + isAcompanied);
        if(ageCinema >= 15 || isAcompanied){
            System.out.println("Si se puede ingresar al cine");
        }else{
            System.out.println("No se puede ingresar al cine");
        }

        System.out.println("\n9. Crea un programa que diga si una letra es vocal o consonante.");
        var character = 'y';
        System.out.println("La letra es: " + character);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
            System.out.println("La letra es vocal");
        }else{
            System.out.println("La letra es consonante");
        }

        System.out.println("\n10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.");
        int num1 = 1000, num2 = 200, num3 = 30;
        System.out.println("El primer número es: " + num1);
        System.out.println("El segundo número es: " + num2);
        System.out.println("El tercer número es: " + num3);
        if (num1 > num2 && num1 > num3){
            System.out.println("El número " + num1 + " es mayor que el número " + num2 + " y el número " + num3);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El número " + num2 + " es mayor que el número " + num1 + " y el número " + num3);
        }else {
            System.out.println("El número " + num3 + " es mayor que el número " + num1 + " y el número " + num2);
        }

    }
}
