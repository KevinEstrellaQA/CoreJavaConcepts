package c05_structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("La longitud del Array es: " + array.length);

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println("El valor del índice 3 antes de modificarlo es: " + array[3]);
        array[3] = 45;
        System.out.println("El valor del índice 3 después de modificarlo es: " + array[3]);

        // 3. Crea un ArrayList vacío.
        var arrayList = new ArrayList<Integer>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Los elementos en el ArrayList son: " + arrayList);
        arrayList.removeLast();
        System.out.println("Los nuevos elementos en el ArrayList son: " + arrayList);

        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> countries = new HashSet<>();
        countries.add("México");
        countries.add("España");
        System.out.println("El HashSet con dos valores es: " + countries);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        countries.add("México");
        countries.add("Perú");
        System.out.println("El HashSet con un nuevo valor y valor repetido es: " + countries);

        // 7. Elimina uno de los elementos del HashSet.
        countries.remove("Perú");
        System.out.println("El HashSet con elemento eliminado es: " + countries);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String, Long> personalInfo = new HashMap<>();
        personalInfo.put("Eduardo", 5534675689L);
        personalInfo.put("Pedro", 5598976846L);
        personalInfo.put("Roberto", 5527856737L);
        System.out.println("Los valores en el HashMap son: " + personalInfo);

        // 9. Modifica uno de los contactos y elimina otro.
        personalInfo.replace("Pedro", 5511223344L);
        personalInfo.remove("Roberto");
        System.out.println("Los nuevos valores en el HashMap son: " + personalInfo);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] colorsArray = new String[3];
        colorsArray[0] = "Azul";
        colorsArray[1] = "Morado";
        colorsArray[2] = "Amarillo";
        System.out.println("Los elementos en el Array son: " + colorsArray[0] + ", " + colorsArray[1] + ", " + colorsArray[2]);

        var colorsList = new ArrayList<String>(List.of(colorsArray));
        System.out.println("Los elementos en el ArrayList son: " + colorsList);

        var colorsSet = new HashSet<String>(colorsList);
        System.out.println("Los elementos en el HashSet son: " + colorsSet);

        var colorsMap = new HashMap<String, String>();
        for(String color : colorsSet){
            colorsMap.put(color, color);
        }
        System.out.println("Los elementos en el HashMap son: " + colorsMap);

    }
}
