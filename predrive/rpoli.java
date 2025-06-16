package predrive;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}


class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate runtime polymorphism
public class rpoli {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
