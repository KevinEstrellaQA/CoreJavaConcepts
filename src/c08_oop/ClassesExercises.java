package c08_oop;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        Book myBook = new Book();
        myBook.title = "El Psicoanalista";
        myBook.author = "John Katzenbach";
        myBook.printingValues();

        // 2. Crea una clase Dog con un méto-do bark() que imprima su sonido.
        Dog myDog = new Dog();
        myDog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        Book myBook2 = new Book("1984", "George Orwell");
        myBook2.printingValues();

        // 4. Crea una clase Car con atributos brand y model y un méto-do showData().
        Car myCar = new Car("Tesla", "Model 3");
        myCar.displayInfo();

        // 5. Crea una clase Student con atributo score y un méto-do que diga si aprobó (mayor o igual a 60).
        Student student1 = new Student(76);
        student1.isApproved();

        // 6. Crea una clase BankAccount con atributo balance y un méto-do deposit() que sume el saldo.
        BankAccount myAccount = new BankAccount(2001, 500.50);
        myAccount.displayBalance();
        myAccount.deposit(-35);
        myAccount.displayBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el Área y el perímetro.
        Rectangle myRectangle = new Rectangle(10.5, 2.2);
        myRectangle.showCalculations();

        // 8. Crea una clase Worker que reciba nombre y salario, y un méto-do para mostrar su salario.
        Worker worker1 = new Worker("Eduardo", 40000);
        worker1.displayData();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Eduardo", 28));
        people.add(new Person("Laura", 35));
        people.add(new Person("Sergio", 13));
        System.out.println("Lista de personas:");
        for (Person person : people){
            person.sayHello();
        }

        // 10. Crea una clase Product y un méto-do que aplique un descuento sobre su precio.
        Product myProduct = new Product("Teclado", 300);
        myProduct.displayPrice();
        myProduct.discount(15);
        myProduct.displayPrice();

    }

    public static class Book{
        private String title;
        private String author;

        public Book(){

        }
        public Book (String title, String author){
            this.title = title;
            this.author = author;
        }

        public void printingValues(){
            System.out.println("El nombre del libro es '" + title + "' y el autor es " + author);
        }
    }

    public static class Dog{
        void bark(){
            System.out.println("El perro está ladrando");
        }
    }

    public static class Car{
        private final String brand;
        private final String model;

        public Car(String brand, String model){
            this.brand = brand;
            this.model = model;
        }
        void displayInfo(){
            System.out.println("El auto es " + brand + " y el modelo es " + model);
        }
    }

    public static class Student{
        private final int score;
        public Student(int score){
            this.score = score;
        }
        void isApproved(){
            if(score >= 60){
                System.out.println("El estudiante está aprobado");
            } else{
                System.out.println("El estudiante está reprobado");
            }
        }
    }

    public static class BankAccount{
        private final int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        void deposit(double amount){
            if (amount > 0){
                balance += amount;
                System.out.println("Depósito realizado. El nuevo saldo es " + balance);
            }else{
                System.out.println("Error, depósito no válido");
            }
        }
        void displayBalance(){
            System.out.println("El balance de la cuenta " + accountNumber + " es " + balance);
        }
    }

    public static class Rectangle{
        private double width, height;

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }
        public void showCalculations(){
            System.out.println("El triángulo tiene " + width + " como base y " + height + " como altura");
            System.out.println("El área del triángulo es " + area());
            System.out.println("El perímetro del triángulo es " + perimeter());
        }
        public double area (){
            return width * height;
        }
        public double perimeter(){
            return 2 * width * height;
        }
    }

    public static class Worker{
        private String name;
        private int salary;

        public Worker(String name, int salary){
            this.name = name;
            this.salary = salary;
        }
        public void displayData(){
            System.out.println("El nombre del trabajador es " + name + " y su salario es " + salary);
        }
    }

    public static class Person{
        private String name;
        private int age;

        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void sayHello(){
            System.out.println("Hola, soy " + name + " y tengo " + age + " años");
        }
    }

    public static class Product{
        private String product;
        private double price;

        public Product(String product, double price){
            this.product = product;
            this.price = price;
        }

        public void displayPrice(){
            System.out.println("El precio del producto '" + product + "' es " + price);
        }

        public void discount(int discount){
            if (discount >=0 && discount <=100){
                double discountPrice = (price * discount / 100);
                price -= discountPrice;
                System.out.println("Descuento del " + discount + "% aplicado");
            }else{
                System.out.println("El descuento debe estár entre 0 y 100");
            }
        }
    }

}
