package c06_loops;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {
    public static void main(String[] args) {
        //Loops

        //for - Controlado por contador
        for (int index = 0; index < 5; index++){
            System.out.println("Hello, Java!");
        }

        String[] colors = {"Azul", "Rojo", "Amarillo"};
        for (int index = 0; index < colors.length; index++){
            System.out.println(colors[index]);
        }

        //for each
        for(String color : colors){
            System.out.println(color);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int number : numbers){
            System.out.println(number);
        }

        HashMap<String, String> emails = new HashMap<>();
        emails.put("eduardo", "eduardo@gmail.com");
        emails.put("estrella", "estrella@gmail.com");
        emails.put("lalo", "lalo@gmil.com");

        for (Map.Entry<String, String> email : emails.entrySet()){
            System.out.println(email.getValue());
        }

        // - while

        int index = 0;
        while (index < 5) {
            System.out.println("Hola, Java!");
            index++;
        }

        index = 0;
        while (index < colors.length) {
            System.out.println(colors[index]);
            index++;
        }

        index = 0;
        boolean find = false;
        while (!find) {
            System.out.println(colors[index]);
            if (colors[index].equals("Rojo")) {
                find = true;
            }
            index++;
        }

        // - do-while

        index = 0;
        do {
            System.out.println("Hola, Java!");
            index++;
        } while (index < 0);

        // Control de bucles

        // - break

        for (String name : colors) {
            if (name.equals("Azul")) {
                break;
            }
            System.out.println(name);
        }

        // - continue

        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
