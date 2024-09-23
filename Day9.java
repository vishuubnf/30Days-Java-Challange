// Use of Private access specfier

// class MyEmployee {
//     private int id;
//     private String name;

//     public String getName() {
//         return name;
//     }

//     public void setName(String n) {
//         this.name = n;
//     }

//     public void setId(int i) {
//         this.id = i;
//     }

//     public int getId() {
//         return id;
//     }
// }

// public class Day9 {
//     public static void main(String agrs[]) {
//         MyEmployee jack = new MyEmployee();
//         jack.setName("Jack Guts");
//         System.out.println(jack.getName());
//     }
// }

 

// Use of contructors

// class MyMainEmployee{
//     private int id;
//     private String name;

//     public MyMainEmployee(){
//         id = 0;
//         name = "Jack Guts";
//     }
//     public MyMainEmployee(String myName, int myId){
//         id = myId;
//         name = myName;
//     }
//     public MyMainEmployee(String myName){
//         id = 1;
//         name = myName;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         this.name = n;
//     }
//     public void setId(int i){
//         this.id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         MyMainEmployee jack = new MyMainEmployee();

//         System.out.println(jack.getId());
//         System.out.println(jack.getName());
//     }
// }


// class Employee {
//     // First constructor
//         Employee(String s, int i){
//             System.out.println("The name of the first employee is : " + s);
//             System.out.println("The id of the first employee is : " + i);
//         }
//     //    Constructor overloaded
//         Employee(String s, int i, int salary){
//             System.out.println("The name of the second employee is : " + s);
//             System.out.println("The id of the second employee is : " + i);
//             System.out.println("The salary of second employee is : " + salary);
//         }
    
//     }
//     public class Day9 {
//         public static void main(String[] args) {
//             Employee shubham = new Employee("JACK",1);
//             Employee harry = new Employee("FREDDY",2,100000);
    
    
    
//         }
//     }
    
    // Deep Inheritance Cocepts Learning with its Type

    // Single level 
    // class Animal {
    //     void eat() {
    //         System.out.println("Eating...");
    //     }
    // }
    
    // class Dog extends Animal {
    //     void bark() {
    //         System.out.println("Barking...");
    //     }
    // }
    
    // public class Day9 {
    //     public static void main(String[] args) {
    //         Dog dog = new Dog();
    //         dog.eat();
    //         dog.bark();
    //     }
    // }
    
    // Multilevel Inheritance

    // class Animal {
    //     void eat() {
    //         System.out.println("Eating...");
    //     }
    // }
    
    // class Dog extends Animal {
    //     void bark() {
    //         System.out.println("Barking...");
    //     }
    // }
    
    // class Puppy extends Dog {
    //     void weep() {
    //         System.out.println("Weeping...");
    //     }
    // }
    
    // public class Day9 {
    //     public static void main(String[] args) {
    //         Puppy puppy = new Puppy();
    //         puppy.eat();
    //         puppy.bark();
    //         puppy.weep();
    //     }
    // }
    

// Hierarchical Inheritance

// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// class Cat extends Animal {
//     void meow() {
//         System.out.println("Meowing...");
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();
//         dog.bark();
        
//         Cat cat = new Cat();
//         cat.eat();
//         cat.meow();
//     }
// }


// Hybrid Inheritance

// interface Animal {
//     void eat();
// }

// interface Mammal {
//     void sleep();
// }

// class Dog implements Animal, Mammal {
//     public void eat() {
//         System.out.println("Eating...");
//     }
    
//     public void sleep() {
//         System.out.println("Sleeping...");
//     }

//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         Dog dog = new Dog();
//         dog.eat();
//         dog.sleep();
//         dog.bark();
//     }
// }


// Multiple Inheritance

// interface A {
//     void methodA();
// }

// interface B {
//     void methodB();
// }

// class C implements A, B {
//     public void methodA() {
//         System.out.println("Method A");
//     }
    
//     public void methodB() {
//         System.out.println("Method B");
//     }

//     void methodC() {
//         System.out.println("Method C");
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         C obj = new C();
//         obj.methodA();
//         obj.methodB();
//         obj.methodC();
//     }
// }


// Use of This Keyword

// class Student {
//     String name;
    
//     Student(String name) {
//         this.name = name;
//     }
    
//     void display() {
//         System.out.println("Student name: " + this.name);
//     }
// }

// public class Day9 {
//     public static void main(String[] args) {
//         Student s = new Student("John");
//         s.display();
//     }
// }


// Super Keyword

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Dog barks");
    }
}

public class Day9 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}


