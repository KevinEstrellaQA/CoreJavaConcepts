package c05_structures;

public class Arrays {

    public static void main(String[] args) {
        //Declaración de Arrays
        int[] numbers= new int[3];
        System.out.println(numbers);

        String[] names = {"Eduardo", "Estrella", "Lalo"};
        System.out.println(names);

        //Acceso a los Arrays
        System.out.println(numbers[1]);
        System.out.println(names[0]);
        System.out.println((new String[3])[1]);


        //Modificación de datos
        numbers[1] = 30;
        System.out.println(numbers[1]);

        names[0] = "Prueba";
        System.out.println(names[0]);

        boolean[] booleans = new boolean[5];
        System.out.println(booleans[2]);

        //Por defecto, los valores en los arrays enteros son cero, en los String son null y en los boolean son false

    }
}
