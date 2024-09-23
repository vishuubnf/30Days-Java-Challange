// class custom_class {
//     int id;
//     String name;
// }

// public class Day8 {
//     public static void main(String[] Args) {
//         System.out.println("This is my first class in Java");
//         custom_class vishu = new custom_class();
//         vishu.id = 2300;
//         vishu.name = "Vishu";
//         System.out.println(vishu.id);
//         System.out.println(vishu.name);
//     }
// }


// class custom_class {
//     int id;
//     String name;
//     public void print_details(){
//         System.out.println("My Id Is : "+id);
//         System.out.println("My Name Is : "+name);

//     }
// }

// public class Day8 {
//     public static void main(String[] Args) {
//         System.out.println("This is my first class in Java");
//         custom_class vishu = new custom_class();
//         vishu.id = 2300;
//         vishu.name = "Vishu";
//         vishu.print_details();
//     }
// }



// class custom_class {
//     int id;
//     String name;
//     public void print_details(){
//         System.out.println("Employee Id Is : "+id);
//         System.out.println("Employee Name Is : "+name);

//     }
// }

// public class Day8 {
//     public static void main(String[] Args) {
//         System.out.println("This is my first class in Java");
//         custom_class motu = new custom_class();
//         custom_class patlu = new custom_class();
//         motu.id = 2300;
//         motu.name = "Motu";
//         patlu.id = 2400;
//         patlu.name = "Patlu";
//         motu.print_details();
//         patlu.print_details();
//     }
// }


// class custom_class {
//     int id;
//     String name;
//     int salary;
//     public void print_details(){
//         System.out.println("Employee Id Is : "+id);
//         System.out.println("Employee Name Is : "+name);
        
//     }
//     public int get_salary(){
//         return salary;
//     }
// }

// public class Day8 {
//     public static void main(String[] Args) {
//         System.out.println("This is my first class in Java");
//         custom_class motu = new custom_class();
//         custom_class patlu = new custom_class();
//         motu.id = 2300;
//         motu.name = "Motu";
//         motu.salary = 50000;
//         patlu.id = 2400;
//         patlu.name = "Patlu";
//         patlu.salary = 60000;
//         motu.print_details();
//         patlu.print_details();
//         int salary = patlu.get_salary();
//         System.out.println("Salary :"+salary);
//     }
// }




// class Tommy{
//     public void hit(){
//         System.out.println("Hitting the enemy");
//     }
//     public void run(){
//         System.out.println("Running from the enemy");
//     }
//     public void fire(){
//         System.out.println("Firing on the enemy");
//     }
// }

// public class Day8 {
//     public static void main(String[] args) {

//         Tommy player1 = new Tommy();
//         player1.fire();
//         player1.run();
//         player1.hit();


//     }
// }



// class Employee {

//     private int id;
//     private  String name;

//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name = n;
//     }
//     public void setId(int i){
//         id = i;
//     }
//     public int getId(){
//         return id;
//     }
// }

// public  class Day8 {
//     public static void main(String[] args) {
//         Employee emp1 = new Employee();

//         emp1.setName("Vishu");
//         System.out.println(emp1.getName());
//         emp1.setId(1);
//         System.out.println(emp1.getId());

//     }
// }


// Undestading Polymorphism

// class Animal {
//     public void sound() {
//         System.out.println("This is an animal sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("The dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("The cat meows");
//     }
// }

// public class Day8 {
//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();
//         Animal myDog = new Dog();
//         Animal myCat = new Cat();

//         myAnimal.sound();
//         myDog.sound();
//         myCat.sound();
//     }
// }



// Understading Abstraction


abstract class Animal {
    public abstract void sound();
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat meows");
    }
}

public class Day8 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();
        myCat.sound();
    }
}



// Understading Polymorphsim

// class Animal {
//     public void sound() {
//         System.out.println("This is an animal sound");
//     }
// }

// class Dog extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("The dog barks");
//     }
// }

// class Cat extends Animal {
//     @Override
//     public void sound() {
//         System.out.println("The cat meows");
//     }
// }

// public class Day8 {
//     public static void main(String[] args) {
//         Animal myAnimal = new Animal();
//         Animal myDog = new Dog();
//         Animal myCat = new Cat();

//         myAnimal.sound();
//         myDog.sound();
//         myCat.sound();
//     }
// }

// Understading Inheritance

// class Animal {
//     public void eat() {
//         System.out.println("This animal eats food.");
//     }
// }

// class Dog extends Animal {
//     public void bark() {
//         System.out.println("The dog barks.");
//     }
// }

// public class Day8 {
//     public static void main(String[] args) {
//         Dog myDog = new Dog();
//         myDog.eat();
//         myDog.bark();
//     }
// }
