package c08_oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlymorphismExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Animal con el méto-do makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese méto-do con sonidos diferentes. Llama al méto-do desde una lista de Animal.
        System.out.println("Ejercicio 1");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Cow());
        for(Animal animal : animals){
            animal.makeSound();
        }

        // 2. Crea una clase Shape con el méto-do calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el Área de varias figuras.
        System.out.println("\nEjercicio 2");
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4.5));
        shapes.add(new Rectangle(8, 5));
        shapes.add(new Circle(3));
        for(Shape shape : shapes){
            System.out.println("El área de la figura es " + shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        System.out.println("\nEjercicio 3");
        Printer printer = new Printer();
        printer.print("Eduardo");
        printer.print("Kevin", 28);
        printer.print("Eduardo", 1.83);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con "Hello", y otro que reciba un nombre y salude con "Hello, [nombre]".
        System.out.println("\nEjercicio 4");
        Greeter greet = new Greeter();
        greet.greet();
        greet.greet("Lalo");

        // 5. Crea una clase Vehicle con un méto-do start(). Luego crea Car, Bike y Truck que sobrescriban ese méto-do. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        System.out.println("\nEjercicio 5");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());
        for(Vehicle vehicle : vehicles){
            vehicle.start();
        }

        // 6. Crea una clase Notification con méto-do send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        System.out.println("\nEjercicio 6");


        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        System.out.println("\nEjercicio 7");


        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        System.out.println("\nEjercicio 8");


        // 9. Crea una clase Product con el méto-do getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        System.out.println("\nEjercicio 9");


        // 10. Crea una clase Character con méto-do attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        System.out.println("\nEjercicio 10");

    }
    //1.
    public static class Animal{
        public void makeSound(){
            System.out.println("El animal hace sonido");
        }
    }
    public static class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El perro hace 'woof'");
        }
    }
    public static class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El gato hace 'meow'");
        }
    }
    public static class Cow extends Animal{
        @Override
        public void makeSound(){
            System.out.println("La vaca hace 'mou'");
        }
    }

    //2.
    public static abstract class Shape{
        public abstract double calculateArea();
    }
    public static class Circle extends Shape{
        private final double radius;
        public Circle (double radius){
            this.radius = radius;
        }
        @Override
        public double calculateArea(){
            return Math.PI * radius * radius;
        }
    }
    public static class Rectangle extends Shape{
        private final double width;
        private final double height;
        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculateArea(){
            return width * height;
        }
    }

    //3.
    public static class Printer{
        public void print(String name){
            System.out.println("Hola, mi nombre es " + name);
        }
        public void print(String name, int age){
            System.out.println("Hola, mi nombre es " + name + " y tengo " + age + " años");
        }
        public void print(String name, double height){
            System.out.println("Hola, mi nombre es " + name + " y tengo " + height + "m");
        }
    }

    //4.
    public static class Greeter{
        public void greet(){
            System.out.println("Hello");
        }
        public void greet(String name){
            System.out.println("Hello, " + name);
        }
    }

    //5.
    public static abstract class Vehicle{
        public abstract void start();
    }
    public static class Car extends Vehicle{
        @Override
        public void start(){
            System.out.println("El auto está encendiendo");
        }
    }
    public static class Bike extends Vehicle{
        @Override
        public void start(){
            System.out.println("La motocicleta está encendiendo");
        }
    }
    public static class Truck extends Vehicle{
        @Override
        public void start(){
            System.out.println("El camión está encendiendo");
        }
    }
}
