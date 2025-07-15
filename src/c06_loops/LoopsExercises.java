package c06_loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        System.out.println("EJERCICIO 1");
        var number = 1;
        while(number <= 10){
            System.out.println(number);
            number++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("\nEJERCICIO 2");
        var list = new ArrayList<String>();
        list.add("México");
        list.add("Alemania");
        list.add("Francia");
        list.add("Colombia");
        list.add("España");
        var index = 0;
        do {
            System.out.println(list.get(index));
            index++;
        }while(index < list.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("\nEJERCICIO 3");
        for (int iterator = 5; iterator <=50; iterator+=5){
            System.out.println(iterator);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        System.out.println("\nEJERCICIO 4");
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int iterator = 0; iterator < numbers.length; iterator++){
            sum += numbers[iterator];
        }
        System.out.println("La suma de los números en el Array es: " + sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("\nEJERCICIO 5");
        for (int iterator = 0; iterator < numbers.length; iterator++){
            System.out.println("El valor en el índice " + iterator + " del Array es " + numbers[iterator]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        System.out.println("\nEJERCICIO 6");
        HashSet<String> names = new HashSet<>();
        names.add("Eduardo");
        names.add("Ramón");
        names.add("Julia");
        names.add("Rigoberto");
        names.add("Lucho");
        for (String name : names){
            System.out.println(name);
        }
        HashMap<String, String> emails = new HashMap<>();
        emails.put("Eduardo", "correoeduardo@gmail.com");
        emails.put("Ramón", "correoramon@gmail.com");
        emails.put("Julia", "correojulia@gmail.com");
        emails.put("Rigoberto", "correorigoberto@gmail.com");
        emails.put("Lucho", "correolucho@gmail.com");
        for (String email : emails.values()){
            System.out.println(email);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("\nEJERCICIO 7");
        for (int iterator = 10; iterator >= 0; iterator--){
            System.out.println(iterator);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("\nEJERCICIO 8");
        for (int iterator = 1 ; iterator <= 20; iterator++){
            if (iterator % 3 == 0){
                continue;
            }else {
                System.out.println(iterator);
            }
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        System.out.println("\nEJERCICIO 9");
        int[] negatives = {10, 5, 2, 6, 3, -7};
        for (int digit : negatives){
            if (digit < 0){
                break;
            }
            System.out.println(digit);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("\nEJERCICIO 10");
        var num = 4;
        var factorial = 1L;
        for (var iterator = num; iterator >= 1; iterator--){
            factorial = factorial * iterator;
        }
        System.out.println("El factorial del número " + num + " es " + factorial);

    }
}
