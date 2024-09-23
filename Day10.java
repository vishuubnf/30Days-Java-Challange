// Method overriding

// class A {
//     public int a = 10;

//     public int check() {
//         return 1;
//     }

//     public void garyy() {
//         System.out.println("This is method is overriding A");
//     }
// }

// class B extends A {
//     @Override
//     public void garyy() {
//         System.out.println("This is method is overriding B");
//     }

//     public void jerry() {
//         System.out.println("This is not method overriding");
//     }
// }

// public class Day10 {
//     public static void main(String args[]) {
//         A obj = new A();
//         obj.garyy();
//         B obj1 = new B();
//         obj1.garyy();
//     }
// }


// Method Overriding with Constructor

// class Vehicle {
//     void run() {
//         System.out.println("Vehicle is running");
//     }
// }

// class Bike extends Vehicle {
//     void run() {
//         System.out.println("Bike is running safely");
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         Bike myBike = new Bike();
//         myBike.run();
//     }
// }


//Dynamic Dispatch Example

// class Animal {
//     void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         Animal myAnimal;
//         myAnimal = new Dog();
//         myAnimal.sound();

//         myAnimal = new Cat();
//         myAnimal.sound();
//     }
// }

//Dynamic Dispatch Example

// class Bank {
//     double getInterestRate() {
//         return 0.0;
//     }
// }

// class SBI extends Bank {
//     double getInterestRate() {
//         return 5.5;
//     }
// }

// class HDFC extends Bank {
//     double getInterestRate() {
//         return 6.0;
//     }
// }

// class ICICI extends Bank {
//     double getInterestRate() {
//         return 6.5;
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         Bank bank;

//         bank = new SBI();
//         System.out.println("SBI Interest Rate: " + bank.getInterestRate() + "%");

//         bank = new HDFC();
//         System.out.println("HDFC Interest Rate: " + bank.getInterestRate() + "%");

//         bank = new ICICI();
//         System.out.println("ICICI Interest Rate: " + bank.getInterestRate() + "%");
//     }
// }


// Use of abstract classes

// abstract class Animal {
//     abstract void sound();

//     void sleep() {
//         System.out.println("This animal is sleeping");
//     }
// }

// class Dog extends Animal {
//     void sound() {
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         Animal myDog = new Dog();
//         myDog.sound();
//         myDog.sleep();

//         Animal myCat = new Cat();
//         myCat.sound();
//         myCat.sleep();
//     }
// }



// Use of abstract classes

// abstract class Shape {
//     abstract void draw();  // Abstract method with no body

//     void info() {
//         System.out.println("This is a shape");
//     }
// }

// class Circle extends Shape {
//     void draw() {
//         System.out.println("Drawing a circle");
//     }
// }

// class Rectangle extends Shape {
//     void draw() {
//         System.out.println("Drawing a rectangle");
//     }
// }

// public class Day10 {
//     public static void main(String[] args) {
//         Shape shape;

//         shape = new Circle();
//         shape.draw();
//         shape.info();

//         shape = new Rectangle();
//         shape.draw();
//         shape.info();
//     }
// }

