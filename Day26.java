//CHAPTER 8 PRACTICE SET
//QUESTION 1

// class Employee {
//     private int salary;
//     private String name;

//     public Employee(String name, int salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     public int getSalary() {
//         return salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String newName) {
//         this.name = newName;
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         Employee emp = new Employee("Vishva", 50000);
//         System.out.println(emp.getName());  
//         System.out.println(emp.getSalary()); 

//         emp.setName("Vishva Pratap Singh Sengar");
//         System.out.println(emp.getName());  
//     }
// }

//QUESTION 2


// class CellPhone {
//     public void ring() {
//         System.out.println("The phone is ringing...");
//     }

//     public void vibrate() {
//         System.out.println("The phone is vibrating...");
//     }

//     public void silent() {
//         System.out.println("The phone is in silent mode...");
//     }

//     public void call() {
//         System.out.println("Calling someone...");
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         CellPhone phone = new CellPhone();
//         phone.ring();
//         phone.vibrate();
//         phone.silent();
//         phone.call();
//     }
// }


//QUESTION 3


// class Square {
//     private int side;

//     public void setSide(int side) {
//         this.side = side;
//     }

//     public int getArea() {
//         return side * side;
//     }

//     public int getPerimeter() {
//         return 4 * side;
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         Square square = new Square();
//         square.setSide(5);
        
//         System.out.println("Area: " + square.getArea());      
//         System.out.println("Perimeter: " + square.getPerimeter());
//     }
// }


//QUESTION 4


// class Rectangle {
//     private int length;
//     private int breadth;

//     public void setSides(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }

//     public int getArea() {
//         return length * breadth;
//     }

//     public int getPerimeter() {
//         return 2 * (length + breadth);
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         Rectangle rectangle = new Rectangle();
//         rectangle.setSides(10, 5);
        
//         System.out.println("Area: " + rectangle.getArea());        
//         System.out.println("Perimeter: " + rectangle.getPerimeter()); 
//     }
// }


//QUESTION 5


// class TommyVercetti {
//     public void hit() {
//         System.out.println("Tommy is hitting...");
//     }

//     public void fire() {
//         System.out.println("Tommy is firing...");
//     }

//     public void run() {
//         System.out.println("Tommy is running...");
//     }

//     public void stealCar() {
//         System.out.println("Tommy is stealing a car...");
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         TommyVercetti tommy = new TommyVercetti();
//         tommy.hit();
//         tommy.fire();
//         tommy.run();
//         tommy.stealCar();
//     }
// }


//QUESTION 6


// class Circle {
//     private double radius;

//     public void setRadius(double radius) {
//         this.radius = radius;
//     }

//     public double getArea() {
//         return Math.PI * radius * radius;
//     }

//     public double getCircumference() {
//         return 2 * Math.PI * radius;
//     }
// }

// public class Day26 {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.setRadius(7);  
        
//         System.out.println("Area: " + circle.getArea());          
//         System.out.println("Circumference: " + circle.getCircumference()); 
//     }
// }
