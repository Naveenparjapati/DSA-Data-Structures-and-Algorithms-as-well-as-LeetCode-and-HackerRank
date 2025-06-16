package predrive;


class Car {
    // Private fields (attributes)
    private String make;
    private String model;
    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    // Getter for make
    public String getMake() {
        return make;
    }
    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }
    // Getter for model
    public String getModel() {
        return model;
    }
    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }
}

// Main class to demonstrate encapsulation
public class enlation {
    public static void main(String[] args) {
        // Create a new Car object
        Car myCar = new Car("Toyota", "Corolla");

        // Accessing the properties using getters
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());

        // Modifying the properties using setters
        myCar.setMake("Honda");
        myCar.setModel("Civic");

        // Displaying the updated properties
        System.out.println("Updated Make: " + myCar.getMake());
        System.out.println("Updated Model: " + myCar.getModel());
    }
}
