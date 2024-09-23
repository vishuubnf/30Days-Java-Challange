// Interfaces

// interface Animal {
//     void sound();
//     void sleep();
// }

// class Dog implements Animal {
//     public void sound() {
//         System.out.println("Dog barks");
//     }

//     public void sleep() {
//         System.out.println("Dog sleeps");
//     }
// }

// public class Day11 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.sound();
//         dog.sleep();
//     }
// }


// interface Shape {
//     void draw();
// }

// class Circle implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Circle");
//     }
// }

// class Rectangle implements Shape {
//     public void draw() {
//         System.out.println("Drawing a Rectangle");
//     }
// }

// public class Day11 {
//     public static void main(String[] args) {
//         Shape circle = new Circle();
//         Shape rectangle = new Rectangle();
        
//         circle.draw();
//         rectangle.draw();
//     }
// }

// Interface with Default Method


// interface Vehicle {
//     void start();

//     default void fuelType() {
//         System.out.println("The vehicle uses petrol.");
//     }
// }

// class Car implements Vehicle {
//     public void start() {
//         System.out.println("Car starts");
//     }
// }

// class ElectricCar implements Vehicle {
//     public void start() {
//         System.out.println("Electric car starts");
//     }

//     public void fuelType() {
//         System.out.println("The vehicle uses electricity.");
//     }
// }

// public class Day11 {
//     public static void main(String[] args) {
//         Vehicle car = new Car();
//         Vehicle electricCar = new ElectricCar();
        
//         car.start();
//         car.fuelType();
        
//         electricCar.start();
//         electricCar.fuelType();
//     }
// }

//  Inheritance in Interfaces


interface Vehicle {
    void start();
}

interface FourWheeler extends Vehicle {
    void numberOfWheels();
}

class Car implements FourWheeler {
    public void start() {
        System.out.println("Car starts");
    }

    public void numberOfWheels() {
        System.out.println("Car has 4 wheels");
    }
}


 public class Day11 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.numberOfWheels();
    }
}

