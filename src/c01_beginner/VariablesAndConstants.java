package c01_beginner;

public class VariablesAndConstants {

    public static void main(String[] args) {
        //Variables
        String name = "Eduardo";
        System.out.println(name);
        name = "Lalo";
        System.out.println(name);

        //Constantes - Se utiliza la palabra reservada final - Como buena práctica se identifican en mayúsculas
        final String EMAIL = "test@gmail.com";
        System.out.println(EMAIL);
        //EMAIL = "new@gmail.com"; Error, las constantes no cambian

        //Var - Se adaptan al tipo de contenido dinámicamente
        var edad = 28;
        System.out.println(edad);
        var lastName = "Estrella";
        System.out.println(lastName);
    }
}
