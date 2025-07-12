package c04_conditionals;

public class Conditionals {
    public static void main(String[] args) {

        var age = 18;

        System.out.println(age >+ 18);

        //if
        if(age == 18){
            System.out.println("Has cumplido la mayoría de edad");
        }else if (age >+ 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

        //switch
        var day = 4;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es Lunes, Martes o Miércoles");
        }

    }
}
