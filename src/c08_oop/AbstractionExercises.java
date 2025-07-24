package c08_oop;

import java.util.ArrayList;

public class AbstractionExercises {
    public static void main(String[] args) {
        // 1. Crea una clase abstracta Shape con el méto-do calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.
        System.out.println("Ejercicio 1");
        Shape circle = new Circle(2.5);
        Shape rectangle = new Rectangle(10.5, 5.5);
        System.out.println("El área del círculo es " + circle.calculateArea());
        System.out.println("El área del rectángulo es " + rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el méto-do play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        System.out.println("\nEjercicio 2");
        Playable instrument1 = new Guitar();
        Playable instrument2 = new Piano();
        instrument1.play();
        instrument2.play();

        // 3. Define una clase abstracta Animal con el méto-do makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        System.out.println("\nEjercicio 3");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        for(Animal animal : animals){
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        System.out.println("\nEjercicio 4");
        Drawable circleDraw = new CircleDraw();
        Drawable squareDraw = new SquareDraw();
        Drawable triangleDraw = new TriangleDraw();
        circleDraw.draw();
        squareDraw.draw();
        triangleDraw.draw();

        // 5. Crea una clase abstracta Employee con un méto-do calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        System.out.println("\nEjercicio 5");
        Employee employee1 = new FullTimeEmployee(30);
        Employee employee2 = new PartTimeEmployee(30);
        System.out.println("El salario mensual del empleado a tiempo completo es $" + employee1.calculateSalary());
        System.out.println("El salario mensual del empleado a medio tiempo es $" + employee2.calculateSalary());

        // 6. Crea una interfaz Movable con el méto-do move(). Haz que las clases Car y Robot implementen ese méto-do con comportamientos diferentes.
        System.out.println("\nEjercicio 6");
        Movable car = new Car();
        Movable robot = new Robot();
        car.move();
        robot.move();

        // 7. Crea una clase abstracta Appliance con méto-do turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        System.out.println("\nEjercicio 7");
        Appliance tv = new TV();
        Appliance wm = new WashingMachine();
        tv.turnOn();
        tv.turnOff();
        wm.turnOn();
        wm.turnOff();

        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        System.out.println("\nEjercicio 8");
        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        // 9. Crea una clase abstracta Document con el méto-do print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        System.out.println("\nEjercicio 9");
        Document pdf = new PDFDocument();
        Document word = new WordDocument();
        pdf.print();
        word.print();

        // 10. Crea una interfaz Payable con el méto-do pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        System.out.println("\nEjercicio 10");
        Payable invoice = new Invoice(150);
        Payable employee = new EmployeePayment("Eduardo", 60000);
        invoice.pay();
        employee.pay();

    }

    //1.
    public static abstract class Shape{
        public abstract double calculateArea();
    }
    public static class Circle extends Shape{
        private final double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        @Override
        public double calculateArea(){
            return Double.parseDouble(String.format("%.2f", Math.PI * radius * radius));
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
            return Double.parseDouble(String.format("%.2f", width * height));
        }
    }

    //2.
    public interface Playable{
        void play();
    }
    public static class Guitar implements Playable{
        //@Override
        public void play(){
            System.out.println("La guitarra tiene cuerdas");
        }
    }
    public static class Piano implements Playable{
        @Override
        public void play(){
            System.out.println("El piano tiene teclas");
        }
    }

    //3.
    public static abstract class Animal{
        abstract void makeSound();
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

    //4.
    public interface Drawable{
        void draw();
    }
    public static class CircleDraw implements Drawable{
        @Override
        public void draw(){
            System.out.println("El circulo se dibuja con una línea redonda");
        }
    }
    public static class SquareDraw implements Drawable{
        @Override
        public void draw(){
            System.out.println("El cuadrado se dibuja con cuatro líneas del mismo tamaño");
        }
    }
    public static class TriangleDraw implements Drawable{
        @Override
        public void draw(){
            System.out.println("El triángulo se dibuja con tres líneas del mismo tamaño");
        }
    }

    //5.
    public static abstract class Employee{
        Employee(double salaryPerHour){

        }
        abstract double calculateSalary();
    }
    public static class FullTimeEmployee extends Employee{
        double salaryPerHour;
        public FullTimeEmployee(double salaryPerHour){
            super(salaryPerHour);
            this.salaryPerHour = salaryPerHour;
        }
        @Override
        public double calculateSalary(){
            return salaryPerHour * 8 * 20;
        }
    }
    public static class PartTimeEmployee extends Employee{
        double salaryPerHour;
        public PartTimeEmployee(double salaryPerHour){
            super(salaryPerHour);
            this.salaryPerHour = salaryPerHour;
        }
        @Override
        public double calculateSalary(){
            return salaryPerHour * 4 * 20;
        }
    }

    //6.
    public interface Movable{
        void move();
    }
    public static class Car implements Movable{
        @Override
        public void move(){
            System.out.println("El auto se está moviendo por la autopista");
        }
    }
    public static class Robot implements Movable{
        @Override
        public void move(){
            System.out.println("El robot se mueve en busca de criminales");
        }
    }

    //7.
    public static abstract class Appliance{
        abstract void turnOn();
        abstract void turnOff();
    }
    public static class TV extends Appliance{
        @Override
        public void turnOn(){
            System.out.println("La TV se ha encendido");
        }
        @Override
        public void turnOff(){
            System.out.println("La TV se ha apagado");
        }
    }
    public static class WashingMachine extends Appliance{
        @Override
        public void turnOn(){
            System.out.println("La lavadora se ha encendido");
        }
        @Override
        public void turnOff(){
            System.out.println("La lavadora se ha apagado");
        }
    }

    //8.
    public interface Flyable{
        void fly();
    }
    public interface Swimmable{
        void swim();
    }
    public static class Duck implements Flyable, Swimmable{
        @Override
        public void fly(){
            System.out.println("El pato está volando");
        }
        @Override
        public void swim(){
            System.out.println("El pato está nadando");
        }
    }

    //9.
    public static abstract class Document{
        abstract void print();
    }
    public static class PDFDocument extends Document{
        @Override
        public void print(){
            System.out.println("El archivo PDF se imprime");
        }
    }
    public static class WordDocument extends Document{
        @Override
        public void print(){
            System.out.println("El archivo Word se imprime");
        }
    }

    //10.
    public interface Payable{
        void pay();
    }
    public static class Invoice implements Payable{
        private final double amount;
        public Invoice(double amount){
            this.amount = amount;
        }
        @Override
        public void pay(){
            System.out.println("Factura pagada por $" + amount);
        }
    }
    public static class EmployeePayment implements Payable{
        private final String name;
        private final double salary;
        public EmployeePayment(String name, double salary){
            this.name = name;
            this.salary = salary;
        }
        @Override
        public void pay(){
            System.out.println("El sueldo de " + name + " es de $" + salary);
        }
    }
}
