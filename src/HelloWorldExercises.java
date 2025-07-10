public class HelloWorldExercises {

    public static void main(String[] args) {
        //1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola!"
        System.out.println("Lalo");
        //2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println
        System.out.println("Hola \nMundo");
        //3. Añade un comentario sobre lo que hace cada línea del programa.
        //public class contiene el código público y main lo ejecuta
        //4. Crea un comentario en varias líneas.
        /*This
        is
        a
        multiline
        comment
         */
        //5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("28, Morado, México");
        //6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println();
        System.gc();
        //7. Utiliza varios println para imprimir una frase.
        System.out.println("This is a test");
        System.out.println("of the Java course");
        //8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println("=D");
        //9. Intenta ejecutar el programa sin el method main y observa el error.
        //No se puede ejecutar un method estático
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        //La public class debe cambiar al mismo nombre también y vuelve a compilarse
    }
}
