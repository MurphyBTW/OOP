interface Engine {
    void startEngine();
    void stopEngine();
}
 
abstract class Vehicle implements Engine {
    protected boolean engineOn = false;
 
    abstract int getNumberOfWheels();
 
    void displayInfo() {
        System.out.println("Wheels: " + getNumberOfWheels());
        System.out.println("Engine: " + (engineOn ? "On" : "Off"));
    }
}
 
class Car extends Vehicle {
    int getNumberOfWheels() {
        return 4;
    }
 
    public void startEngine() {
        engineOn = true;
        System.out.println("Car engine started.");
    }
 
    public void stopEngine() {
        engineOn = false;
        System.out.println("Car engine stopped.");
    }
}
 
class Motorcycle extends Vehicle {
    int getNumberOfWheels() {
        return 2;
    }
 
    public void startEngine() {
        engineOn = true;
        System.out.println("Motorcycle engine started.");
    }
 
    public void stopEngine() {
        engineOn = false;
        System.out.println("Motorcycle engine stopped.");
    }
}
 
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
 
        testVehicle(car, "Car");
        testVehicle(motorcycle, "Motorcycle");
    }
 
    static void testVehicle(Vehicle vehicle, String name) {
        System.out.println(name + " Info:");
        vehicle.startEngine();
        vehicle.displayInfo();
        vehicle.stopEngine();
        vehicle.displayInfo();
        System.out.println();
    }
}