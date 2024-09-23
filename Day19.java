// class Day19 {
//     public static void main(String[] args) {
//         Runnable r = new Runnable() {
//             public void run() {
//                 System.out.println("Anonymous class example");
//             }
//         };
//         Thread t = new Thread(r);
//         t.start();
//     }
// }

// class Day19 {
//     public static void main(String[] args) {
//         Animal animal = new Animal() {
//             void sound() {
//                 System.out.println("This is an anonymous class.");
//             }
//         };
//         animal.sound();
//     }
// }

// abstract class Animal {
//     abstract void sound();
// }

// Lamda Expression

// class Day19 {
//     public static void main(String[] args) {
//         Runnable r = () -> System.out.println("Lambda expression with Runnable");
//         Thread t = new Thread(r);
//         t.start();
//     }
// }


// import java.util.*;

// class Day19 {
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("Banana", "Apple", "Cherry");

//         Collections.sort(list, (a, b) -> a.compareTo(b));

//         System.out.println(list);
//     }
// }



//Example of Java Generics

// class Day19 {
//     public static void main(String[] args) {
//         GenericClass<Integer> intObj = new GenericClass<>(10);
//         GenericClass<String> stringObj = new GenericClass<>("Hello");

//         intObj.display();
//         stringObj.display();
//     }
// }

// class GenericClass<T> {
//     private T obj;

//     public GenericClass(T obj) {
//         this.obj = obj;
//     }

//     public void display() {
//         System.out.println("Value: " + obj);
//     }
// }


// File handling in java


import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class Day19 {
    public static void main(String[] args) {
        // Writing to a file
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, this is a file handling example!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from a file
        try (FileReader reader = new FileReader("example.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println("\nFile read successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
