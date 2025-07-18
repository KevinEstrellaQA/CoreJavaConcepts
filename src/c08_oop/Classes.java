package c08_oop;

public class Classes {

    public static void main(String[] args) {
        var person = new Person("Eduardo", -28, "123456789A");

        // person.name = "Eduardo";
        // person.age = 28;

        person.sayHello();

        person.name = "Eduardo Estrella";
        System.out.println(person.name);

        // person.id = "123456789A";

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("Rodolfo", 18, "123456789B");
        person2.sayHello();
    }
}
