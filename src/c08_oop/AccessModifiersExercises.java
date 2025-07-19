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
        Temperature myTemp = new Temperature();
        System.out.println("La temperatura actual es " + myTemp.getCelsius());
        myTemp.setCelsius(35.50);
        myTemp.setCelsius(120);
        myTemp.setCelsius(-200);

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        User user1 = new User();
        user1.setUsername("Eduardo");
        user1.setPassword("MyPassword");
        System.out.println("Usuario: " + user1.getUsername());
        System.out.println("¿La contraseña es igual?: " + user1.checkPassword("MyPassword"));
        System.out.println("¿La contraseña es igual?: " + user1.checkPassword("My Password"));

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el méto-do raiseSalary(double percent) que solo permita aumentos positivos.
        Employee employee1 = new Employee();
        employee1.setSalary(1500);
        System.out.println("El salario del empleado es " + employee1.getSalary());
        employee1.raiseSalary(-1);
        employee1.raiseSalary(101);
        employee1.raiseSalary(25);
        System.out.println("El nuevo salario del empleado es " + employee1.getSalary());

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el méto-do calculateArea() que devuelva el resultado de width * height.
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(-12);
        rectangle1.setWidth(12);
        rectangle1.setHeight(-10);
        rectangle1.setHeight(10);
        System.out.println("El área del rectángulo es " + rectangle1.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        Student student1 = new Student();
        student1.setGrade(-3);
        student1.setGrade(85);
        System.out.println("¿El alumno con calificación " + student1.getGrade() + " aprobó?: " + student1.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        Car myCar = new Car();
        myCar.setSpeed(100);
        System.out.println("Velocidad inicial configurada a " + myCar.getSpeed() + "Km/Hr");
        myCar.acelerate(10);
        myCar.acelerate(15);
        myCar.breakPedal(45);
        myCar.breakPedal(80);

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

    public static class Temperature{
        private double celsius;

        public double getCelsius(){
            return celsius;
        }
        public void setCelsius(double celsius){
            if (celsius >= -100 && celsius <= 100){
                this.celsius = celsius;
                System.out.println("Temperatura establecida a " + celsius);
            }else {
                System.out.println("La temperatura debe estár entre -100 y 100");
            }
        }
    }

    public static class User{
        private String username;
        private String password;

        public void setUsername(String username){
            if(username != null && username.length() >= 3){
                this.username = username;
            }else{
                System.out.println("El usuario debe tener al menos 3 caracteres");
            }
        }
        public void setPassword(String password){
            if(password != null && password.length() >= 8){
                this.password = password;
            }else{
                System.out.println("La contraseña debe contener el menos 8 caracteres");
            }
        }
        public String getUsername(){
            return username;
        }

        public boolean checkPassword(String inputPassword){
            return password.equals(inputPassword);
        }
    }

    public static class Employee{
        private double salary;

        public double getSalary(){
            return salary;
        }
        public void setSalary(double salary){
            this.salary = salary;
        }

        public void raiseSalary(double percent){
            if(percent > 0 && percent <= 100){
                salary += salary * percent / 100;
            }else{
                System.out.println("Porcentaje no válido");
            }
        }
    }

    public static class Rectangle{
        private double width;
        private double height;

        public void setWidth(double width){
            if(width > 0){
                this.width = width;
                System.out.println("Valor 'base' asignado: " + width);
            }else {
                System.out.println("El valor 'base' debe ser mayor a cero");
            }
        }
        public void setHeight(double height){
            if(height > 0){
                this.height = height;
                System.out.println("Valor 'altura' asignado: " + height);
            }else {
                System.out.println("El valor 'altura' debe ser mayor a cero");
            }
        }

        public double calculateArea(){
            return width * height;
        }
    }

    public static class Student{
        private int grade;

        public int getGrade() {
            return grade;
        }
        public void setGrade(int grade) {
            if(grade > 0 && grade <= 100){
                this.grade = grade;
            }else{
                System.out.println("La calificación debe estar entre 0 y 100");
            }
        }

        public boolean isPassed(){
            return grade >= 60 && grade <= 100;
        }
    }

    public static class Car{
        private int speed;

        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            if(speed > 0 && speed <= 120){
                this.speed = speed;
            }else {
                System.out.println("La velocidad debe estar entre 0 y 120 Km/Hr");
            }
        }

        public void acelerate(int speed){
            if(this.speed + speed > 120){
                System.out.println("La velocidad no puede ser mayor a 120Km/Hr");
            }else{
                System.out.println("Velocidad aumentada " + speed + "Km/Hr");
                this.speed += speed;
                System.out.println("Velocidad actualizada a " + this.speed + "Km/Hr");
            }
        }
        public void breakPedal(int speed){
            if(this.speed - speed < 0){
                System.out.println("La velocidad no puede ser menor a 0Km/Hr");
            }else{
                System.out.println("Velocidad decrementada " + speed + "Km/Hr");
                this.speed -= speed;
                System.out.println("Velocidad actualizada a " + this.speed + "Km/Hr");
            }
        }
    }

}
