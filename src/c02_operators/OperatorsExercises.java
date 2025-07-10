package c02_operators;

public class OperatorsExercises {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        int a = 10, b = 30;
        int sum = a + b;
        int substraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int module = a % b;
        System.out.println("//OPERADORES\\");
        System.out.println("Valor de a = " + a + " Valor de b = " + b);
        System.out.println("Suma: " + sum);
        System.out.println("Resta: " + substraction);
        System.out.println("Multiplicación: " + multiplication);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + module);

        // 2. Crea una variable para cada tipo de operación de asignación.
        int x = 100;
        System.out.println("Valor inicial de x = " + x);
        x+=10;
        System.out.println("x+=10 = " + x);
        x-=20;
        System.out.println("x-=20 = " + x);
        x*=30;
        System.out.println("x*=30 = " + x);
        x/=40;
        System.out.println("x/=40 = " + x);
        x%=50;
        System.out.println("x%=50 = " + x);
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        System.out.println(10==10);
        System.out.println(10>=5);
        System.out.println(30<210);
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(40==20);
        System.out.println(20<10);
        System.out.println(5>=8);
        // 5. Utiliza el operador lógico and.
        System.out.println(10==10 && 20>=15);
        // 6. Utiliza el operador lógico or.
        System.out.println(3<5 || 5>3);
        // 7. Combina ambos operadores lógicos.
        
        // 8. AÃ±ade alguna negación.

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
