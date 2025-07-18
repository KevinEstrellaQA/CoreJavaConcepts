package c08_oop;

public class AccessModifiersExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        Person person1 = new Person();
        person1.setName("Eduardo");
        person1.setAge(28);
        System.out.println("El nombre es " + person1.getName());
        System.out.println("La edad es " + person1.getAge());

        // 2. Crea una clase Product con el atributo privado price. Añade el méto-do setPrice(double price) que solo permita precios mayores a 0.
        Product product1 = new Product();
        product1.setPrice(159.99);
        System.out.println("El precio del producto es: " + product1.getPrice());
        product1.setPrice(-40);

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        BankAccount myAccount = new BankAccount(100);
        System.out.println("Saldo inicial: " + myAccount.getBalance());
        myAccount.deposit(50);
        myAccount.withdraw(75);
        myAccount.deposit(-50);
        myAccount.withdraw(100);

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el méto-do getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        Book book1 = new Book("1984");
        System.out.println("El título del libro es: " + book1.getTitle());

        // 5. Crea una clase Temperature con el atributo privado celsius. El méto-do setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.


        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el mto-do raiseSalary(double percent) que solo permita aumentos positivos.


        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el méto-do calculateArea() que devuelva el resultado de width * height.


        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.


        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).


    }

    public static class Person{
        private String name;
        private int age;

        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }

        public void setName(String name){
            if (name != null && !name.trim().isEmpty()){
                this.name = name;
            }else{
                System.out.println("El nombre no puede estar vacío");
            }

        }
        public void setAge(int age){
            if (age > 0 && age < 120){
                this.age = age;
            }else{
                System.out.println("Edad no válida");
            }

        }
    }

    public static class Product{
        private double price;

        public void setPrice(double price){
            if(price > 0){
                this.price = price;
                System.out.println("Precio actualizado a: " + price);
            }else{
                System.out.println("El precio no es válido");
            }
        }
        public double getPrice(){
            return price;
        }
    }

    public static class BankAccount{
        private double balance;

        public BankAccount(double balance){
            this.balance = balance;
        }

        public double getBalance(){
            return balance;
        }

        public void deposit(double amount){
            if(amount > 0){
                System.out.println("Depósito exitoso de $" + amount);
                System.out.println("Nuevo saldo: $" + (balance += amount));
            }else{
                System.out.println("Monto " + amount + " no permitido");
            }
        }
        public void withdraw(double amount){
            if(amount > 0 && amount <= balance){
                System.out.println("Retiro exitoso de $" + amount);
                System.out.println("Nuevo saldo: $" + (balance -= amount));
            }else if (amount > balance){
                System.out.println("Monto " + amount + " no permitido. Saldo insuficiente");
            }else{
                System.out.println("Monto " + amount + " no permitido");
            }
        }
    }

    public static class Book{
        private String title;

        public Book(String title){
            this.title = title;
        }

        public String getTitle(){
            return title;
        }
    }

}
