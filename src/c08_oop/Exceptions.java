package c08_oop;
// Importante: debes realizar los import correspondientes de la clases CustomException y ThrowExample

public class Exceptions {

    public static void main(String[] args) {

        // Manejo de excepciones

        // try catch
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }

        // try con mÃºltiples catch
        try {
            var result = 10 / 5;
            System.out.println(result);

            var name = "Brais";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        } catch (ArithmeticException e) {
            System.out.println("Cuidado con dividir algo que no puedes: " + e);
        } catch (NullPointerException e) {
            System.out.println("Ha ocurrido un null pointer mÃ­tico!");
        } catch (Exception e) {
            System.out.println("Se ha producido un error no esperado");
        }

        // finally
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Fin del bloque try-catch");
        }

        // throw
        var throwExample = new ThrowExample();
        try {
            throwExample.checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error revisando la edad: " + e.getMessage());
        }

        // ExcepciÃ³n personalizada
        try {
            throwExample.checkScore(450);
        } catch (CustomException e) {
            System.out.println("Error revisando la puntuaciÃ³n: " + e.getMessage());
        }

        System.out.println("Fin");
    }
}