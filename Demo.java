class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    Engine engine = new Engine();  // Directly creates Engine object

    void drive() {
        engine.start();
        System.out.println("Car is moving");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
