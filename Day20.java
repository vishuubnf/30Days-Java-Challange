// File Creation in java


// import java.io.File;
// import java.io.IOException;

// public class Day20 {
//     public static void main(String[] args) {
//         File file = new File("newfile.txt");
//         try {
//             if (file.createNewFile()) {
//                 System.out.println("File created: " + file.getName());
//             } else {
//                 System.out.println("File already exists.");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


// File writing in java


// import java.io.FileWriter;
// import java.io.IOException;

// public class Day20 {
//     public static void main(String[] args) {
//         try {
//             FileWriter writer = new FileWriter("newfile.txt");
//             writer.write("This is a sample text written to the file.");
//             writer.close();
//             System.out.println("Successfully wrote to the file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


// Deleting a file


// import java.io.File;

// public class Day20 {
//     public static void main(String[] args) {
//         File file = new File("newfile.txt");
//         if (file.delete()) {
//             System.out.println("Deleted the file: " + file.getName());
//         } else {
//             System.out.println("Failed to delete the file.");
//         }
//     }
// }


// Depreceiated annotation

// public class Day20 {
    
//     public static void main(String[] args) {
//         Day20 obj = new Day20();
//         obj.oldMethod();
//         obj.newMethod();
//     }

//     @Deprecated
//     public void oldMethod() {
//         System.out.println("This is a deprecated method.");
//     }

//     public void newMethod() {
//         System.out.println("This is a new method.");
//     }
// }


//Java program that generates the multiplication table of a given number and writes it to a file


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Day20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            FileWriter writer = new FileWriter("multiplication_table.txt");
            for (int i = 1; i <= 10; i++) {
                String tableEntry = number + " x " + i + " = " + (number * i) + "\n";
                writer.write(tableEntry);
            }
            writer.close();
            System.out.println("Multiplication table written to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
