package predrive;
abstract class Geeks {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Geeks {
    void turnOn() {
        System.out.println("TV is turned ON.");
    }
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Geeks remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

