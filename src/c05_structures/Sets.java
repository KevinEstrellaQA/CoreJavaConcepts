package c05_structures;

import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        //Declaración y creación
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //Tamaño
        System.out.println(names.size());

        //Inserción
        names.add("Eduardo");
        names.add("Estrella");
        names.add("Lalo");
        System.out.println(names.size());

        //Acceso - No se puede acceder a los datos porque no hay indice. Los datos son almacenados aleatoriamente
        //System.out.println(names.getFirst());
        //System.out.println(names.get(1));
        //System.out.println(names.getLast());

        //Modificación - Tampoco es posible modificarlos debido a que se almacenan aleatoriamente
        //names.set(2, "eduardo@gmail.com");
        //System.out.println(names.getLast());

        //Eliminación
        names.remove("Lalo");
        System.out.println(names.size());

        //Búsqueda
        System.out.println(names.contains("Eduardo"));
        System.out.println(names.contains("eduardo@gmail.com"));

        //Limpieza
        System.out.println(names);
        names.clear();
        System.out.println(names.size());

        //Conjuntos
        var colors = new HashSet<String>();
        var countries = new HashSet<String>();

        colors.add("Azul");
        colors.add("Amarillo");
        colors.add("Rojo");
        System.out.println(colors);

        countries.add("México");
        countries.add("España");
        countries.add("Canadá");
        //countries.add("Azul");
        System.out.println(countries);

        //Unión - Une elementos del conjunto 2 al conjunto 1
        colors.addAll(countries);
        System.out.println(colors);

        //Diferencia - Elimina los elementos del conjunto 2 del conjunto 1
        //colors.removeAll(countries);
        System.out.println(colors);

        //Intersección - Imprime solo los elementos que coinciden en ambos conjuntos
        colors.retainAll(countries);
        System.out.println(colors);

    }
}
