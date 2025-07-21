package dAbstraction;

public class interfaceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }
}
