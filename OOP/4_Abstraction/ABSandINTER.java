
public class ABSandINTER {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.connect();
        phone.showStatus();
        phone.disconnect();
        phone.turnOff();
    }
}



// Interface
interface Connectable {
    void connect();
    void disconnect();
}

// Abstract class
abstract class Device {
    abstract void turnOn();
    abstract void turnOff();

    void showStatus() {
        System.out.println("Device status: OK");
    }
}

// Concrete class implementing interface and extending abstract class
class SmartPhone extends Device implements Connectable {
    public void turnOn() {
        System.out.println("SmartPhone is turning on");
    }

    public void turnOff() {
        System.out.println("SmartPhone is turning off");
    }

    public void connect() {
        System.out.println("SmartPhone is connecting to the network");
    }

    public void disconnect() {
        System.out.println("SmartPhone is disconnecting from the network");
    }
}

/*

SmartPhone is turning on
SmartPhone is connecting to the network
Device status: OK
SmartPhone is disconnecting from the network
SmartPhone is turning off

 */