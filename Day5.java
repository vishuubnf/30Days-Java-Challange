// public class Day5 {
//     public static void main(String[] args)
//      {
//         // For loop
//         System.out.println("For loop - Multiplication table of 2:");
//         for (int i = 1; i <= 10; i++) {
//             System.out.println("2 * " + i + " = " + (2 * i));
//         }

//         // While loop
//         System.out.println("\nWhile loop - Multiplication table of 3:");
//         int j = 1;
//         while (j <= 10) {
//             System.out.println("3 * " + j + " = " + (3 * j));
//             j++;
//         }

//         // Do-while loop
//         System.out.println("\nDo-while loop - Multiplication table of 4:");
//         int k = 1;
//         do {
//             System.out.println("4 * " + k + " = " + (4 * k));
//             k++;
//         } while (k <= 10);
//     }
// }




public class Day5 {
    public static void main(String[] args) {
        
        // Example of using break statement
        System.out.println("Break statement example:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;  // Exit the loop when i equals 6
            }
            System.out.println("Number: " + i);
        }

        // Example of using continue statement
        System.out.println("\nContinue statement example:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;  // Skip the current iteration if i is even
            }
            System.out.println("Odd number: " + i);
        }
    }
}
