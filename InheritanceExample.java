// Multilevel Inheritance Example

// Grandparent Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent Class inherits from Animal (multilevel)
class Mammal extends Animal {
    public void sleep() {
        System.out.println("Mammal is Dead");
    }
}

// Child Class inherits from Mammal (multilevel)
class Dog extends Mammal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Hierarchical Inheritance Example

// Parent Class
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Child Class 1 inherits from Vehicle (hierarchical)
class Car extends Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

// Child Class 2 inherits from Vehicle (hierarchical)
class Truck extends Vehicle {
    public void haul() {
        System.out.println("Truck is hauling");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Demonstrating Multilevel Inheritance
        Dog dog = new Dog();
        dog.eat();     // From Animal
        dog.sleep();   // From Mammal
        dog.bark();    // From Dog

        // Demonstrating Hierarchical Inheritance
        Car car = new Car();
        car.start();   // From Vehicle
        car.drive();   // From Car
        car.stop();    // From Vehicle

        Truck truck = new Truck();
        truck.start(); // From Vehicle
        truck.haul();  // From Truck
        truck.stop();  // From Vehicle
    }
}
