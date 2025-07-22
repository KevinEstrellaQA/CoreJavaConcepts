package c08_oop;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un méto-do move(). Luego crea una subclase Car que herede de Vehicle y agrega el méto-do honk().
        System.out.println("Ejercicio 1.");
        Car myCar = new Car();
        myCar.move();
        myCar.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un méto-do study().
        System.out.println("\nEjercicio 2.");
        Person person = new Person("Kevin", 20);
        System.out.println("Persona: " + person.name + ", Edad: " + person.age);
        Student student = new Student("Eduardo", 28, 80);
        System.out.println("Estudiante: " + student.name + ", Edad: " + student.age + ", Calificación: " + student.grade);
        student.study();

        // 3. Crea una clase Animal con el méto-do makeSound(). Haz que Dog diga "Woof" y Cat diga "Meow" sobrescribiendo ese méto-do.
        System.out.println("\nEjercicio 3.");
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        System.out.println("\nEjercicio 4.");
        Employee employee = new Employee("Eduardo", 500);
        System.out.println("El empleado " + employee.name + ", tiene un sueldo de $" + employee.salary);
        Manager manager = new Manager("Kevin", 1250, "IT");
        System.out.println("El manager " + manager.name + ", tiene un sueldo de $" + manager.salary + ", y es del departamento '" + manager.department + "'");

        // 5. Crea una clase abstracta Shape con un méto-do calculateArea(). Luego implementa ese méto-do en Circle y Rectangle.
        System.out.println("\nEjercicio 5.");
        Shape circle = new Circle(3);
        System.out.println("El área del círculo es: " + circle.calculateArea());
        Shape rectangle = new Rectangle(10, 5);
        System.out.println("El área del rectángulo es: " + rectangle.calculateArea());

        // 6. Crea una clase Bird con el méto-do fly(). Luego crea Eagle que sobrescriba fly() pero también llame al méto-do original con super.fly().
        System.out.println("\nEjercicio 6.");
        Bird bird = new Bird();
        bird.fly();
        Eagle eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima "Device created". Luego crea Phone que herede de Device y en su constructor imprima "Phone ready".
        System.out.println("\nEjercicio 7.");
        Device device = new Device();
        Phone phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un méto-do addInterest().
        System.out.println("\nEjercicio 8.");
        Account account = new Account(300);
        account.deposit(-100);
        account.deposit(200);
        account.withdraw(1500);
        account.withdraw(450);
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(240);
        savingsAccount.withdraw(600);
        savingsAccount.addInterest();

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un méto-do describe() sobrescrito.
        System.out.println("\nEjercicio 9.");
        VehicleBase vehicle1 = new CarVehicle();
        VehicleBase vehicle2 = new BikeVehicle();
        VehicleBase vehicle3 = new TruckVehicle();
        vehicle1.describe();
        vehicle2.describe();
        vehicle3.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("\nEjercicio 10.");
        ArrayList<AnimalSound> animals = new ArrayList<>();
        animals.add(new DogSound());
        animals.add(new CatSound());
        animals.add(new BirdSound());
        for (AnimalSound animalSound : animals){
            animalSound.makeSound();
        }
    }
    //1.
    public static class Vehicle{
        public void move(){
            System.out.println("El vehículo se está moviendo");
        }
    }
    public static class Car extends Vehicle{
        public void honk(){
            System.out.println("El auto está pitando el claxón");
        }
    }

    //2.
    public static class Person{
        final protected String name;
        final protected int age;
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static class Student extends Person{
        final private int grade;
        public Student(String name, int age, int grade){
            super(name, age);
            this.grade = grade;
        }
        public void study(){
            System.out.println("El alumno " + name + " está estudiando");
        }
    }

    //3.
    public static class Animal{
        public void makeSound(){
            System.out.println("El animal está haciendo sonido");
        }
    }
    public static class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El perro hace " + "'Woof'");
        }
    }
    public static class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("El gato hace " + "'Meow'");
        }
    }

    //4.
    public static class Employee{
        final protected String name;
        final protected int salary;
        public Employee(String name, int salary){
            this.name = name;
            this.salary = salary;
        }
    }
    public static class Manager extends Employee{
        final private String department;
        public Manager(String name, int salary, String department){
            super(name, salary);
            this.department = department;
        }
    }

    //5.
    public static abstract class Shape{
        public abstract double calculateArea();
    }
    public static class Circle extends Shape{
        private final double radio;
        public Circle(double radio){
            this.radio = radio;
        }
        @Override
        public double calculateArea() {
            return (Math.PI * Math.pow(radio, 2));
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
        public double calculateArea() {
            return (width * height);
        }
    }

    //6.
    public static class Bird{
        public void fly(){
            System.out.println("El áve está volando");
        }
    }
    public static class Eagle extends Bird{
        @Override
        public void fly(){
            super.fly();
            System.out.println("El águila está volando");
        }
    }

    //7.
    public static class Device{
        public Device(){
            System.out.println("Device created");
        }
    }
    public static class Phone extends Device{
        public Phone(){
            super();
            System.out.println("Phone ready");
        }
    }

    //8.
    public static class Account{
        protected double balance;
        public Account(double balance){
            System.out.println("Cuenta aperturada con $" + balance);
            this.balance = balance;
        }
        public void deposit(double amount){
            if(amount > 0){
                balance += amount;
                System.out.println("Depósito exitoso de $" + amount + ". Nuevo saldo: $" + balance);
            }else{
                System.out.println("Error. Ingrese una cantidad válida");
            }
        }
        public void withdraw(double amount){
            if(amount < balance){
                balance -= amount;
                System.out.println("Retiro exitoso de $" + amount + ". Nuevo saldo: $" + balance);
            }else{
                System.out.println("Error. No cuentas con fondos suficientes");
            }
        }
    }
    public static class SavingsAccount extends Account{
        public SavingsAccount(double balance){
            super(balance);
        }
        public void addInterest(){
            balance += balance * 0.06;
            System.out.println("Intereses aplicados. Nuevo saldo: $" + balance);
        }
    }

    //9.
    public static abstract class VehicleBase{
        public abstract void describe();
    }
    public static class CarVehicle extends VehicleBase{
        @Override
        public void describe(){
            System.out.println("Soy un auto de 4 ruedas");
        }
    }
    public static class BikeVehicle extends VehicleBase{
        @Override
        public void describe(){
            System.out.println("Soy una moto de 2 ruedas");
        }
    }
    public static class TruckVehicle extends CarVehicle{
        @Override
        public void describe(){
            System.out.println("Soy un camión que transporta carga");
        }
    }

    //10
    public static abstract class AnimalSound{
        public abstract void makeSound();
    }
    public static class DogSound extends AnimalSound{
        public void makeSound(){
            System.out.println("El perro hace 'woof'");
        }
    }
    public static class CatSound extends AnimalSound{
        public void makeSound(){
            System.out.println("El gato hace 'meow'");
        }
    }
    public static class BirdSound extends AnimalSound{
        public void makeSound(){
            System.out.println("El pájaro hace 'tweet'");
        }
    }
}
