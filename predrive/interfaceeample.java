package predrive;

public class interfaceeample {
    // Interface
    interface Animal {
        void animalSound(); // interface method (does not have a body)
        void sleep(); // interface method (does not have a body)
    }

    // Pig "implements" the Animal interface
    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }

    // Main class to run the program
    public static void main(String[] args) {
        interfaceeample example = new interfaceeample(); // Create an instance of the outer class
        Pig myPig = example.new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}