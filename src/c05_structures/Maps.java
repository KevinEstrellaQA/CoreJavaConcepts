package c05_structures;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        //Declaración y creación
        HashMap <String, String> names = new HashMap<>();
        var numbers = new HashMap<String, String>();

        //Tamaño
        System.out.println(names.size());

        //Inserción
        names.put("Eduardo", "eduardo@gmail.com");
        names.put("Estrella", "estrella@gmail.com");
        names.put("Prueba", "prueba@gmail.com");
        System.out.println(names);

        //Acceso
        System.out.println(names.get("Estrella"));
        System.out.println(names.get("Dev"));

        //Verificar elementos
        System.out.println(names.containsKey("Estrella"));
        System.out.println(names.containsValue("Dev"));

        //Eliminar elementos
        System.out.println(names.remove("Prueba"));
        System.out.println(names);

        //Limpiar HashMap
        names.clear();
        System.out.println(names);

        //Reemplazar elementos
        names.put("Eduardo", "eduardo@gmail.com");
        names.put("Estrella", "estrella@gmail.com");
        names.put("Prueba", "prueba@gmail.com");
        //names.put("Estrella", "test@gmail.com"); - Reemplaza el valor anterior

        names.replace("Prueba", "pruebaactualizada@gmail.com");
        System.out.println(names);

        //Ingresa elemento solo si no existe
        names.putIfAbsent("New Element", "estrella@gmail.com");
        System.out.println(names);

    }
}
