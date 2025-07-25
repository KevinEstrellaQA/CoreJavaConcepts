package c08_oop;

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.on();
    }
    public static class Engine{
        public void on(){
            System.out.println("El motor está encendido");
        }
    }
    public static class Car{
        private final Engine engine = new Engine();
        public void on(){
            engine.on();
        }
    }
}
