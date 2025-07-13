package c05_structures;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {

        //Declaración y creación
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Inserción
        names.add("Eduardo");
        names.add("Estrella");
        names.add("Lalo");
        System.out.println(names.size());

        //Acceso
        System.out.println(names.getFirst());
        System.out.println(names.get(1));
        System.out.println(names.getLast());

        //Modificación
        names.set(2, "eduardo@gmail.com");
        System.out.println(names.getLast());

        //Eliminación
        names.remove(2);
        System.out.println(names.size());
        System.out.println(names.getLast());

        //Búsqueda
        System.out.println(names.contains("Eduardo"));
        System.out.println(names.contains("eduardo@gmail.com"));

        //Limpieza
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

    }
}
